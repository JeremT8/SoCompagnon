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

    public Evenements() {

    }

    public Evenements(String labelEvenement, Date dateDebutEvenement, Date dateFinEvenement, List<Clubs> club, List<TypeEvenements> typeEvenement) {
        this.labelEvenement = labelEvenement;
        this.dateDebutEvenement = dateDebutEvenement;
        this.dateFinEvenement = dateFinEvenement;
        this.club = club;
        this.typeEvenement = typeEvenement;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getLabelEvenement() {
        return labelEvenement;
    }

    public void setLabelEvenement(String labelEvenement) {
        this.labelEvenement = labelEvenement;
    }

    public Date getDateDebutEvenement() {
        return dateDebutEvenement;
    }

    public void setDateDebutEvenement(Date dateDebutEvenement) {
        this.dateDebutEvenement = dateDebutEvenement;
    }

    public Date getDateFinEvenement() {
        return dateFinEvenement;
    }

    public void setDateFinEvenement(Date dateFinEvenement) {
        this.dateFinEvenement = dateFinEvenement;
    }

    public List<Clubs> getClub() {
        return club;
    }

    public void setClub(List<Clubs> club) {
        this.club = club;
    }

    public List<TypeEvenements> getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(List<TypeEvenements> typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Evenements{");
        sb.append("idEvenement=").append(idEvenement);
        sb.append(", labelEvenement='").append(labelEvenement).append('\'');
        sb.append(", dateDebutEvenement=").append(dateDebutEvenement);
        sb.append(", dateFinEvenement=").append(dateFinEvenement);
        sb.append(", club=").append(club);
        sb.append(", typeEvenement=").append(typeEvenement);
        sb.append('}');
        return sb.toString();
    }
}
