package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Entrainements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrainement;

    private String labelEntrainement;

    private Date dateDebutEntrainement;

    private Date dateFinEntrainement;

    private Boolean visibiliteEntrainement;

    @ManyToMany
    @JoinTable(name = "UtilisateurEntrainement",
            joinColumns = @JoinColumn (name = "idEntrainement"),
            inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private List<Utilisateurs> utilisateur;

    @OneToMany
    private List<Clubs> club;

    @OneToMany
    private List<TypeEntrainements> typeEntrainement;



}
