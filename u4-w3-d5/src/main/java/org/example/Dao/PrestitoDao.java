package org.example.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.entities.Prestito;

public class PrestitoDao {
    private final EntityManager em;

    public PrestitoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito prestito) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(prestito);
        tx.commit();
        System.out.println("Prestito salvato con successo!");
    }

    public Prestito findById(long id) {
        Prestito prestito = em.find(Prestito.class, id);
        return prestito;
    }
}