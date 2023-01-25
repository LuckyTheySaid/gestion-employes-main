package com.gestemployesDFM.Service;

import com.gestemployesDFM.entity.Employer;
import com.gestemployesDFM.repository.EmployerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerService {
    @Autowired
    private EmployerRepo repo;
    public List<Employer> listAll() {

        return repo.findAll();
    }

    public void save(Employer emp) {

        repo.save(emp);
    }

    public Integer demp() {

        return repo.getdisponibleemp();
    }
    public Integer indemp() {

        return repo.getindisponibleemp();
    }
    public void delete(long id) {

        repo.deleteById(id);
    }
    public Optional<Employer> get(long id) {
        return repo.findById(id);
    }













}

