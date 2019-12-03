/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej1 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int d;
        System.out.println("Ingrese un numero");
        try {
            d= sc.nextInt();
            if (d%2==0){System.out.println("El numero ingresado es par");}
            else{System.out.println("El numero ingresado es impar");}
        }
        catch(InputMismatchException e){
            System.out.println("El valor introducido no es numérico. El programa se cerrará.");
        }
        
    }
}
