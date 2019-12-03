/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Examenes implements Serializable{

    private String materia;
    private ArrayList<Preguntas> preguntas;

    public Examenes(String materia, ArrayList<Preguntas> preguntas) {

        this.materia = materia;
        this.preguntas = preguntas;
    }
    
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public ArrayList<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return this.getMateria();
    }
    
    
}
