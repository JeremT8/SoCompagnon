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

    public Clubs(String nomClub, int anneeDeCreationClub, int nbEquipeClub, String numeroAffiliationClub, Utilisateurs utilisateur, Contacts contact, Evenements evenement, Entrainements entrainement) {
        this.nomClub = nomClub;
        this.anneeDeCreationClub = anneeDeCreationClub;
        this.nbEquipeClub = nbEquipeClub;
        this.numeroAffiliationClub = numeroAffiliationClub;
        this.utilisateur = utilisateur;
        this.contact = contact;
        this.evenement = evenement;
        this.entrainement = entrainement;
    }

    public Clubs() {

    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public int getAnneeDeCreationClub() {
        return anneeDeCreationClub;
    }

    public void setAnneeDeCreationClub(int anneeDeCreationClub) {
        this.anneeDeCreationClub = anneeDeCreationClub;
    }

    public int getNbEquipeClub() {
        return nbEquipeClub;
    }

    public void setNbEquipeClub(int nbEquipeClub) {
        this.nbEquipeClub = nbEquipeClub;
    }

    public String getNumeroAffiliationClub() {
        return numeroAffiliationClub;
    }

    public void setNumeroAffiliationClub(String numeroAffiliationClub) {
        this.numeroAffiliationClub = numeroAffiliationClub;
    }

    public Utilisateurs getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateurs utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public Evenements getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenements evenement) {
        this.evenement = evenement;
    }

    public Entrainements getEntrainement() {
        return entrainement;
    }

    public void setEntrainement(Entrainements entrainement) {
        this.entrainement = entrainement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Clubs{");
        sb.append("idClub=").append(idClub);
        sb.append(", nomClub='").append(nomClub).append('\'');
        sb.append(", anneeDeCreationClub=").append(anneeDeCreationClub);
        sb.append(", nbEquipeClub=").append(nbEquipeClub);
        sb.append(", numeroAffiliationClub='").append(numeroAffiliationClub).append('\'');
        sb.append(", utilisateur=").append(utilisateur);
        sb.append(", contact=").append(contact);
        sb.append(", evenement=").append(evenement);
        sb.append(", entrainement=").append(entrainement);
        sb.append('}');
        return sb.toString();
    }
}
