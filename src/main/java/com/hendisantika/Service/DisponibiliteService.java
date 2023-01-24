package com.hendisantika.Service;

import com.hendisantika.entity.Disponibilite;
import com.hendisantika.repository.DisponibiliteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisponibiliteService {

    @Autowired
    private DisponibiliteRepo repo;

    public List<Disponibilite> listAll() {

        return repo.findAll();
    }
}
