package TrabajoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JPanelDeMenu extends JPanel {
    private ArrayList<Examenes> examenes = new ArrayList();
    
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
    
    public void addExamen(Examenes e){
        this.examenes.add(e);
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
            JFrameDeProfesor profesorframe = new JFrameDeProfesor(JPanelDeMenu.this.examenes);
            profesorframe.setVisible(true);
            
        }
    }

    private class oyenteAlumno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrameIntermedio r = new JFrameIntermedio(examenes);
            r.setVisible(true);
        }
    }
}
