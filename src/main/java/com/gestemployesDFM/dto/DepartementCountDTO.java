package com.gestemployesDFM.dto;

public class DepartementCountDTO {
    private String libelle;
    private Long count;

    public DepartementCountDTO(String libelle, Long count) {
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
