/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerArrays1;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class EjerArrays1 {

    public static void main (String[] args){
    
    String nombres[]= new String[4];
    nombres[0]="Juancho";
    nombres[1]="Juan";
    nombres[2]="Juance";
    nombres[3]="Juan carlos";
    for (int i=0;i<4;i++){nombres[i]=JOptionPane.showInputDialog("Ingrese su nombre");}
    for(String nombre:nombres){System.out.println(nombre);}
    
    
    }


}
