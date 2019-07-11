package com.eservice.examen_final.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Espaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nom;
    private int id;
    private String description;

    public Espaces() {
    }

    public Espaces(String nom, int id, String description) {
        this.nom = nom;
        this.id = id;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getDescription(String description) {
        return this.description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Espaces{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}