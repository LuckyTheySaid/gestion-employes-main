package com.gestemployesDFM.repository;

import com.gestemployesDFM.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepo extends JpaRepository<Employer, Long> {
   @Query("SELECT count(s) FROM Employer s WHERE  s.disponibilite.code=1")
   Integer getdisponibleemp();
   @Query("SELECT count(s) FROM Employer s WHERE  s.disponibilite.code=2")
   Integer getindisponibleemp();
   }
