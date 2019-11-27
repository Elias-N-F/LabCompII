package TrabajoFinal;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PrimerPanel extends JPanel {

    JLabel etiqueta1 = new JLabel();
    JLabel etiqueta2 = new JLabel();

    JTextField pregunta = new JTextField();
    JRadioButton verdadero = new JRadioButton();
    JRadioButton falso = new JRadioButton();

    ArrayList<Preguntas> preguntas = new ArrayList();

    private String titulo;
    private int cont = 0;

    public PrimerPanel() {
        titulo = "Examen de " + JOptionPane.showInputDialog("Ingrese nombre de la Materia");
        etiquetas();
        cajasdeTexto();
        botones();
    }

    public String getTituloCompleto() {
        return titulo;
    }

    public void setTitulo1(String titulo1) {
        this.titulo = titulo1;
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    private void etiquetas() {

        JLabel etiqueta3 = new JLabel();

        etiqueta3.setText(getTituloCompleto());
        etiqueta3.setBounds(75, 10, 500, 20);
        add(etiqueta3);

        setEtiquetas();

        etiqueta1.setBounds(10, 50, 500, 20);
        add(etiqueta1);

        etiqueta2.setBounds(10, 110, 500, 20);
        add(etiqueta2);
    }

    private void setEtiquetas() {

        etiqueta1.setText("Ingrese Pregunta: " + cont);

        etiqueta2.setText("Ingrese Respuesta: " + cont);
    }

    private void cajasdeTexto() {

        pregunta.setBounds(10, 80, 200, 23);
        add(pregunta);

        verdadero.setBounds(10, 140, 100, 23);
        verdadero.setText("VERDADERO");
        add(verdadero);

        falso.setBounds(10, 160, 100, 23);
        falso.setText("FALSO");
        add(falso);
    }

    private void botones() {
        JButton boton2 = new JButton();

        boton2.setBounds(150, 300, 100, 30);
        boton2.setText("Continuar");
        add(boton2);

        boton2.addActionListener(new CreadorDeVentanas());

    }

    private class CreadorDeVentanas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!verdadero.isSelected() && falso.isSelected()) {
                preguntas.add(new Preguntas(pregunta.getText(), false));
                cont++;
            } else if (verdadero.isSelected() && !falso.isSelected()) {
                preguntas.add(new Preguntas(pregunta.getText(), true));
                cont++;
            } else {
                System.out.println("nope");
            }

            setEtiquetas();
            if (cont == 10) {

                JframeNuevo f = new JframeNuevo(getTituloCompleto(), getPreguntas());
                PrimerPanel.this.setVisible(false);

            }

        }
    }
}
