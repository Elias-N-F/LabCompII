package TrabajoFinal;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JPanelDeProfesor extends JPanel {

    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();

    private JTextField pregunta = new JTextField();
    private ButtonGroup grupoBotones = new ButtonGroup();
    private JRadioButton verdadero = new JRadioButton();
    private JRadioButton falso = new JRadioButton();

    private ArrayList<Preguntas> preguntas = new ArrayList();

    private String titulo;
    private int cont = 0;
    private int limite;

    public JPanelDeProfesor() {
        while (true) {
            titulo = JOptionPane.showInputDialog("Ingrese nombre de la Materia");
            if(titulo==null){System.exit(0);}
            if (titulo.equals("")) {
                JOptionPane.showMessageDialog(null, "El nombre de la materia no puede estar vacio", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                break;
            }
        }
        titulo= "Examen de: "+titulo;
        limite = setLimite();
        etiquetas();
        cajasdeTexto();
        botones();
    }

    public int setLimite() {

        int x = 0;
        while (true) {
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de preguntas: ", 3));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero por favor", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        return x;

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

        etiqueta1.setText("Ingrese Pregunta: " + (cont + 1));

        etiqueta2.setText("Ingrese Respuesta: " + (cont + 1));

        pregunta.setText("");

        grupoBotones.clearSelection();
    }

    private void cajasdeTexto() {

        pregunta.setBounds(10, 80, 200, 23);
        add(pregunta);

        grupoBotones.add(falso);
        grupoBotones.add(verdadero);

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

        boton2.addActionListener(new accionSiguiente());

    }

    private class accionSiguiente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (pregunta.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "La pregunta no puede estar vacia", "Error", JOptionPane.WARNING_MESSAGE);
            } else {

                if (!verdadero.isSelected() && falso.isSelected()) {
                    preguntas.add(new Preguntas(pregunta.getText(), false));
                    cont++;
                } else if (verdadero.isSelected() && !falso.isSelected()) {
                    preguntas.add(new Preguntas(pregunta.getText(), true));
                    cont++;
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una respuesta", "Error", JOptionPane.WARNING_MESSAGE);
                }

                setEtiquetas();

                if (cont == limite) {

                    JPanelDeProfesor.this.setVisible(false);
                    JFrameDeAlumno f = new JFrameDeAlumno(getTituloCompleto(), getPreguntas());
                    f.setVisible(false);
                }

            }
        }
    }
}