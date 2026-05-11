import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioEstudiante {
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14));
      UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 14));
      UIManager.put("Label.font", new Font("Arial", Font.PLAIN, 14));
      UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 14));
    } catch (Exception e) {
      e.printStackTrace();
    }

    JFrame ventana = new JFrame("Formulario de Estudiante");
    ventana.setSize(400, 250);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2, 10, 10));
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtNombre = new JTextField();

    JLabel lblEdad = new JLabel("Edad:");
    JTextField txtEdad = new JTextField();

    JLabel lblCurso = new JLabel("Curso:");
    JTextField txtCurso = new JTextField();

    JButton btnGuardar = new JButton("Guardar");

    panel.add(lblNombre);
    panel.add(txtNombre);
    panel.add(lblEdad);
    panel.add(txtEdad);
    panel.add(lblCurso);
    panel.add(txtCurso);
    panel.add(new JLabel());
    panel.add(btnGuardar);

    btnGuardar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nombre = txtNombre.getText();
        String edad = txtEdad.getText();
        String curso = txtCurso.getText();

        String mensaje = "Datos del estudiante:\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Curso: " + curso;

        JOptionPane.showMessageDialog(ventana, mensaje);
      }
    });

    ventana.add(panel);
    ventana.setVisible(true);
  }
}