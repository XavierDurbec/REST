package fr.univtln.xdurbec066.testD21.item;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by xdurbec066 on 23/03/17.
 */

@Entity
public class Film extends Item implements Serializable {
    private int duree;
    private String genre;

    public Film(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }

    public Film() {
        super();
    }
}
