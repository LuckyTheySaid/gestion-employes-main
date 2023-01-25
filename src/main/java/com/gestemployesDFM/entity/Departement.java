package com.gestemployesDFM.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long code;
    @Column(nullable = false,unique = true)
    private String libelle;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
