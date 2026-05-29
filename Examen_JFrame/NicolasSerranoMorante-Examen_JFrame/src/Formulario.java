import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Formulario extends JFrame {
    public Formulario(ArrayList<Libro> libros) {
        setTitle("Datos del libro");
        setSize(350, 220);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 3));

        JTextField txtTitulo = new JTextField();
        JTextField txtAutor = new JTextField();
        JTextField txtAnio = new JTextField();
        JButton botonGuardar = new JButton("Guardar");


        add(new JLabel("Título:"));
        add(txtTitulo);
        add(new JLabel("Autor:"));
        add(txtAutor);
        add(new JLabel("Año:"));
        add(txtAnio);
        add(new JLabel(""));
        add(botonGuardar);


        botonGuardar.addActionListener(e -> {
            String titulo = txtTitulo.getText().trim();
            String autor = txtAutor.getText().trim();
            String anioTexto = txtAnio.getText().trim();

            if (titulo.isEmpty() || autor.isEmpty() || anioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: campos vacíos");
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);
                Libro libro = new Libro(titulo, autor, anio);
                libros.add(libro);
                JOptionPane.showMessageDialog(this, "¡Libro añadido!");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: se requiere que se inserten sólo números");
            }

        });
        setVisible(true);

    }
}






