package com.gestemployesDFM.dto;

public class FonctionCountDTO {
    private String libelle;
    private Long count;

    public FonctionCountDTO(String libelle, Long count) {
        this.libelle = libelle;
        this.count = count;
    }

    public String getLibelle() {

        return libelle;
    }

    public void setLibelle(String libelle) {

        this.libelle = libelle;
    }

    public Long getCount() {

        return count;
    }

    public void setCount(Long count) {

        this.count = count;
    }
}