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
public class Ejer1 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        int cant[]=new int[3];
        for(int i=0; i<arr.length;i++){System.out.println("Ingrese un numero: ");
            arr[i]=sc.nextInt();
            if(arr[i]>0){cant[1]++;}
            else if(arr[i]<0){cant[2]++;}
            else{cant[0]++;}
        }
        
        System.out.println("Hay "+cant[1]+" numeros positivos, "+cant[2]+" numeros negativos y "+cant[0]+" ceros");
    }
}
