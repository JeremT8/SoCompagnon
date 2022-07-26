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

    public Utilisateurs() {
    }
    public Utilisateurs(String nomUtilisateur, String prenomUtilisateur, Date dateDeNaissanceUtilisateur, int tailleUtilisateur, int poidsUtilisateur, int numeroLicence, String photoUtilisateur, Adresses adresses, List<Contacts> contact, List<Clubs> club, List<Compositions> composition, List<Entrainements> entrainement, List<Roles> role, List<Postes> poste) {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.dateDeNaissanceUtilisateur = dateDeNaissanceUtilisateur;
        this.tailleUtilisateur = tailleUtilisateur;
        this.poidsUtilisateur = poidsUtilisateur;
        this.numeroLicence = numeroLicence;
        this.photoUtilisateur = photoUtilisateur;
        this.adresses = adresses;
        this.contact = contact;
        this.club = club;
        this.composition = composition;
        this.entrainement = entrainement;
        this.role = role;
        this.poste = poste;
    }




    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public Date getDateDeNaissanceUtilisateur() {
        return dateDeNaissanceUtilisateur;
    }

    public void setDateDeNaissanceUtilisateur(Date dateDeNaissanceUtilisateur) {
        this.dateDeNaissanceUtilisateur = dateDeNaissanceUtilisateur;
    }

    public int getTailleUtilisateur() {
        return tailleUtilisateur;
    }

    public void setTailleUtilisateur(int tailleUtilisateur) {
        this.tailleUtilisateur = tailleUtilisateur;
    }

    public int getPoidsUtilisateur() {
        return poidsUtilisateur;
    }

    public void setPoidsUtilisateur(int poidsUtilisateur) {
        this.poidsUtilisateur = poidsUtilisateur;
    }

    public int getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(int numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public String getPhotoUtilisateur() {
        return photoUtilisateur;
    }

    public void setPhotoUtilisateur(String photoUtilisateur) {
        this.photoUtilisateur = photoUtilisateur;
    }

    public Adresses getAdresses() {
        return adresses;
    }

    public void setAdresses(Adresses adresses) {
        this.adresses = adresses;
    }

    public List<Contacts> getContact() {
        return contact;
    }

    public void setContact(List<Contacts> contact) {
        this.contact = contact;
    }

    public List<Clubs> getClub() {
        return club;
    }

    public void setClub(List<Clubs> club) {
        this.club = club;
    }

    public List<Compositions> getComposition() {
        return composition;
    }

    public void setComposition(List<Compositions> composition) {
        this.composition = composition;
    }

    public List<Entrainements> getEntrainement() {
        return entrainement;
    }

    public void setEntrainement(List<Entrainements> entrainement) {
        this.entrainement = entrainement;
    }

    public List<Roles> getRole() {
        return role;
    }

    public void setRole(List<Roles> role) {
        this.role = role;
    }

    public List<Postes> getPoste() {
        return poste;
    }

    public void setPoste(List<Postes> poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Utilisateurs{");
        sb.append("idUtilisateur=").append(idUtilisateur);
        sb.append(", nomUtilisateur='").append(nomUtilisateur).append('\'');
        sb.append(", prenomUtilisateur='").append(prenomUtilisateur).append('\'');
        sb.append(", dateDeNaissanceUtilisateur=").append(dateDeNaissanceUtilisateur);
        sb.append(", tailleUtilisateur=").append(tailleUtilisateur);
        sb.append(", poidsUtilisateur=").append(poidsUtilisateur);
        sb.append(", numeroLicence=").append(numeroLicence);
        sb.append(", photoUtilisateur='").append(photoUtilisateur).append('\'');
        sb.append(", adresses=").append(adresses);
        sb.append(", contact=").append(contact);
        sb.append(", club=").append(club);
        sb.append(", composition=").append(composition);
        sb.append(", entrainement=").append(entrainement);
        sb.append(", role=").append(role);
        sb.append(", poste=").append(poste);
        sb.append('}');
        return sb.toString();
    }
}
