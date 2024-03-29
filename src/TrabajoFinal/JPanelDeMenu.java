package TrabajoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelDeMenu extends JPanel {
    public JPanelDeMenu() {
        etiqueta();
        botones();

    }
    public void etiqueta(){
        JLabel etiqueta1 = new JLabel();

        etiqueta1.setText("Sistema Academico");
        etiqueta1.setBounds(55, 10, 500, 20);
        etiqueta1.setFont(new Font("Arial",0,20));
        add(etiqueta1);
    }

    public void botones(){
        JButton boton1= new JButton();
        JButton boton2 = new JButton();

        boton1.setBounds(90, 100, 100, 30);
        boton1.setText("Profesor");
        add(boton1);
        boton1.addActionListener(new oyenteProfesor());

        boton2.setBounds(90, 200, 100, 30);
        boton2.setText("Alumno");
        add(boton2);
        boton2.addActionListener(new oyenteAlumno());
    }
    private class oyenteProfesor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrameDeProfesor frame1 = new JFrameDeProfesor();
            frame1.setVisible(true);
        }
    }

    private class oyenteAlumno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanelDeProfesor fp=new JPanelDeProfesor();
            fp.setVisible(false);
            JFrameDeAlumno frame2=new JFrameDeAlumno(fp.getTituloCompleto(),fp.getPreguntas());
            frame2.setVisible(true);
        }
    }
}
