/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI02;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Facultad implements Informacion {

    String nombre;
    ArrayList<Carrera> arrCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.arrCarrera = new ArrayList();
    }

    public void agregarCarrera(Carrera c) {
        if (c != null) {
            arrCarrera.add(c);
            System.out.println("Exito agregando carrera");
        } else {
            System.out.println("error");
        }
    }

    public void eliminarCarrera(String c) {
        boolean x = true;
        if (!arrCarrera.isEmpty()) {
            if (c != null) {
                for (Carrera m : arrCarrera) {
                    if (m.getNombre().equalsIgnoreCase(c)) {
                        arrCarrera.remove(m);
                        System.out.println("Exito eliminando carrera");

                        x = false;
                        break;
                    }
                }
            } else {
                System.out.println("error");
            }
        }
        if (x) {
            System.out.println("No se encontro la carrera");
        }
    }

    public void eliminarEstudiante(Estudiante e) {
        boolean f = true;
        if (!arrCarrera.isEmpty()) {
            for (Carrera m : arrCarrera) {
                if (!m.getArrMaterias().isEmpty()) {
                    for (Materia x : m.getArrMaterias()) {
                        x.eliminarEstudiante(e);

                        f = false;

                    }
                }

            }
            System.out.println("Estudiante eliminado de la facultad");
        } else {
            System.out.println("error");
        }
        if (f) {
            System.out.println("Estudiante no encontrado");
        }
    }

    @Override
    public String toString() {
        return "Nombre de la facultad: " + nombre;
    }

    @Override
    public int verCantidad() {
        int x = arrCarrera.size();

        return x;
    }

    @Override
    public String listarContenidos() {
        if (!arrCarrera.isEmpty()) {
            String x = "Lista de carreras: ";
            for (Carrera m : arrCarrera) {
                x = x + "\n" + m.toString();
            }

            return x;
        } else {
            return "No hay carreras";
        }
    }

}
