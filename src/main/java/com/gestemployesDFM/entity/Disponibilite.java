package com.gestemployesDFM.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Disponibilite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long code;

    @Column(nullable = false,unique = true)
    private String libelle;

}
