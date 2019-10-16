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
public class Acomodadores extends Empleados implements ParaAcomodadores{
    private Sala sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public Sala getSala() {
        return this.sala;
    }

    @Override
    public void setSala(Sala sala) {
        this.sala=sala;
    }

    @Override
    public String getTipo() {
        return "Acomodadores";
    }

    @Override
    public String toString() {
        return super.toString()+" Sala:"+this.sala.getNombre();
    }

   
    
    
}
