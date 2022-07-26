package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class Clubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClub;

    private String nomClub;

    private int anneeDeCreationClub;

    private int nbEquipeClub;

    private String numeroAffiliationClub;

    @ManyToOne
    private Utilisateurs utilisateur;

    @OneToOne
    private Contacts contact;

    @ManyToOne
    private Evenements evenement;

    @ManyToOne
    private Entrainements entrainement;

}
