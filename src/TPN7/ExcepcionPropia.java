/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN7;

/**
 *
 * @author alumno
 */
public class ExcepcionPropia extends RuntimeException{
    public ExcepcionPropia(){
        super();
    }

    public ExcepcionPropia(String message) {
        super(message);
    }
    
}
