/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class JFrameIntermedio extends JFrame {
        public JFrameIntermedio(ArrayList<Examenes> x) {
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(20, 30, 300, 200);
        setLocationRelativeTo(null);
        setTitle("Seleccionar Examen");

        JPanelIntermedio panel1 = new JPanelIntermedio(x);
        panel1.setLayout(null);
        add(panel1);
        setVisible(true);
        
    }
}
