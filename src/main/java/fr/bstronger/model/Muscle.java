package fr.bstronger.model;

import java.util.List;
import java.time.LocalDate;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Muscle extends PanacheEntity{

    @OneToMany(mappedBy = "muscle")
    public List<Exercice> exercices;
    
    @Column(unique = true, nullable = false)
    public String nom;
}
