/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miaubarrotes;

/**
 *
 * @author tomas
 */
public class Proovedoor {

    private String rut;
    private String nombre;
    private String fono;
    private String dir;
            
    public Proovedoor() {
    }

    public Proovedoor(String rut, String nombre, String fono, String dir) {
        this.rut = rut;
        this.nombre = nombre;
        this.fono = fono;
        this.dir = dir;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    
    
}
