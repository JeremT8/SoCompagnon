package fr.jeremt8.socompagnon.backend.soCompagnon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItem;

    private String nomItem;

    private String imageItem;

    public Items() {
    }

    public Items(String nomItem, String imageItem) {
        this.nomItem = nomItem;
        this.imageItem = imageItem;
    }

    public Items(int idItem, String nomItem, String imageItem) {
        this.idItem = idItem;
        this.nomItem = nomItem;
        this.imageItem = imageItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNomItem() {
        return nomItem;
    }

    public void setNomItem(String nomItem) {
        this.nomItem = nomItem;
    }

    public String getImageItem() {
        return imageItem;
    }

    public void setImageItem(String imageItem) {
        this.imageItem = imageItem;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Items{");
        sb.append("idItem=").append(idItem);
        sb.append(", nomItem='").append(nomItem).append('\'');
        sb.append(", imageItem='").append(imageItem).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
