package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;

    private String emailContact;

    private String numeroContact;

    @ManyToOne
    private Utilisateurs utilisateur;

    @OneToOne
    private Clubs club;
}
