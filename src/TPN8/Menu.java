/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menu {
    ArrayList<Vehiculos> garage= new ArrayList();

    public Menu() {
    }
    
    public void CrearVehiculo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Que desea crear? \n1)Auto \n2)Moto");
       try{ switch(sc.nextInt()){
            case 1:
                 System.out.println("Ingrese la velocidad inicial del vehiculo: ");
                 Coche c= new Coche(sc.nextInt());
                 this.garage.add(c);
                break;
            case 2:
                 System.out.println("Ingrese la velocidad inicial del vehiculo: ");
                 Moto m= new Moto(sc.nextInt());
                 this.garage.add(m);
                break;
            default:
                System.out.println("Error, numero fuera de rango");
                break;
        }
       }
       catch(InputMismatchException e){System.out.println("Error, ingrese valores numericos");
       }
        
    }
    
    public void ListarVehiculos(){
    
    for(int i=0; i<this.garage.size();i++){
        System.out.println("Vehiculo n°:"+i+" es: "+garage.get(i).queSoy()+", va a:"
                +garage.get(i).get_VELOCIDAD()+" kmph, y tiene:"+garage.get(i).PLAZAS()+" plazas");
    }
    }
}
