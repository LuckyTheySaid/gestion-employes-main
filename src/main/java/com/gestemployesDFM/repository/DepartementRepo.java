package com.gestemployesDFM.repository;

import com.gestemployesDFM.dto.DepartementCountDTO;
import com.gestemployesDFM.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartementRepo extends JpaRepository<Departement, Long> {
    @Query("SELECT new com.gestemployesDFM.dto.DepartementCountDTO(d.libelle, COUNT(e.id)) FROM Departement d LEFT JOIN Employer e ON d.code = e.departement.code GROUP BY d.libelle ORDER BY COUNT(e.id) DESC")
    List<DepartementCountDTO> getDepartementcount();
}
