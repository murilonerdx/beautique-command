package com.murilonerdx.beautique.repositories;

import com.murilonerdx.beautique.entities.BeautyProceduresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeautyProcedureRepository extends JpaRepository<BeautyProceduresEntity,Long> {
}
