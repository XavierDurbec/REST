package fr.univtln.xdurbec066.testD21.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Takeo on 11/04/2017.
 */
class CEntityManager {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    private EntityManager em = emf.createEntityManager();

    private static CEntityManager INSTANCE = null;

    public static CEntityManager getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new CEntityManager();
        return INSTANCE;
    }

    private CEntityManager() {}

    public EntityManager getEm() {
        return  em;
    }
}
