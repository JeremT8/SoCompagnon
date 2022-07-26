package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Evenements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvenement;

    private String labelEvenement;

    private Date dateDebutEvenement;

    private Date dateFinEvenement;

}
