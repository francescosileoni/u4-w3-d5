package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="utente")
public class User
{

    @Id
    private long numeroTessera;
    private String nome;
    private  String cognome;
    private Date data;


    public User(long numeroTessera, String nome, String cognome, Date data) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }

    public long getNumeroTessera() {
        return numeroTessera;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;

    }

    @Override
    public String toString() {
        return "User{" +
                "numeroTessera=" + numeroTessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", data=" + data +
                '}';
    }
}
