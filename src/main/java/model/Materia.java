/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author T-107
 */
class Materia {
    private String Nombre;
    private int Cuatrimestre;

    public Materia() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCuatrimestre() {
        return Cuatrimestre;
    }

    public void setCuatrimestre(int Cuatrimestre) {
        this.Cuatrimestre = Cuatrimestre;
    }
    
}
