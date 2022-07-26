package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class Tactiques {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTactique;

    private String labelTactique;

    private String imageTactique;

    @ManyToOne
    private Compositions composition;

    public Tactiques() {
    }

    public Tactiques(String labelTactique, String imageTactique, Compositions composition) {
        this.labelTactique = labelTactique;
        this.imageTactique = imageTactique;
        this.composition = composition;
    }

    public int getIdTactique() {
        return idTactique;
    }

    public void setIdTactique(int idTactique) {
        this.idTactique = idTactique;
    }

    public String getLabelTactique() {
        return labelTactique;
    }

    public void setLabelTactique(String labelTactique) {
        this.labelTactique = labelTactique;
    }

    public String getImageTactique() {
        return imageTactique;
    }

    public void setImageTactique(String imageTactique) {
        this.imageTactique = imageTactique;
    }

    public Compositions getComposition() {
        return composition;
    }

    public void setComposition(Compositions composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tactiques{");
        sb.append("idTactique=").append(idTactique);
        sb.append(", labelTactique='").append(labelTactique).append('\'');
        sb.append(", imageTactique='").append(imageTactique).append('\'');
        sb.append(", composition=").append(composition);
        sb.append('}');
        return sb.toString();
    }
}
