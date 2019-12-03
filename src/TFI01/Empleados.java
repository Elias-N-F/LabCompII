/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI01;

/**
 *
 * @author alumno
 */
public class Empleados extends Personas {
    private double sueldo;

    public Empleados(String nombre, int edad) {
       this.nombre=nombre;
       this.edad=edad;
    }   

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.nombre+" Edad:"+this.edad+" Sueldo:$"+this.sueldo;
    }

    @Override
    public String getTipo() {
        return "Empleados";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad=edad;
    }
    
    
}
