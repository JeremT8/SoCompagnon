package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    private String labelRole;

    @ManyToMany
    @JoinTable(name = "UtilisateurRole",
            joinColumns = @JoinColumn (name = "idRole"),
            inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private List<Utilisateurs> utilisateur;

    public Roles(String labelRole, List<Utilisateurs> utilisateur) {
        this.labelRole = labelRole;
        this.utilisateur = utilisateur;
    }

    public Roles() {
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getLabelRole() {
        return labelRole;
    }

    public void setLabelRole(String labelRole) {
        this.labelRole = labelRole;
    }

    public List<Utilisateurs> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateurs> utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Roles{");
        sb.append("idRole=").append(idRole);
        sb.append(", labelRole='").append(labelRole).append('\'');
        sb.append(", utilisateur=").append(utilisateur);
        sb.append('}');
        return sb.toString();
    }
}
