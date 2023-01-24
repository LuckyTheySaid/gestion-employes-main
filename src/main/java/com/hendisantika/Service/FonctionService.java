package com.hendisantika.Service;


import com.hendisantika.dto.FonctionCountDTO;
import com.hendisantika.entity.Fonction;
import com.hendisantika.repository.FonctionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FonctionService {

    @Autowired
    private FonctionRepo repo;

    public List<Fonction> listAll() {

        return repo.findAll();
    }
    public void save(Fonction fct) {

        repo.save(fct);
    }

    public void delete(long id) {

        repo.deleteById(id);
    }
    public Integer fonctioncout() {

        return repo.getcountfonction();
    }
    public List<FonctionCountDTO> getFonctionCounts() {
        return repo.getFonctionCounts();
    }


}
