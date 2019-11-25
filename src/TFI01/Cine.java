/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Cine {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        boolean ex=true;
        System.out.println("Ingrese la cantidad de espectadores que desea agregar");
        int p= sc.nextInt();
        Espectadores arresp[]= new Espectadores[p];
        
        for (int i=0; i<p;i++){
            arresp[i]=crearEspectador();
        }
        
        Sala sala01= new Sala(3, "Sala 01");
        sala01.setPelicula("Joker");
        sala01.setEspectadores(arresp);
        try{
        System.out.println(sala01.getEspectadores());}
        catch(NullPointerException e){System.out.println("Aparentemente no hay espectadores en la sala");}
        
        Acomodadores acom= new Acomodadores("Juan", 21);
        acom.setSueldo(50000);
        acom.setSala(sala01);
        System.out.println(acom.toString());
        
        Empleados empleado=new Empleados("Rodrigo", 35);
        empleado.setSueldo(30000);
        System.out.println(empleado.toString());
    }
    
    public static Espectadores crearEspectador(){
        Scanner sc= new Scanner(System.in);
        int ed=0, sill=0;
        String nomb,fil;
        boolean v=true;
                
        System.out.println("Ingrese el nombre del espectador");
        nomb=sc.nextLine();
        
        System.out.println("Ingrese la edad del espectador");
        while(v){
            try{
                ed=sc.nextInt();
                v=false;
            }
            catch(InputMismatchException e){
                System.out.println("Error, intente nuevamente");
                sc= new Scanner(System.in);
            }
        }
        
        System.out.println("Ingrese la fila del espectador");
        sc= new Scanner(System.in);
        fil= sc.nextLine();
        
        System.out.println("Ingrese la silla del espectador");
        v=true;
        while(v){
            try{
                sill=sc.nextInt();
                v=false;
            }
            catch(InputMismatchException e){
                System.out.println("Error, intente nuevamente");
                sc= new Scanner(System.in);
            }
        }
        
        Espectadores es= new Espectadores(nomb, ed, fil, sill);
        
        
    return es;
    }
    
}
