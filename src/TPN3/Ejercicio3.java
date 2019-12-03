/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN3;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    public static void main (String[] args){
    
      String mat[][]= new String[3][3];
      String aux[];
      
        for (int i=0; i<3;i++){       
            mat[i][0]=JOptionPane.showInputDialog("Ingrese su nombre");
            mat[i][1]=JOptionPane.showInputDialog("Ingrese su DNI");
            mat[i][2]=JOptionPane.showInputDialog("Ingrese su Edad");
        }
        
        for(int x=1;x<3;x++){
            for (int i=0; x<3-i;i++){       
                if(mat[i][0].compareTo(mat[i+1][0])>  0){
                    aux=mat[i];
                    mat[i]=mat[i+1];
                    mat[i+1]=aux;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int x=0;x<3;x++){
                System.out.print(mat[x][i]+" ");
            }
            System.out.println("");
        }
    }
}
