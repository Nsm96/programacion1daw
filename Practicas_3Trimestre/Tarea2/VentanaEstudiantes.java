import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class VentanaEstudiantes extends JFrame {

    private ArrayList<Estudiante> listaEstudiantes;
    private DefaultTableModel modelo;
    private JTextField txtNombre, txtEdad, txtCurso;

    public VentanaEstudiantes() {
        setTitle("Lista de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listaEstudiantes = new ArrayList<>();

        JPanel panelFormulario = new JPanel(new GridLayout(2, 4, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCurso = new JTextField();
        JButton btnAgregar = new JButton("Agregar");

        panelFormulario.add(new JLabel("Nombre"));
        panelFormulario.add(new JLabel("Edad"));
        panelFormulario.add(new JLabel("Curso"));
        panelFormulario.add(new JLabel(""));

        panelFormulario.add(txtNombre);
        panelFormulario.add(txtEdad);
        panelFormulario.add(txtCurso);
        panelFormulario.add(btnAgregar);

        String[] columnas = {"Nombre", "Edad", "Curso"};
        modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        tabla.setRowHeight(25);
        tabla.getTableHeader().setBackground(Color.LIGHT_GRAY);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        btnAgregar.addActionListener(e -> agregarEstudiante());

        add(panelFormulario, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void agregarEstudiante() {
        String nombre = txtNombre.getText();
        String edadTexto = txtEdad.getText();
        String curso = txtCurso.getText();

        if (nombre.isEmpty() || edadTexto.isEmpty() || curso.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos");
            return;
        }

        int edad = Integer.parseInt(edadTexto);

        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        listaEstudiantes.add(estudiante);

        Object[] fila = {estudiante.getNombre(), estudiante.getEdad(), estudiante.getCurso()};
        modelo.addRow(fila);

        txtNombre.setText("");
        txtEdad.setText("");
        txtCurso.setText("");
    }

    public static void main(String[] args) {
        new VentanaEstudiantes().setVisible(true);
    }
}