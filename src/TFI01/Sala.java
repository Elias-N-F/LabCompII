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
public class Sala {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Sala(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public String getEspectadores() {
        
        String lista="";
        for(Espectadores espectador: espectadores){
            lista=lista+espectador.toString()+"\n";
        }
        return lista;
    }
    
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        if(espectadores.length<=capacidad){
            this.espectadores = espectadores;
        }
        else{System.out.println("La cantidad de espectadores es mayor que la capacidad de la sala");}
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    
    @Override
    public String toString() {
        return "Nombre:"+this.nombre
               +" Capacidad:"+this.capacidad
               +" Pelicula:"+this.pelicula
               +" Cantidad de espectadores:"+espectadores.length;
    }
    
    
    
}
