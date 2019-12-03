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
public class Materia implements Informacion {

    private String nombre;
    private Profesor titular;
    private ArrayList<Estudiante> arrEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.arrEstudiantes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public ArrayList<Estudiante> getArrEstudiantes() {
        return arrEstudiantes;
    }

    public void setArrEstudiantes(ArrayList<Estudiante> arrEstudiantes) {
        this.arrEstudiantes = arrEstudiantes;
    }

    public void agregarEstudiante(Estudiante e) {
        if (e != null) {
            arrEstudiantes.add(e);
            System.out.println("Exito al agregar estudiante");
        } else {
            System.out.println("error");
        }
    }

    public void eliminarEstudiante(String e) {
        boolean f = true;
        if (!arrEstudiantes.isEmpty()) {
            if (e != null) {
                for (Estudiante est : arrEstudiantes) {
                    if (est.nombre.equalsIgnoreCase(e)) {
                        arrEstudiantes.remove(est);
                        System.out.println("Estudiante eliminado con exito");
                        f = false;
                        break;
                    }
                }
            } else {
                System.out.println("error");
            }
        }
        if (f) {
            System.out.println("Estudiante no encontrado");
        }
    }

    public void eliminarEstudiante(Estudiante e) {
        boolean f = true;
        if (!arrEstudiantes.isEmpty()) {
            if (e != null) {
                for (Estudiante est : arrEstudiantes) {
                    if (est.equals(e)) {
                        arrEstudiantes.remove(est);
                        System.out.println("Exito al remover estudiante");
                        f = false;
                        break;
                    }
                }
            } else {
                System.out.println("error");
            }
        }
        if (f) {
            System.out.println("Estudiante no encontrado");
        }
    }

    public void modificarTitular(Profesor p) {
        if (p != null) {
            this.titular = p;
            System.out.println("Exito cambiando de profesor");

        } else {
            System.out.println("error");
        }

    }

    @Override
    public String toString() {
        String x;
        x = "Nombre de la materia: " + nombre + " Profesor titular: " + titular;
        return x;
    }

    @Override
    public int verCantidad() {
        int x = arrEstudiantes.size();

        return x;
    }

    @Override
    public String listarContenidos() {
        if (!arrEstudiantes.isEmpty()) {
            String x = "Lista de estudiantes: ";
            for (Estudiante e : arrEstudiantes) {
                x = x + "\n" + e.toString();
            }

            return x;
        } else {
            return "No hay estudiantes";
        }

    }

}
