package com.hendisantika.repository;

import com.hendisantika.entity.Departement;
import com.hendisantika.entity.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepo extends JpaRepository<Departement, Long> {
}
