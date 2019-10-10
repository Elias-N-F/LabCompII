/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN8;

/**
 *
 * @author alumno
 */
public class Coche implements Vehiculos{
    int VelocidadActual;
    int PLAZAS=5;
    
    public Coche(int VelocidadInicial) {
        this.VelocidadActual = VelocidadInicial;
        if(this.VelocidadActual >VELOCIDAD_MAXIMA){
            System.out.println("Se ha superado la velocidad maxima");
        }
    }
    
    
    @Override
    public int PLAZAS() {
        return this.PLAZAS;
    }

    @Override
    public void ACELERAR(int cantidad) {
        this.VelocidadActual+=cantidad;
        
        if(this.VelocidadActual >VELOCIDAD_MAXIMA){
            System.out.println("Se ha superado la velocidad maxima");
        }
        System.out.println("Velocidad actual: "+this.VelocidadActual);
    }

    @Override
    public void FRENAR(int cantidad) {
       this.VelocidadActual-=cantidad;
       
       if(this.VelocidadActual<0){
           System.out.println("Felicidades, vas en reversa");

       }
       
        System.out.println("Velocidad actual: "+this.VelocidadActual);
    }
    @Override
    public int get_VELOCIDAD(){
    
    return this.VelocidadActual;}
    
    @Override
    public String queSoy(){return "Auto";}
}
