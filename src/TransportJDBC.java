import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by DAM on 27/1/17.
 */
public class TransportJDBC {

    private Connection conexion;

    public void insertPackage(Package p)throws SQLException {
        String insertar = "insert into package values (null, ?, ?, ?);";
        PreparedStatement ps = conexion.prepareStatement(insertar);
        // Vamos dando valores a los interrogantes
        //insertar un paquete
        ps.setString(1, p.getCustomer());
        ps.setString(2, p.getTruckdriver().getName());
        ps.setString(3, p.getCity().getName());
        ps.executeUpdate();
        ps.close();
    }

    public void modificarSalario(truckdriver t, double salary)throws SQLException{
    String modificar = "update truckdriver set salary = ? WHERE name = ?";
    PreparedStatement ps = conexion.prepareStatement(modificar);
    ps.setDouble(1, t.getSalary());
    ps.setString(2, t.getName());
    ps.executeUpdate();
    ps.close();
    }



    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/transport";
        String usr = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, usr, pass);
    }

    // Función que desconecta de la bbdd
    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

}
