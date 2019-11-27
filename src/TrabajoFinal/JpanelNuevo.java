package TrabajoFinal;

import javax.swing.*;

public class JpanelNuevo extends JPanel {

    private String titulo;

    public JpanelNuevo(String titulo) {
        this.titulo = titulo;
        etiquetas();
        botones();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    private void etiquetas() {

        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel();

        etiqueta2.setText(getTitulo());
        etiqueta2.setBounds(75, 10, 500, 20);
        add(etiqueta2);

        etiqueta1.setText("1,2,3,4...) Pregunta......... ");
        etiqueta1.setBounds(10, 70, 500, 20);
        add(etiqueta1);

    }

    private void botones() {
        JRadioButton verdadero = new JRadioButton();
        JRadioButton falso = new JRadioButton();
        JButton siguiente = new JButton();


        verdadero.setBounds(10, 100, 100, 30);
        verdadero.setText("VERDADERO");
        add(verdadero);

        falso.setBounds(10, 130, 100, 30);
        falso.setText("FALSO");
        add(falso);

        siguiente.setBounds(30, 200, 100, 30);
        siguiente.setText("Siguiente");
        add(siguiente);


    }
}
