package fr.univtln.xdurbec066.testD21;

import fr.univtln.xdurbec066.testD21.entite.Entite;
import fr.univtln.xdurbec066.testD21.item.Film;
import fr.univtln.xdurbec066.testD21.item.Item;
import fr.univtln.xdurbec066.testD21.item.Livre;
import fr.univtln.xdurbec066.testD21.note.Note;
import fr.univtln.xdurbec066.testD21.utilisateur.Utilisateur;

import javax.persistence.*;

/**
 * Created by xdurbec066 on 23/03/17.
 */
public class Main1 {

    public static void main(String[] args) {

        Utilisateur e1 = new Utilisateur("Medor1","Wesker1");
        Utilisateur e2 = new Utilisateur("Medor2","Wesker2");
        Utilisateur e3 = new Utilisateur("Medor3","Wesker3");
        Utilisateur e4 = new Utilisateur("Medor4","Wesker4");
        Utilisateur e5 = new Utilisateur("Medor5","Wesker5");
        Utilisateur e6 = new Utilisateur("Medor6","Wesker6");

       e1.addNote(new Note("Il était une fois",new Livre("Mobi","SS8S64Z")));
         e1.addNote(new Note("Il était une fois 2",new Film("Avenger",23)));

        e2.addNote(new Note("Il était une fois 32",new Livre("Mobi2","SAAAAA")));
        e2.addNote(new Note("Il était une fois 3",new Film("Ag",234)));


        Item item = new Item("b");
        Livre livre = new Livre("A","B");
        Film film = new Film("Sa",5);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();


        EntityTransaction transac = em.getTransaction();

        transac.begin();
        em.persist(livre);
        em.persist(film);
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        transac.commit();
    }
}
