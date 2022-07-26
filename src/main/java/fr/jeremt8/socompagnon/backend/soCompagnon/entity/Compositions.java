package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compositions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComposition;

    private String labelComposition;

    private String imageComposition;

    private Boolean visibiliteComposition;


    @ManyToMany
    @JoinTable(name = "UtilisateurComposition",
            joinColumns = @JoinColumn (name = "idComposition"),
            inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private List<Utilisateurs> utilisateur;

    @OneToMany
    private List<Tactiques> tactique;
}
