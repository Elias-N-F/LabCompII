/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN8;

/**
 *
 * @author alumno
 */
public interface Vehiculos {
    int VELOCIDAD_MAXIMA=120;
    
    
    public void ACELERAR(int cantidad);
    public void FRENAR(int cantidad);
    public int PLAZAS();
    public int get_VELOCIDAD();
    public String queSoy();
}
