package TrabajoFinal;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventanas extends JFrame {

    public Ventanas() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(20, 30, 300, 400);
        setLocationRelativeTo(null);
        setTitle("Examen FINAL");

        PrimerPanel panel1 = new PrimerPanel();
        panel1.setLayout(null);
        add(panel1);
        setVisible(true);
    }

}

class EventosdeVentana extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "EXAMEN FINALIZADO!");
        //System.out.println("Programa finalizado!");;
    }

}
