package TrabajoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JframeNuevo extends JFrame {

    public JframeNuevo(String titulo) {
        setTitle("Examen");
        setBounds(50, 50, 360, 400);
        setLocationRelativeTo(null);

        JpanelNuevo panelnuevo = new JpanelNuevo(titulo);
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
