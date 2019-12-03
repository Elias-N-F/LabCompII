/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI02;

/**
 *
 * @author alumno
 */
public abstract class Persona {
        String nombre;
        String apellido;
        int legajo;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
        
        
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
        
        
        
        
        public void modificarDatos(String n, String a, int l){
        this.nombre=n;
        this.apellido= a;
        this.legajo=l;
                
        }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Apellido: "+apellido+" Legajo n°: "+legajo;
    }

        
}
