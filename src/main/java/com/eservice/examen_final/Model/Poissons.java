package com.eservice.examen_final.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poissons {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String nom;
    private int id;
    private int type;
    private String photo;


    public Poissons() {

    }

    public Poissons(String nom, int id, int type, String photo) {
        this.nom = nom;
        this.id = id;
        this.type = type;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public int getType() {
        return type;
    }

    public String getPhoto() {
        return photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Poissons{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", photo='" + photo + '\'' +
                '}';
    }
}

