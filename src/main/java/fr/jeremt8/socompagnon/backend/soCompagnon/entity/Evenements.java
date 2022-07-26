package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Evenements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvenement;

    private String labelEvenement;

    private Date dateDebutEvenement;

    private Date dateFinEvenement;

    @OneToMany
    private List<Clubs> club;

    @OneToMany
    private List<TypeEvenements> typeEvenement;

}
