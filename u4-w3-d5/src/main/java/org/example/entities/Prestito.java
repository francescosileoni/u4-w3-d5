package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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


    public Prestito(long id, Date inizioPrestito, Date restituzionePrevista, Date restituzioneEffettiva) {
        this.id = id;
        this.inizioPrestito = inizioPrestito;
        this.restituzionePrevista = restituzionePrevista;
        this.restituzioneEffettiva = restituzioneEffettiva;
    }

    public long getId() {
        return id;
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
                '}';
    }
}
