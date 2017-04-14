package fr.univtln.xdurbec066.testD21.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by xdurbec066 on 23/03/17.
 */
@Entity
public class Entite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    public Entite() {}
    public Entite(int id) {this.id = id;}
}
