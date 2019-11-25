package TrabajoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeNuevo extends JFrame {

    public JframeNuevo() {
        setTitle("Examen");
        setBounds(50, 50, 360, 400);
        setLocationRelativeTo(null);

        JpanelNuevo panelnuevo = new JpanelNuevo();
        panelnuevo.setLayout(null);
        add(panelnuevo);
        setVisible(true);
    }

}
