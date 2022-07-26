package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class TypeEntrainements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeEntrainement;

    private String labelEntrainement;

    private String imageEntrainement;

    @ManyToOne
    private Entrainements entrainement;

    public TypeEntrainements(String labelEntrainement, String imageEntrainement, Entrainements entrainement) {
        this.labelEntrainement = labelEntrainement;
        this.imageEntrainement = imageEntrainement;
        this.entrainement = entrainement;
    }

    public TypeEntrainements() {
    }

    public int getIdTypeEntrainement() {
        return idTypeEntrainement;
    }

    public void setIdTypeEntrainement(int idTypeEntrainement) {
        this.idTypeEntrainement = idTypeEntrainement;
    }

    public String getLabelEntrainement() {
        return labelEntrainement;
    }

    public void setLabelEntrainement(String labelEntrainement) {
        this.labelEntrainement = labelEntrainement;
    }

    public String getImageEntrainement() {
        return imageEntrainement;
    }

    public void setImageEntrainement(String imageEntrainement) {
        this.imageEntrainement = imageEntrainement;
    }

    public Entrainements getEntrainement() {
        return entrainement;
    }

    public void setEntrainement(Entrainements entrainement) {
        this.entrainement = entrainement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TypeEntrainements{");
        sb.append("idTypeEntrainement=").append(idTypeEntrainement);
        sb.append(", labelEntrainement='").append(labelEntrainement).append('\'');
        sb.append(", imageEntrainement='").append(imageEntrainement).append('\'');
        sb.append(", entrainement=").append(entrainement);
        sb.append('}');
        return sb.toString();
    }
}
