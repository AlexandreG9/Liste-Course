package fr.aguiheneuf.model;

import javax.persistence.*;

/**
 * Created by Alexandre on 05/12/2017.
 */
@Entity
@Table(name = "liste_course")
public class ListeCourse {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "nom_liste_course")
    private String nom;

    @Column(name = "quantite")
    private int quantite;

    @Column(name = "achete_liste_course")
    private boolean achete;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public boolean isAchete() {
        return achete;
    }

    public void setAchete(boolean achete) {
        this.achete = achete;
    }
}
