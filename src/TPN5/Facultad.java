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
public class Facultad {

    String nombreColegio;
    int cantEstudiantes;
    Estudiante[] estudiantes;
    int contador = 0;

    public Facultad(String nombreColegio, int cantEstudiantes) {
        this.nombreColegio = nombreColegio;
        this.cantEstudiantes = cantEstudiantes;
        estudiantes = new Estudiante[cantEstudiantes];
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiante.numEstu = contador;
        
        if (contador < cantEstudiantes) {
            this.estudiantes[contador] = estudiante;
            contador++;
            System.out.println("Operación exitosa");
        } else {
            System.out.println("Error, se alcanzo la cantidad maxima de alumnos");
        }
    }

    public void listarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getDatos());
        }
    }

    public void buscarEstudiante(String nombreEstu) {

        for (int i = 0; i < estudiantes.length; i++) {
            if (nombreEstu.equalsIgnoreCase(estudiantes[i].nombreEstud)) {
                System.out.println(estudiantes[i].getDatos());
                break;
            }
        }

    }

    public void cambiarNota(String nombreEstu, double notaNueva) {

        for (int i = 0; i < estudiantes.length; i++) {
            if (nombreEstu.equalsIgnoreCase(estudiantes[i].nombreEstud)) {
                estudiantes[i].notaMedia=notaNueva;
                break;
            }
        }

    }

    public void borrarEstudiante(int nroEstudiante){
    this.estudiantes[nroEstudiante].nombreEstud="";
       this.estudiantes[nroEstudiante].notaMedia=0;
 
    }
    
    
}
