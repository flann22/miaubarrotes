/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miaubarrotes;

/**
 *
 * @author labinf
 */
public class Carrito {
    private int cod_pedido;
    private String nom_producto;
    private int precio;

    public Carrito(int cod_pedido, String nom_producto, int precio) {
        this.cod_pedido = cod_pedido;
        this.nom_producto = nom_producto;
        this.precio = precio;
    }

    public Carrito() {
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
