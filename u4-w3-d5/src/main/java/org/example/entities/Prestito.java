package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="prestito")
public class Prestito {
    @Id
    @GeneratedValue
    private long id;
    private Date inizioPrestito;
    private  Date  restituzionePrevista;
    private  Date restituzioneEffettiva;

    @ManyToOne
    @JoinColumn
    private User user;
    @OneToOne
    @JoinColumn
    private Catalogo elementoPrestato;

    public Prestito(long id, Date inizioPrestito, Date restituzionePrevista, Date restituzioneEffettiva,User user) {
        this.id = id;
        this.inizioPrestito = inizioPrestito;
        this.restituzionePrevista = restituzionePrevista;
        this.restituzioneEffettiva = restituzioneEffettiva;
        this.user= user;
    }

    public Prestito(long numeroTessera, Catalogo byId, Date date, Date date1, Date date2) {
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(Date inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public Date getRestituzionePrevista() {
        return restituzionePrevista;
    }

    public void setRestituzionePrevista(Date restituzionePrevista) {
        this.restituzionePrevista = restituzionePrevista;
    }

    public Date getRestituzioneEffettiva() {
        return restituzioneEffettiva;
    }

    public void setRestituzioneEffettiva(Date restituzioneEffettiva) {
        this.restituzioneEffettiva = restituzioneEffettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", inizioPrestito=" + inizioPrestito +
                ", restituzionePrevista=" + restituzionePrevista +
                ", restituzioneEffettiva=" + restituzioneEffettiva +
                ", user=" + user +
                '}';
    }
}
