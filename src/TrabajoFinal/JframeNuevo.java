package TrabajoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class JframeNuevo extends JFrame {

    public JframeNuevo(String titulo, ArrayList p) {
        setTitle("Examen");
        setBounds(50, 50, 360, 400);
        setLocationRelativeTo(null);

        JpanelNuevo panelnuevo = new JpanelNuevo(titulo, p);
        panelnuevo.setLayout(null);
        add(panelnuevo);
        setVisible(true);
        addWindowListener(new Eventos());
    }

    private class Eventos extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "EXAMEN FINALIZADO!");
            System.exit(0);
        }

    }

}
