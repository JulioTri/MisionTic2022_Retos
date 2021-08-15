package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {

  public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
    // Su código
    ArrayList<Requerimiento_3> result = new ArrayList<Requerimiento_3>();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      String sql =
        "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido ,1,3) || SUBSTR(l.Segundo_Apellido ,1,3) " +
        "AS 'Abrev.' FROM Lider l ";
      conn = JDBCUtilities.getConnection();
      stmt = conn.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Requerimiento_3 requerimiento3 = new Requerimiento_3();
        requerimiento3.setNombreAbreviado(rs.getString("Abrev."));

        result.add(requerimiento3);
      }
      rs.close();
      stmt.close();
    } catch (SQLException ex) {
      System.out.println(
        "Error en la consulta del requerimiento 3 " + ex.getMessage()
      );
    } finally {
      if (conn != null) {
        conn.close();
      }
    }
    return result;
  }
}
