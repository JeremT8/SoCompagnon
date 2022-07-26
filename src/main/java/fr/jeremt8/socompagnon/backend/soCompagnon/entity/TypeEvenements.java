package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class TypeEvenements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeEvenement;

    private String labelTypeEvenement;

    @ManyToOne
    private Evenements evenement;
}
