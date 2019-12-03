/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        GeneradorContraseña gen;
        String[] contraseñas;
        int x;
        
        System.out.println("Ingrese cantidad de contraseñas: ");
        x=sc.nextInt();
        contraseñas=new String[x];
        
        System.out.println("Ingrese longitud de contraseñas: ");
        x=sc.nextInt();
        gen= new GeneradorContraseña(x);
        
        for(int i=0; i<contraseñas.length; i++){
            gen.generarContraseña();
            contraseñas[i]=gen.getContraseña();
            System.out.println(gen.getContraseña());
            System.out.println(gen.getLongContraseña());
            System.out.println(gen.seguridadContraseña());
        }
        
        
    }
}
