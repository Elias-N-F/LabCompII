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
public class Ejercicio2 {
    public static void main (String[] args){
        
        int mat[][]= new int[3][3];
        
        for (int i=0; i<3;i++){
            for (int x=0; x<3;x++){
                mat[i][x]=(int)(Math.random()*10);
            }
        }
        for(int arr[] : mat){
            for(int n: arr){
                System.out.println(n);
            }
        }
            
            
    }

}
