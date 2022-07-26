package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compositions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComposition;

    private String labelComposition;

    private String imageComposition;

    private Boolean visibiliteComposition;

}
