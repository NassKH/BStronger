package fr.bstronger.model;

import java.util.List;
import java.time.LocalDate;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Exercice extends PanacheEntity{

    @ManyToOne
    public Muscle muscle;

    @OneToMany(mappedBy = "exercice")
    public List<Performance> performances;
    
    @Column(unique = true, nullable = false)
    public String nom;
}
