package com.gestemployesDFM.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity
public class Employer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String NumBadge;
    @Column(nullable = false)
    private String CINE;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date_naissance;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNumBadge() {

        return NumBadge;
    }

    public void setNumBadge(String numBadge) {

        NumBadge = numBadge;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public Fonction getFonction() {

        return fonction;
    }

    public void setFonction(Fonction fonction) {

        this.fonction = fonction;
    }

    public String getCINE() {
        return CINE;
    }

    public void setCINE(String CINE) {
        this.CINE = CINE;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Disponibilite getDisponibilite() {

        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {

        this.disponibilite = disponibilite;
    }

    @OneToOne
    private Fonction fonction;
    @OneToOne
    private Departement departement;
    @ManyToOne
    private Disponibilite disponibilite;

}
