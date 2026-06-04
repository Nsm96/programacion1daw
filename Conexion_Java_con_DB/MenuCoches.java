import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MenuCoches extends JFrame {

    private cochedao cocheDAO;

    public MenuCoches() {
        cocheDAO = new cochedao();

        setTitle("Gestión de Coches");
        setSize(600, 300);
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

        itemAgregar.addActionListener(e -> abrirFormularioInsertar());
        itemMostrar.addActionListener(e -> mostrarTablaCoches());
    }

    private void abrirFormularioInsertar() {
        JDialog dialogo = new JDialog(this, "Añadir Coche", true);
        dialogo.setSize(400, 250);
        dialogo.setLocationRelativeTo(this);
        dialogo.setLayout(new GridLayout(4, 2, 10, 10));

        JTextField txtMarca = new JTextField();
        JTextField txtAnio = new JTextField();
        JTextField txtColor = new JTextField();
        JButton btnGuardar = new JButton("Guardar");

        dialogo.add(new JLabel("Marca:"));
        dialogo.add(txtMarca);
        dialogo.add(new JLabel("Año:"));
        dialogo.add(txtAnio);
        dialogo.add(new JLabel("Color:"));
        dialogo.add(txtColor);
        dialogo.add(new JLabel());
        dialogo.add(btnGuardar);

        btnGuardar.addActionListener(e -> {
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
            cocheDAO.insertarCoche(new Coche(marca, anio, color));

            JOptionPane.showMessageDialog(dialogo, "Coche añadido correctamente.");
            dialogo.dispose();
        });

        dialogo.setVisible(true);
    }

    private void mostrarTablaCoches() {
        JFrame ventanaTabla = new JFrame("Lista de Coches");
        ventanaTabla.setSize(700, 300);
        ventanaTabla.setLocationRelativeTo(this);

        String[] columnas = {"ID", "Marca", "Año", "Color"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        ArrayList<Coche> listaCoches = cocheDAO.obtenerCoches();
        for (Coche coche : listaCoches) {
            Object[] fila = {coche.getId(), coche.getMarca(), coche.getAnio(), coche.getColor()};
            modelo.addRow(fila);
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

        btnEditar.addActionListener(e -> {
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(ventanaTabla, "Selecciona un coche para editar.");
                return;
            }

            int id = (int) modelo.getValueAt(filaSeleccionada, 0);
            String marcaActual = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anioActual = (int) modelo.getValueAt(filaSeleccionada, 2);
            String colorActual = (String) modelo.getValueAt(filaSeleccionada, 3);

            JTextField txtMarca = new JTextField(marcaActual);
            JTextField txtAnio = new JTextField(String.valueOf(anioActual));
            JTextField txtColor = new JTextField(colorActual);

            Object[] campos = {
                    "Marca:", txtMarca,
                    "Año:", txtAnio,
                    "Color:", txtColor
            };

            int opcion = JOptionPane.showConfirmDialog(
                    ventanaTabla,
                    campos,
                    "Editar coche",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (opcion == JOptionPane.OK_OPTION) {
                if (txtMarca.getText().trim().isEmpty() || txtAnio.getText().trim().isEmpty() || txtColor.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(ventanaTabla, "No se permiten campos vacíos.");
                    return;
                }

                if (!txtAnio.getText().trim().matches("\\d+")) {
                    JOptionPane.showMessageDialog(ventanaTabla, "El año debe ser numérico.");
                    return;
                }

                Coche cocheActualizado = new Coche(
                        id,
                        txtMarca.getText().trim(),
                        Integer.parseInt(txtAnio.getText().trim()),
                        txtColor.getText().trim()
                );

                cocheDAO.actualizarCoche(cocheActualizado);
                ventanaTabla.dispose();
                mostrarTablaCoches();
            }
        });

        btnEliminar.addActionListener(e -> {
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(ventanaTabla, "Selecciona un coche para eliminar.");
                return;
            }

            int id = (int) modelo.getValueAt(filaSeleccionada, 0);

            int confirmacion = JOptionPane.showConfirmDialog(
                    ventanaTabla,
                    "¿Seguro que quieres eliminar este coche?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                cocheDAO.eliminarCoche(id);
                ventanaTabla.dispose();
                mostrarTablaCoches();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        ventanaTabla.add(scrollPane, BorderLayout.CENTER);
        ventanaTabla.add(panelBotones, BorderLayout.SOUTH);
        ventanaTabla.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuCoches().setVisible(true);
    }
}