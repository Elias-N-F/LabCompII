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
public class Espectadores extends Personas {
    private String fila;
    private int silla;

    public Espectadores(String nombre, int edad, String fila, int silla) {
        this.nombre=nombre;
        this.edad=edad;
        this.fila = fila;
        this.silla = silla;
    }
    
    public String getButaca(){return this.fila+this.silla;}

    @Override
    public String getTipo() {
        return "Espectadores";
    }

    @Override
    public String toString() {
        return "Nombre:"+this.nombre+" Edad:"+this.edad+" Butaca:"+this.getButaca();
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
