package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class TypeEntrainements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeEntrainement;

    private String labelEntrainement;

    private String imageEntrainement;

    @ManyToOne
    private Entrainements entrainement;
}
