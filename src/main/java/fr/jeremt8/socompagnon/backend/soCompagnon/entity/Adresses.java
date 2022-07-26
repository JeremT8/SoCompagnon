package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdresse;

    private String labelAdresse;

    private String codePostaleAdresse;

    private String villeAdresse;


}
