package org.example.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "catalogo")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Catalogo {


    @Id

    protected Long isbn;
    protected String title;

    protected int annoPubblicazione;
    @OneToOne(mappedBy = "elementoPrestato")
    protected int numeroPagine;



    protected Catalogo() {
    }
    protected Catalogo( Long isbn, String title, int annoPubblicazione, int numeroPagine) {
this.isbn=isbn;
        this.title = title;
        this.annoPubblicazione= annoPubblicazione;
        this.numeroPagine= numeroPagine;
    }
    public Long  getIsbn() {
        return isbn;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
