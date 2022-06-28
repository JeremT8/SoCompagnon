package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.Date;

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



}
