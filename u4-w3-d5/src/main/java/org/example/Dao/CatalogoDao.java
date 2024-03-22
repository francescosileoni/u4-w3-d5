package org.example.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.entities.Catalogo;

public class CatalogoDao {


        private EntityManager em;

    public CatalogoDao(EntityManager em) {
    }

    public void CatalogoDAO(EntityManager em) {
            this.em = em;
        }

        public void save(Catalogo catalogo) {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(catalogo);
            tx.commit();
            System.out.println("Elemento salvato con successo!");
        }

        public Catalogo findById(long isbn) {
            Catalogo catalogo = em.find(Catalogo.class, isbn);
            return catalogo;
        }
    }


