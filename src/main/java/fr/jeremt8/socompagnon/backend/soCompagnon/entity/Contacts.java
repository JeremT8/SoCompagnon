package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;

    private String emailContact;

    private String numeroContact;

    @ManyToOne
    private Utilisateurs utilisateur;

    @OneToOne
    private Clubs club;

    public Contacts(String emailContact, String numeroContact, Utilisateurs utilisateur, Clubs club) {
        this.emailContact = emailContact;
        this.numeroContact = numeroContact;
        this.utilisateur = utilisateur;
        this.club = club;
    }

    public Contacts() {

    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public String getNumeroContact() {
        return numeroContact;
    }

    public void setNumeroContact(String numeroContact) {
        this.numeroContact = numeroContact;
    }

    public Utilisateurs getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateurs utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Clubs getClub() {
        return club;
    }

    public void setClub(Clubs club) {
        this.club = club;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacts{");
        sb.append("idContact=").append(idContact);
        sb.append(", emailContact='").append(emailContact).append('\'');
        sb.append(", numeroContact='").append(numeroContact).append('\'');
        sb.append(", utilisateur=").append(utilisateur);
        sb.append(", club=").append(club);
        sb.append('}');
        return sb.toString();
    }
}
