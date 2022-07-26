package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdresse;

    private String labelAdresse;

    private String codePostaleAdresse;

    private String villeAdresse;

    public Adresses(String labelAdresse, String codePostaleAdresse, String villeAdresse) {
        this.labelAdresse = labelAdresse;
        this.codePostaleAdresse = codePostaleAdresse;
        this.villeAdresse = villeAdresse;
    }

    public Adresses() {

    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getLabelAdresse() {
        return labelAdresse;
    }

    public void setLabelAdresse(String labelAdresse) {
        this.labelAdresse = labelAdresse;
    }

    public String getCodePostaleAdresse() {
        return codePostaleAdresse;
    }

    public void setCodePostaleAdresse(String codePostaleAdresse) {
        this.codePostaleAdresse = codePostaleAdresse;
    }

    public String getVilleAdresse() {
        return villeAdresse;
    }

    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Adresses{");
        sb.append("idAdresse=").append(idAdresse);
        sb.append(", labelAdresse='").append(labelAdresse).append('\'');
        sb.append(", codePostaleAdresse='").append(codePostaleAdresse).append('\'');
        sb.append(", villeAdresse='").append(villeAdresse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
