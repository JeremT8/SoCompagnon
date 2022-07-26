package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.*;

@Entity
public class TypeEvenements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeEvenement;

    private String labelTypeEvenement;

    @ManyToOne
    private Evenements evenement;

    public TypeEvenements(String labelTypeEvenement, Evenements evenement) {
        this.labelTypeEvenement = labelTypeEvenement;
        this.evenement = evenement;
    }

    public TypeEvenements() {
    }

    public int getIdTypeEvenement() {
        return idTypeEvenement;
    }

    public void setIdTypeEvenement(int idTypeEvenement) {
        this.idTypeEvenement = idTypeEvenement;
    }

    public String getLabelTypeEvenement() {
        return labelTypeEvenement;
    }

    public void setLabelTypeEvenement(String labelTypeEvenement) {
        this.labelTypeEvenement = labelTypeEvenement;
    }

    public Evenements getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenements evenement) {
        this.evenement = evenement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TypeEvenements{");
        sb.append("idTypeEvenement=").append(idTypeEvenement);
        sb.append(", labelTypeEvenement='").append(labelTypeEvenement).append('\'');
        sb.append(", evenement=").append(evenement);
        sb.append('}');
        return sb.toString();
    }
}
