/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI02;

/**
 *
 * @author alumno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Facultad f= new Facultad("UTN");
        Carrera c= new Carrera("ISI");
        Profesor p= new Profesor("Rodolfo", "Rojas", 2593 ,15000, 3);
        Materia m= new Materia("Fisica",p);
        Estudiante e= new Estudiante("Elias", "Fumez", 4331);
        m.agregarEstudiante(e);
        c.agregarMateria(m);
        f.agregarCarrera(c);
        f.getArrCarrera().get(0).encontrarMateria("Fisica");
        System.out.println(m.listarContenidos());
        f.eliminarEstudiante(e);
        System.out.println(f.getArrCarrera().get(0).listarContenidos());
        System.out.println(f.listarContenidos());
        f.eliminarCarrera("isi");
        System.out.println(f.listarContenidos());
    }
    
}
