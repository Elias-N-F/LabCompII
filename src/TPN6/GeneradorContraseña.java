/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN6;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class GeneradorContraseña {
    private int longitud;
    private String contra;

    public GeneradorContraseña(int longitud) {
        this.contra= new String();
        this.longitud= longitud;
    }
    
    private char randChar(){
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        char c = chars.charAt(rnd.nextInt(chars.length()));
        return c;
    }
    
    public String getContraseña(){
        return this.contra;
    }
    
    public int getLongContraseña(){
        return this.longitud;
    }
    
    public void generarContraseña(){
        String pass="";
        for (int i=0; i<this.longitud;i++){
            pass=pass+randChar();
        }
        this.contra= pass;
    }
    
    public String seguridadContraseña(){
        String[] numeros="0-1-2-3-4-5-6-7-8-9".split("-");
        String[] letrasMin="a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z".split("-");
        String[] letrasMay="A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z".split("-");
        int cn=0,clmin=0,clmay=0;
        char d;
         
        for (int i=0; i<this.longitud;i++){
            d=this.contra.charAt(i);
            
            
            for (String numero : numeros) {
                if (numero.indexOf(d)!=-1){cn++;}
            }
            
            for (String letmay : letrasMay) {
                if (letmay.indexOf(d)!=-1){clmin++;}
            }
            
            for (String letmin : letrasMin) {
                if (letmin.indexOf(d)!=-1){clmay++;}
            }
        }

        if(cn>5&&clmin>1&&clmay>2){return "Segura";}
        else{return "Insegura";}
        
    }
    
}
