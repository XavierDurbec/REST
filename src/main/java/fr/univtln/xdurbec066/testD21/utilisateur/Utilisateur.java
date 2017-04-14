package fr.univtln.xdurbec066.testD21.utilisateur;

import fr.univtln.xdurbec066.testD21.dao.ICrudService;
import fr.univtln.xdurbec066.testD21.note.Note;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by xdurbec066 on 23/03/17.
 */

@Entity

public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;
    private String nom;
    private String prenom;
    private String description;

    @OneToMany (cascade = {CascadeType.PERSIST})
    private Collection<Note> ListeNote = new ArrayList<>();


    public static final String UTILISATEUR_BY_ALL = "Utilisateur.findUtilisateurAll";

    public Utilisateur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur() {
    }

    public void addNote(Note note){
        this.ListeNote.add(note);
    }


    public int getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static Utilisateur findOne(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();

        transac.begin();
        Utilisateur u1 = em.find(Utilisateur.class,13);
        transac.commit();
        return  u1;

    }

    public static Utilisateur findById(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();

        transac.begin();
        Utilisateur u1 = em.find(Utilisateur.class,id);
        transac.commit();
        return  u1;

    }

    public static void CreateOne(Utilisateur utilisateur){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(utilisateur);
        transac.commit();
        //System.out.println(p1);
    }

    public static void ModifyOne(Utilisateur utilisateur){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.merge(utilisateur);
        transac.commit();
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur)) return false;

        Utilisateur that = (Utilisateur) o;

        return getId() == that.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }

}
