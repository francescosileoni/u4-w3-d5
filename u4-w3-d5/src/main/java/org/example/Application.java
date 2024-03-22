package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Dao.CatalogoDao;
import org.example.Dao.PrestitoDao;
import org.example.Dao.UserDao;
import org.example.entities.Libri;
import org.example.entities.Prestito;
import org.example.entities.Riviste;
import org.example.entities.User;

import java.util.Date;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");

    public static void main(String[] args) {
        System.out.println("Loading.....");
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
    /*Date date = new Date();
        CatalogoDao daoCatalogo = new CatalogoDao(em);
        UserDao daoUtente = new UserDao(em);
        PrestitoDao daoPrestito = new PrestitoDao(em);
        Faker faker = new Faker();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            Libri libro = new Libri(Long.parseLong(faker.code().isbn13()), faker.book().title(), random.nextInt(1990, 2024), random.nextInt(1, 1000), faker.book().author(), faker.book().genre());
            daoCatalogo.save(libro);
        }
   
        for (int i = 0; i < 10; i++) {
            Riviste rivista = new Riviste(Long.parseLong(faker.code().isbn13()), faker.book().title(), random.nextInt(1990, 2024), random.nextInt(1, 1000), periodicita.values()[random.nextInt(0, periodicita.values().length)]);
            daoCatalogo.save(rivista);
        }
        //Creazione Utenti
        for (int i = 0; i < 10; i++) {
            User utente = new User(random.nextLong(1, 10000000000L), faker.dragonBall().character(), faker.harryPotter().character(), faker.date().birthday());
            daoUtente.save(utente);
        }
        //Creazione prestiti
        for (int i = 0; i < 10; i++) {
            Prestito prestito = new Prestito(daoUtente.findById((long) random.nextInt(1, 20)).getNumeroTessera(), daoCatalogo.findById(random.nextInt(1, 10)), date, date, date);
            daoPrestito.save(prestito);
        }
*/
        em.close();
    }
}
