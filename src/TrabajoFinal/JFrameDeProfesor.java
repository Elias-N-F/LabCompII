package TrabajoFinal;

import javax.swing.*;

public class JFrameDeProfesor extends JFrame {

    public JFrameDeProfesor() {
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(20, 30, 300, 400);
        setLocationRelativeTo(null);
        setTitle("Examen FINAL");

        JPanelDeProfesor panel1 = new JPanelDeProfesor();
        panel1.setLayout(null);
        add(panel1);
        setVisible(true);
    }

}

