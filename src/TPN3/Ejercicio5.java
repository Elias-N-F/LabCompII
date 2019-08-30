/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
      public static void main (String[] args){
    
        int mat[][]= new int[3][3];
        
        for (int i=0; i<3;i++){
            for (int x=0; x<3;x++){
                mat[i][x]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }
        }
        
        for(int arr[] : mat){
            for(int n: arr){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------");
        
        ordenarMatriz(mat);
        
        for(int arr[] : mat){
            for(int n: arr){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
        
    }
      
    static void ordenarMatriz(int mat[][]){ 
        int aux[] = new int[mat.length*mat.length]; 
        int k = 0; 
      
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                aux[k++] = mat[i][j]; 
            }
        }
        
        Arrays.sort(aux); 
           
        k=0; 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = aux[k++]; 
            }
        }
    } 
        
 }