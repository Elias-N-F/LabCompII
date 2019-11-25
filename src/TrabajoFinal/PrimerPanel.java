package TrabajoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerPanel extends JPanel {

    private String titulo;

    public PrimerPanel() {
        titulo = "Examen de " + JOptionPane.showInputDialog("Ingrese nombre de la Materia");

        etiquetas();
        cajasdeTexto();
        botones();
        JpanelNuevo jp1 = new JpanelNuevo(titulo);

  
    }

    public String getTituloCompleto() {

        return titulo;
    }

    public void setTitulo1(String titulo1) {
        this.titulo = titulo1;
    }

    private void etiquetas() {

        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();

        etiqueta3.setText(getTituloCompleto());
        etiqueta3.setBounds(75, 10, 500, 20);
        add(etiqueta3);

        etiqueta1.setText("Ingrese Pregunta: ");
        etiqueta1.setBounds(10, 50, 500, 20);
        add(etiqueta1);

        etiqueta2.setText("Ingrese Respuesta: ");
        etiqueta2.setBounds(10, 110, 500, 20);
        add(etiqueta2);
    }

    private void cajasdeTexto() {
        JTextField pregunta = new JTextField();
        pregunta.setBounds(10, 80, 200, 23);
        add(pregunta);

        JRadioButton verdadero = new JRadioButton();
        JRadioButton falso = new JRadioButton();

        verdadero.setBounds(10, 140, 100, 23);
        verdadero.setText("VERDADERO");
        add(verdadero);

        falso.setBounds(10, 160, 100, 23);
        falso.setText("FALSO");
        add(falso);
    }

    private void botones() {
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();

        boton1.setBounds(10, 300, 100, 30);
        boton1.setText("Guardar");
        add(boton1);
        boton2.setBounds(150, 300, 100, 30);
        boton2.setText("Finalizar");
        add(boton2);

        boton2.addActionListener(new CreadorDeVentnas());

    }

    private class CreadorDeVentnas implements ActionListener {

       @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            JframeNuevo ventanaNueva = new JframeNuevo();
            ventanaNueva.setVisible(true);
        }
    }
}
