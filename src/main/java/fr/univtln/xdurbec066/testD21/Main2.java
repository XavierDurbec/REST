package fr.univtln.xdurbec066.testD21;

import fr.univtln.xdurbec066.testD21.utilisateur.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by xdurbec066 on 23/03/17.
 */
public class Main2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();

        transac.begin();
        Utilisateur u1 = em.find(Utilisateur.class,5);
        System.out.println(u1);
        // em.refresh(p1);
        //em.merge(p1);
        transac.commit();
        //System.out.println(p1);
    }
}
