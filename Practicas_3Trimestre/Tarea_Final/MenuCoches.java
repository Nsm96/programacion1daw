import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MenuCoches extends JFrame {

    private ArrayList<Coche> listaCoches;

    public MenuCoches() {
        listaCoches = new ArrayList<>();

        setTitle("Gestión de Coches");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem itemAgregar = new JMenuItem("Añadir Coche");
        JMenuItem itemMostrar = new JMenuItem("Mostrar Coches");

        menu.add(itemAgregar);
        menu.add(itemMostrar);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        itemAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormulario();
            }
        });

        itemMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTablaCoches();
            }
        });

        JLabel titulo = new JLabel("Menú de Gestión de Coches", SwingConstants.CENTER);
        add(titulo, BorderLayout.CENTER);
    }

    private void abrirFormulario() {
        JDialog dialogo = new JDialog(this, "Añadir Coche", true);
        dialogo.setSize(400, 250);
        dialogo.setLocationRelativeTo(this);
        dialogo.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();

        JLabel lblAnio = new JLabel("Año:");
        JTextField txtAnio = new JTextField();

        JLabel lblColor = new JLabel("Color:");
        JTextField txtColor = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        dialogo.add(lblMarca);
        dialogo.add(txtMarca);
        dialogo.add(lblAnio);
        dialogo.add(txtAnio);
        dialogo.add(lblColor);
        dialogo.add(txtColor);
        dialogo.add(new JLabel());
        dialogo.add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = txtMarca.getText().trim();
                String anioTexto = txtAnio.getText().trim();
                String color = txtColor.getText().trim();

                if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()) {
                    JOptionPane.showMessageDialog(dialogo, "No se permiten campos vacíos.");
                    return;
                }

                if (!anioTexto.matches("\\d+")) {
                    JOptionPane.showMessageDialog(dialogo, "El campo Año solo debe contener números.");
                    return;
                }

                int anio = Integer.parseInt(anioTexto);
                Coche coche = new Coche(marca, anio, color);
                listaCoches.add(coche);

                JOptionPane.showMessageDialog(dialogo, "Coche añadido correctamente.");
                dialogo.dispose();
            }
        });

        dialogo.setVisible(true);
    }

    private void mostrarTablaCoches() {
        JFrame ventanaTabla = new JFrame("Lista de Coches");
        ventanaTabla.setSize(500, 300);
        ventanaTabla.setLocationRelativeTo(this);

        String[] columnas = {"Marca", "Año", "Color"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Coche coche : listaCoches) {
            Object[] fila = {coche.getMarca(), coche.getAnio(), coche.getColor()};
            modelo.addRow(fila);
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        ventanaTabla.add(scrollPane);
        ventanaTabla.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuCoches().setVisible(true);
    }
}