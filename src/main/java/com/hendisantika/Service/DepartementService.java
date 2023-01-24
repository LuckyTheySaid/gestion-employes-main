package com.hendisantika.Service;

import com.hendisantika.entity.Departement;
import com.hendisantika.entity.Disponibilite;
import com.hendisantika.repository.DepartementRepo;
import com.hendisantika.repository.DisponibiliteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    private DepartementRepo drepo;

    public List<Departement> listAll() {

        return drepo.findAll();
    }
}
