package com.murilonerdx.beautique.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "appointments")
public class AppointmentEntity extends BaseEntity{

	@Column(nullable = false, updatable = true)
	private LocalDateTime dateTime;

	@Column(nullable = false)
	private Boolean appointmentsOpen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = true)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private CustomerEntity customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "beauty_procedure_id", nullable = true)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private BeautyProceduresEntity beautyProcedure;

}
