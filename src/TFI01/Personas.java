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
public abstract class Personas {
    protected String nombre;
    protected int edad;

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract int getEdad();

    public abstract void setEdad(int edad);
    
    public abstract String getTipo();

    @Override
    public abstract String toString();
    
    
}
