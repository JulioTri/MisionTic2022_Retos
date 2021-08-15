/**
 * No se debe modificar
 */
package utp.misiontic2022.c2.p39.reto4.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "C:/Users/HP/Desktop/accesos/MisionTic/ciclo2/Programacion2/reto3/ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;
        Connection conn =null;
        
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conextar a la base de datos");
        }
        return conn;
    }
}
