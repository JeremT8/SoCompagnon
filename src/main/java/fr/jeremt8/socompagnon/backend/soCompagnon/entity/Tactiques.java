package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class Tactiques {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTactique;

    private String labelTactique;

    private String imageTactique;

    @ManyToOne
    private Compositions composition;
}
