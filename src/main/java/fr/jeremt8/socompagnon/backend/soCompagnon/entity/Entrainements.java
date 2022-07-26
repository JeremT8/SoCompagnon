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

    public Entrainements(String labelEntrainement, Date dateDebutEntrainement, Date dateFinEntrainement, Boolean visibiliteEntrainement, List<Utilisateurs> utilisateur, List<Clubs> club, List<TypeEntrainements> typeEntrainement) {
        this.labelEntrainement = labelEntrainement;
        this.dateDebutEntrainement = dateDebutEntrainement;
        this.dateFinEntrainement = dateFinEntrainement;
        this.visibiliteEntrainement = visibiliteEntrainement;
        this.utilisateur = utilisateur;
        this.club = club;
        this.typeEntrainement = typeEntrainement;
    }

    public Entrainements() {

    }

    public int getIdEntrainement() {
        return idEntrainement;
    }

    public void setIdEntrainement(int idEntrainement) {
        this.idEntrainement = idEntrainement;
    }

    public String getLabelEntrainement() {
        return labelEntrainement;
    }

    public void setLabelEntrainement(String labelEntrainement) {
        this.labelEntrainement = labelEntrainement;
    }

    public Date getDateDebutEntrainement() {
        return dateDebutEntrainement;
    }

    public void setDateDebutEntrainement(Date dateDebutEntrainement) {
        this.dateDebutEntrainement = dateDebutEntrainement;
    }

    public Date getDateFinEntrainement() {
        return dateFinEntrainement;
    }

    public void setDateFinEntrainement(Date dateFinEntrainement) {
        this.dateFinEntrainement = dateFinEntrainement;
    }

    public Boolean getVisibiliteEntrainement() {
        return visibiliteEntrainement;
    }

    public void setVisibiliteEntrainement(Boolean visibiliteEntrainement) {
        this.visibiliteEntrainement = visibiliteEntrainement;
    }

    public List<Utilisateurs> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateurs> utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Clubs> getClub() {
        return club;
    }

    public void setClub(List<Clubs> club) {
        this.club = club;
    }

    public List<TypeEntrainements> getTypeEntrainement() {
        return typeEntrainement;
    }

    public void setTypeEntrainement(List<TypeEntrainements> typeEntrainement) {
        this.typeEntrainement = typeEntrainement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrainements{");
        sb.append("idEntrainement=").append(idEntrainement);
        sb.append(", labelEntrainement='").append(labelEntrainement).append('\'');
        sb.append(", dateDebutEntrainement=").append(dateDebutEntrainement);
        sb.append(", dateFinEntrainement=").append(dateFinEntrainement);
        sb.append(", visibiliteEntrainement=").append(visibiliteEntrainement);
        sb.append(", utilisateur=").append(utilisateur);
        sb.append(", club=").append(club);
        sb.append(", typeEntrainement=").append(typeEntrainement);
        sb.append('}');
        return sb.toString();
    }
}
