package fr.univtln.xdurbec066.testD21.item;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xdurbec066 on 23/03/17.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    protected int id;

    protected String titre;
    protected int prix;
    protected String description;

    public Item() {
    }

    public Item(String titre) {
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        return getId() == item.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                '}';
    }
}
