import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ListaLibros extends JFrame {

    public ListaLibros(ArrayList<Libro> libros) {
        setTitle("Tabla de libros registrados");
        setSize(500, 300);
        setLocationRelativeTo(null);

        String[] columnas = {"Título", "Autor", "Año"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Libro l : libros) {
            modelo.addRow(new Object[]{
                    l.getTitulo(),
                    l.getAutor(),
                    l.getAnioPublicacion()
            });
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);


        setVisible(true);

    }
}









