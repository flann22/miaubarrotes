/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miaubarrotes;

/**
 *
 * @author tomas
 */
public class Trabajador {
    private String rut;
    private String nombre;
    private String dir;
    private String fono;
    private String cargoA;
    private String cargoH;

    public Trabajador(String rut, String nombre, String dir, String fono, String cargoA, String cargoH) {
        this.rut = rut;
        this.nombre = nombre;
        this.dir = dir;
        this.fono = fono;
        this.cargoA=cargoA;
        this.cargoH = cargoH;
    }

    public Trabajador() {
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDir() {
        return dir;
    }

    public String getFono() {
        return fono;
    }

    public String getCargoA() {
        return cargoA;
    }

    public String getCargoH() {
        return cargoH;
    }
    

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setCargoA(String cargoA) {
        this.cargoA = cargoA;
    }

    public void setCargoH(String cargoH) {
        this.cargoH = cargoH;
    }
    
    
}
