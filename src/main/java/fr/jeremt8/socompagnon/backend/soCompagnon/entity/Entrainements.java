package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Entrainements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrainement;

    private String labelEntrainement;

    private Date dateDebutEntrainement;

    private Date dateFinEntrainement;

    private Boolean visibiliteEntrainement;



}
