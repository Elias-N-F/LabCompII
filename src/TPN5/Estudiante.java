/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN5;

/**
 *
 * @author alumno
 */
public class Estudiante {
    String nombreEstud;
    int numEstu;
    double notaMedia;

    public Estudiante(String nombreEstud, int numEstu, double notaMedia) {
        this.nombreEstud = nombreEstud;
        this.numEstu = numEstu;
        this.notaMedia = notaMedia;
    }
    
    public String getDatos(){
    
    return "Nombre del estudiante: "+nombreEstud+
            "\nNumero del estudiante: "+numEstu+
            "\nNota media del estudiante:"+notaMedia;
    }
    
       
}
