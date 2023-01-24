package com.hendisantika.repository;

import com.hendisantika.dto.FonctionCountDTO;
import com.hendisantika.entity.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FonctionRepo extends JpaRepository<Fonction, Long> {

    @Query("SELECT count(f) FROM Fonction f")
    Integer getcountfonction();
   /* @Query("SELECT f.libelle, COUNT(e.id) as count FROM Fonction f LEFT JOIN Employer e ON f.code = e.fonction.code GROUP BY f.libelle")
    List<Fonction> getempcountbyfon();*/
   @Query("SELECT new com.hendisantika.dto.FonctionCountDTO(f.libelle, COUNT(e.id)) FROM Fonction f LEFT JOIN Employer e ON f.code = e.fonction.code GROUP BY f.libelle ORDER BY COUNT(e.id) DESC")
   List<FonctionCountDTO> getFonctionCounts();
}
