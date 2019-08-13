/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer2 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        int acu=0;
        for(int i=0; i<arr.length;i++){
            System.out.println("Ingrese un numero: ");
            arr[i]=sc.nextInt();
            if(i%2==0){acu=acu+arr[i];}
        }
        
        acu=acu/5;
        
        System.out.println("La media de los numeros en las posciciones pares es: "+acu);
    }
}
