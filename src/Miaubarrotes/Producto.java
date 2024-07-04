package Miaubarrotes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class Producto {
    private int cod;
    private String nom;
    private int precio;
    private int stock;

    public Producto() {
    }

    public Producto(int cod, String nom, int precio, int stock) {
        this.cod = cod;
        this.nom = nom;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /*@Override
    public String toString() {
        return "Lacteos{" +
                "cod=" + cod +
                ", nom='" + nom + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }*/
    
}
