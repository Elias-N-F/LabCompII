package TrabajoFinal;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class JpanelNuevo extends JPanel {

    private String titulo;
    int pos = 0;
    // EStos Arreglos lo utilice para probar.
    String[] preguntas;
    String[] respuestas;
    String[] opcion;

    public JpanelNuevo(String titulo, ArrayList<Preguntas> p) {
        this.titulo = titulo;

        preguntas = new String[p.size()];
        respuestas = new String[p.size()];
        opcion= new String[p.size()];
        for (int i = 0; i < p.size(); i++) {
            preguntas[i] = p.get(i).getP();
            respuestas[i] = p.get(i).getR();
        }

        etiquetas();
        botones();
    }

    /**
     * EL titulo no me aparece nose porque. xdxdxd -.-
     */
    public JpanelNuevo() {
        etiquetas();
        botones();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * ETIQUETAS*
     */
    JLabel etiqueta1;

    private void etiquetas() {
        etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();

        etiqueta1.setText(preguntas[0]);
        etiqueta1.setBounds(10, 70, 500, 20);
        add(etiqueta1);

        etiqueta2.setText(getTitulo());
        etiqueta2.setBounds(75, 10, 500, 20);
        add(etiqueta2);

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * BOTONES*
     */
    private JRadioButton verdadero;
    private JRadioButton falso;
    JButton siguiente;
    JButton entregar;
    ButtonGroup grupoBotones;

    private void botones() {
        siguiente = new JButton();
        entregar = new JButton();

        verdadero = new JRadioButton("Verdadero", false);
        verdadero.setBounds(10, 100, 200, 30);
        add(verdadero);

        falso = new JRadioButton("Falso", false);
        falso.setBounds(10, 130, 100, 30);
        add(falso);

        siguiente.setBounds(30, 200, 100, 30);
        siguiente.setText("Siguiente");
        add(siguiente);

        entregar.setBounds(200, 200, 100, 30);
        entregar.setText("Entregar");
        entregar.setEnabled(false);
        add(entregar);

        grupoBotones = new ButtonGroup();
        grupoBotones.add(falso);
        grupoBotones.add(verdadero);

        siguiente.addActionListener(new oyenteSiguiente());
        entregar.addActionListener(new oyenteEntregar());

        verdadero.addActionListener(new oyenteOpcion1());
        falso.addActionListener(new oyenteOpcion2());

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * OYENTES*
     */
    private class oyenteSiguiente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // TODO Auto-generated method stub
            if(grupoBotones.isSelected(verdadero.getModel())||grupoBotones.isSelected(falso.getModel())){
            pos++;
            }
            if (pos == (preguntas.length)) {
                /**
                 * Aca con esto anulo los botones asta que deba utilizar.
                 */
                siguiente.setEnabled(false);
                entregar.setEnabled(true);
            }

            if (pos < preguntas.length) {
                etiqueta1.setText(preguntas[pos]);
                //pos++;
                grupoBotones.clearSelection();
                /**
                 * Aca clearSelection va limpiando los botones
                 */
                verdadero.setText("Verdadero");
                falso.setText("Falso");

                //verdadero.requestFocus();
            } else {

            }
            for (int i = 0; i < opcion.length; i++) {
                System.out.println(opcion[i]);
            }
        }
    }

    private class oyenteOpcion1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
            if (pos < opcion.length) {
                opcion[pos] = verdadero.getText();
                /**
                 * Si Preciona el boton verdadero sucede esto
                 */
                
            } else {
                /**
                 * Va guardando los getlabel, tipo el titulo del boton en una
                 * matriz. Despues las comparo con la Matriz que contiene las
                 * respuestas
                 */

            }
        }
    }

    private class oyenteOpcion2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            // TODO Auto-generated method stub
            if (pos < opcion.length) {
                
                opcion[pos] = falso.getText();
                /**
                 * Si Preciona el boton falso sucede esto
                 */
                
            } else {

            }
        }
    }

    private class oyenteEntregar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            int cont = 0;
            for (int i = 0; i < respuestas.length; i++) {
                if (opcion[i].equalsIgnoreCase(respuestas[i])) {
                    cont = cont + 1;
                }
            }
            System.out.println(cont);
            cont=cont*100;
            int calif= cont/(preguntas.length*10);
            
            /**
             * Aca nose porque me aparece 0 cuando responde solo una pregunta
             * buena
             */

            JOptionPane.showMessageDialog(null, "Tu calificacion es " + calif+"/10");
            System.exit(0);
        }
    }
}
