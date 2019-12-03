/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Examenes {
    private String profesor;
    private String materia;
    private ArrayList<Preguntas> preguntas;

    public Examenes(String profesor, String materia, ArrayList<Preguntas> preguntas) {
        this.profesor = profesor;
        this.materia = materia;
        this.preguntas = preguntas;
    }
    
    
    
    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
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
    
    
}
