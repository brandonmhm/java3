/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class GeneradorAlumnos {
    
    public static ArrayList<Alumno> generar(){
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        Materia m1=new Materia();
        m1.setCuatrimestre(8);
        m1.setNombre("Elementos de programacion");
        Alumno a1=new Alumno();
               a1.setCuenta(56666);
               a1.setMateria(m1);
               a1.setNombre("Farid");
        Alumno a2=new Alumno();
                a2.setCuenta(34343);
                a2.setMateria(m1);
                a2.setNombre("Giselle");
        Alumno a3=new Alumno();
                a3.setCuenta(34343);
                a3.setMateria(m1);
                a3.setNombre("Omar");
                alumnos.add(a1);
                alumnos.add(a2);
                alumnos.add(a3);
        return alumnos;
    }
}
