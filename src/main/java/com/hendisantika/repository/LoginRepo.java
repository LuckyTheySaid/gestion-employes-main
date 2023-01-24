package com.hendisantika.repository;

import com.hendisantika.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepo extends JpaRepository<Login, Integer> {
    @Query("SELECT u FROM Login u WHERE u.username = ?1")
    public Login findByUsername(String username);

}
