package com.gestemployesDFM.Service;


import com.gestemployesDFM.dto.FonctionCountDTO;
import com.gestemployesDFM.entity.Fonction;
import com.gestemployesDFM.repository.FonctionRepo;
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
