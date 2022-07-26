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

    public Postes(String labelPoste, List<Utilisateurs> utilisateur) {
        this.labelPoste = labelPoste;
        this.utilisateur = utilisateur;
    }

    public Postes() {

    }

    public int getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(int idPoste) {
        this.idPoste = idPoste;
    }

    public String getLabelPoste() {
        return labelPoste;
    }

    public void setLabelPoste(String labelPoste) {
        this.labelPoste = labelPoste;
    }

    public List<Utilisateurs> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateurs> utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Postes{");
        sb.append("idPoste=").append(idPoste);
        sb.append(", labelPoste='").append(labelPoste).append('\'');
        sb.append(", utilisateur=").append(utilisateur);
        sb.append('}');
        return sb.toString();
    }
}
