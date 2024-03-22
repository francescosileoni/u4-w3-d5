package org.example.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.entities.User;

public class UserDao{
    private final EntityManager em;

    public UserDao(EntityManager em) {
        this.em = em;
    }

    public void save(User user) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(user);
        tx.commit();
        System.out.println("Utente salvato con successo!");
    }

    public User findById(Long numeroTessera) {
        User user = em.find(User.class, numeroTessera);
        return user;
    }
}