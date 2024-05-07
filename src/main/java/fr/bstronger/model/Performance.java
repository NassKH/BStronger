package fr.bstronger.model;

import java.time.LocalDate;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Performance extends PanacheEntity{

    @ManyToOne
    public Exercice exercice;    
    
    @Column(unique = false, nullable = false)
    public float poids;

    @Column(unique = false, nullable = false)
    public int nb_serie;

    @Column(unique = false, nullable = false)
    public int nb_rep;
}
