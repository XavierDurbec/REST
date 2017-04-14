package fr.univtln.xdurbec066.testD21.item;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by xdurbec066 on 23/03/17.
 */
@Entity
public class Livre extends Item implements Serializable{

    private String isbn;
    private int nbPage;

    public Livre(String titre, String isbn) {
        super(titre);
        this.isbn = isbn;
    }

    public Livre() {
        super();
    }
}
