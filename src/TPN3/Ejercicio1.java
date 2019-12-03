/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN3;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main (String[] args){
        
        int[] arr= new int[100];
        
        for (int i = 0; i < 100; i++) {
            arr[i]= (int)(Math.random()*100)+1;
            if(i>0){
                for (int x=i-1; x> 0; x--){if(arr[i]==arr[x]){i--;}}
            }
        }
        
        for (int n : arr) {
            System.out.println(n);
        }
        
    }
}
