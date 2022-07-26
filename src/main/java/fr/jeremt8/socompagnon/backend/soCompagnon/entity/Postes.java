package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Postes {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPoste;

    private String labelPoste;

    @ManyToMany
    @JoinTable(name = "UtilisateurPoste",
            joinColumns = @JoinColumn (name = "idPoste"),
            inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private List<Utilisateurs> utilisateur;
}
