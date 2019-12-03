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
public class Profesor extends Persona{
    double basico;
    int antiguedad;

    public Profesor(String nombre, String apellido, int legajo,double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

   

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

       
    public double calcularSueldo(){
    
    double diez= basico/10;
    double x= basico+(diez*antiguedad);
            
    return x;
    }

    @Override
    public String toString() {
        return (super.toString()+" Sueldo Basico: "+basico+" Antiguedad: "+ antiguedad);
    }
    
    
}
