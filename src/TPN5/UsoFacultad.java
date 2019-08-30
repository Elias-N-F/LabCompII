/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN5;

/**
 * Equipo: Trio dinamico
 * 
 * Fumez Elias,Diego Rios, Silvio Rojas
 */
public class UsoFacultad {
    public static void main (String[] args){
       Facultad utn= new Facultad("Universidad tecnologica nacional",5);

       Estudiante estudiante= new Estudiante("Juan",3,8.5);
       Estudiante estudiante2= new Estudiante("Carlos",3,6);
       Estudiante estudiante3= new Estudiante("Julio",3,3);
       Estudiante estudiante4= new Estudiante("Elias",3,1.1);
       Estudiante estudiante5= new Estudiante("Marcos",3,4);
       utn.agregarEstudiante(estudiante);
       utn.agregarEstudiante(estudiante2);
       utn.agregarEstudiante(estudiante3);
       utn.agregarEstudiante(estudiante4);
       utn.agregarEstudiante(estudiante5);
       utn.listarEstudiantes();
       utn.borrarEstudiante(4);
       utn.listarEstudiantes();
}

}
