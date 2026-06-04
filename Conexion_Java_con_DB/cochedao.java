import java.sql.*;
import java.util.ArrayList;

public class cochedao {

    public void insertarCoche(Coche coche) {
        String sql = "INSERT INTO coches (marca, anio, color) VALUES (?, ?, ?)";

        try (Connection con = conexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, coche.getMarca());
            ps.setInt(2, coche.getAnio());
            ps.setString(3, coche.getColor());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Coche> obtenerCoches() {
        ArrayList<Coche> lista = new ArrayList<>();
        String sql = "SELECT * FROM coches";

        try (Connection con = conexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Coche coche = new Coche(
                        rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getInt("anio"),
                        rs.getString("color")
                );
                lista.add(coche);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void actualizarCoche(Coche coche) {
        String sql = "UPDATE coches SET marca = ?, anio = ?, color = ? WHERE id = ?";

        try (Connection con = conexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, coche.getMarca());
            ps.setInt(2, coche.getAnio());
            ps.setString(3, coche.getColor());
            ps.setInt(4, coche.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCoche(int id) {
        String sql = "DELETE FROM coches WHERE id = ?";

        try (Connection con = conexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}