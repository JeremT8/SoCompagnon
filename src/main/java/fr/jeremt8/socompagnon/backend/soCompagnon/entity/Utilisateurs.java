package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;

    private String nomUtilisateur;

    private String prenomUtilisateur;

    private Date dateDeNaissanceUtilisateur;

    private int tailleUtilisateur;

    private int poidsUtilisateur;

    private int numeroLicence;

    private String photoUtilisateur;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Adresses adresses;

    @OneToMany
    private List<Contacts> contact;

    @OneToMany
    private List<Clubs> club;


    @ManyToMany
    @JoinTable(name = "UtilisateurComposition",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idComposition"))
    private List<Compositions> composition;

    @ManyToMany
    @JoinTable(name = "UtilisateurEntrainement",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idEntrainement"))
    private List<Entrainements> entrainement;

    @ManyToMany
    @JoinTable(name = "UtilisateurRole",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idRole"))
    private List<Roles> role;

    @ManyToMany
    @JoinTable(name = "UtilisateurPoste",
            joinColumns = @JoinColumn(name = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "idPoste"))
    private List<Postes> poste;



}
