package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClub;

    private String nomClub;

    private int anneeDeCreationClub;

    private int nbEquipeClub;

    private String numeroAffiliationClub;

}
