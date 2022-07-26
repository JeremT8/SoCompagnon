package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compositions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComposition;

    private String labelComposition;

    private String imageComposition;

    private Boolean visibiliteComposition;


    @ManyToMany
    @JoinTable(name = "UtilisateurComposition",
            joinColumns = @JoinColumn (name = "idComposition"),
            inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private List<Utilisateurs> utilisateur;

    @OneToMany
    private List<Tactiques> tactique;

    public Compositions(String labelComposition, String imageComposition, Boolean visibiliteComposition, List<Utilisateurs> utilisateur, List<Tactiques> tactique) {
        this.labelComposition = labelComposition;
        this.imageComposition = imageComposition;
        this.visibiliteComposition = visibiliteComposition;
        this.utilisateur = utilisateur;
        this.tactique = tactique;
    }

    public Compositions() {

    }

    public int getIdComposition() {
        return idComposition;
    }

    public void setIdComposition(int idComposition) {
        this.idComposition = idComposition;
    }

    public String getLabelComposition() {
        return labelComposition;
    }

    public void setLabelComposition(String labelComposition) {
        this.labelComposition = labelComposition;
    }

    public String getImageComposition() {
        return imageComposition;
    }

    public void setImageComposition(String imageComposition) {
        this.imageComposition = imageComposition;
    }

    public Boolean getVisibiliteComposition() {
        return visibiliteComposition;
    }

    public void setVisibiliteComposition(Boolean visibiliteComposition) {
        this.visibiliteComposition = visibiliteComposition;
    }

    public List<Utilisateurs> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateurs> utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Tactiques> getTactique() {
        return tactique;
    }

    public void setTactique(List<Tactiques> tactique) {
        this.tactique = tactique;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compositions{");
        sb.append("idComposition=").append(idComposition);
        sb.append(", labelComposition='").append(labelComposition).append('\'');
        sb.append(", imageComposition='").append(imageComposition).append('\'');
        sb.append(", visibiliteComposition=").append(visibiliteComposition);
        sb.append(", utilisateur=").append(utilisateur);
        sb.append(", tactique=").append(tactique);
        sb.append('}');
        return sb.toString();
    }
}
