package Miaubarrotes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class Cliente {
    private String rut, nom, fono, dir;

    public Cliente() {
    }

    public Cliente(String rut, String nom, String fono, String dir) {
        this.rut = rut;
        this.nom = nom;
        this.fono = fono;
        this.dir = dir;
    }

    public String getRut() {
        return rut;
    }

    public String getNom() {
        return nom;
    }

    public String getFono() {
        return fono;
    }

    public String getDir() {
        return dir;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    
}

