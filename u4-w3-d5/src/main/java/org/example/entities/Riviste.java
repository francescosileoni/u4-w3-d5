package org.example.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import org.example.Periodicità;

@Entity
@Table(name="riviste")
public class Riviste  extends Catalogo{
    @Enumerated(EnumType.STRING)
    private Periodicità periodicità;

    protected Riviste(){

    }
    public Riviste (String title, int annoPubblicazione, int numeroPagine, Periodicità periodicità){

 super(title, annoPubblicazione, numeroPagine);
    this.periodicità=  periodicità;

    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicità=" + periodicità +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
