/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTP1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjercicioTP1 {
    public static void main (String[] args){
    String nom;    
    int ed;    
    
    do{  
    nom= JOptionPane.showInputDialog("Ingrese su nombre");
    ed= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    if (ed<18){System.out.println(nom+" es menor de edad");}
    else{System.out.println(nom+" es mayor de edad");}
    }while(ed!=0);
    
    }
}
