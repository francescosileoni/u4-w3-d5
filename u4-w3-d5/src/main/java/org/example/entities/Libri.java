package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libri extends Catalogo{
    private String autore;
    private  String genere;

    protected Libri() {
    }

    public Libri(long isbn, String title, int annoPubblicazione, int numeroPagine, String autore,String genere) {
        super(isbn ,title, annoPubblicazione, numeroPagine);
       this.autore= autore;
       this.genere= genere;

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
