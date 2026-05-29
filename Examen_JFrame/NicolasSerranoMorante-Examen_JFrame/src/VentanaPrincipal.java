import javax.swing.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {
    private ArrayList<Libro> libros = new ArrayList<>();

    public VentanaPrincipal() {
        setTitle("Gestión de Libros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem libroAgregar = new JMenuItem("Añadir Libro");
        JMenuItem libroMostrar = new JMenuItem("Mostrar Libros");

        libroAgregar.addActionListener(e ->
                new Formulario(libros));
        libroMostrar.addActionListener(e ->
                new ListaLibros(libros));


        menu.add(libroAgregar);
        menu.add(libroMostrar);
        menuBar.add(menu);

        setJMenuBar(menuBar);

        setVisible(true);
    }
}
