package com.gestemployesDFM.repository;

import com.gestemployesDFM.entity.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibiliteRepo extends JpaRepository<Disponibilite, Long> {
}
