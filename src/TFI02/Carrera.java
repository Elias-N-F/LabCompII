/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFI02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Carrera implements Informacion {

    private String nombre;
    private ArrayList<Materia> arrMaterias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.arrMaterias = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getArrMaterias() {
        return arrMaterias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArrMaterias(ArrayList<Materia> arrMaterias) {
        this.arrMaterias = arrMaterias;
    }

    public void agregarMateria(Materia e) {

        if (e != null) {
            arrMaterias.add(e);
            System.out.println("Exito agregando materia");
        } else {
            System.out.println("error");
        }
    }

    public void eliminarMateria(String e) {
        boolean f = true;
        if (!arrMaterias.isEmpty()) {
            if (e != null) {
                for (Materia m : arrMaterias) {
                    if (m.getNombre().equalsIgnoreCase(e)) {
                        arrMaterias.remove(m);
                        System.out.println("Exito removiendo materia");
                        f = false;
                        break;
                    }
                }
            } else {
                System.out.println("error");
            }
        }
        if (f) {
            System.out.println("Materia no encontrada");
        }
    }

    public void encontrarMateria(String m) {
        Scanner sc = new Scanner(System.in);
        if (!arrMaterias.isEmpty()) {
            for (Materia x : arrMaterias) {
                if (x.getNombre().equalsIgnoreCase(m)) {
                    System.out.println("Desea eliminar la materia? \n 1)Si\n2)No");
                    boolean n = true;
                    while (n) {
                        try {
                            int f = sc.nextInt();

                            switch (f) {
                                case 1:
                                    eliminarMateria(m);
                                    n = false;
                                    break;
                                case 2:
                                    n = false;
                                    break;
                                default:
                                    System.out.println("Error, intente nuevamente");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error, eso no es un numero");
                            sc = new Scanner(System.in);
                        }

                    }
                    break;
                }

            }
        }
    }

    @Override
    public String toString() {
        return "Nombre de la carrera: " + nombre;
    }

    @Override
    public int verCantidad() {

        int x = arrMaterias.size();

        return x;
    }

    @Override
    public String listarContenidos() {
        String x = "Lista de materias: ";
        if (!arrMaterias.isEmpty()) {
            for (Materia m : arrMaterias) {
                x = x + "\n" + m.toString();
            }

            return x;
        } else {
            return "No hay materias";
        }
    }

}
