import java.sql.Driver;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by DAM on 27/1/17.
 */
public class Transport {

    public static void main(String[] args) {


        TransportJDBC gestor = new TransportJDBC();

          try{

             System.out.println("Estableciendo conexión con la bbdd...");
             gestor.conectar();
             System.out.println("Conectado a la bbdd transport");

             gestor.desconectar();
             System.out.println("Cerrada la conexión con la bbdd.");

            } catch (SQLException ex){

             System.out.println("error " + ex.getMessage());

            }

        }
    }
