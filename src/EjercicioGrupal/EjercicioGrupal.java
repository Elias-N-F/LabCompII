/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioGrupal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioGrupal {
    public static void main (String[] args){
            
        Scanner sc= new Scanner(System.in);
        boolean x=true;
        int r=0;
        //Debe ser capaz de atrapar ingresos de caracteres no numericos
        while (x){
            try {
                System.out.println("Ingrese un numero");
                r=sc.nextInt();
                x=false;
            } catch (InputMismatchException e) {
                System.out.println("Error, ingrese un valor numerico");
            }
        }
        
        int array[]= new int[r];
        for(int i=0; i<array.length;i++){
             array[i]= (int)(Math.random()*30);
            System.out.println(array[i]);
        }
        
    }
}
