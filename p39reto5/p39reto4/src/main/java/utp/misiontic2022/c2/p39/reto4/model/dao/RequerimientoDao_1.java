package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_1 {

  public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
    ArrayList<Requerimiento_1> result = new ArrayList<Requerimiento_1>();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      String sql =
        "SELECT c.Fecha AS 'Fecha Compra',c.Proveedor AS 'Nom. Proveedor', c.ID_Compra AS 'Codigo Compra' , c.Pagado " +
        "FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 15;";
      conn = JDBCUtilities.getConnection();
      stmt = conn.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Requerimiento_1 requerimiento1 = new Requerimiento_1();
        requerimiento1.setFechaCompra(rs.getString("Fecha Compra"));
        requerimiento1.setNombreProveedor(rs.getString("Nom. Proveedor"));
        requerimiento1.setCodigoCompra(rs.getString("Codigo Compra"));
        requerimiento1.setValorPagado(rs.getString("Pagado"));

        result.add(requerimiento1);
      }
      rs.close();
      stmt.close();
    } catch (SQLException ex) {
      System.out.println(
        "Error en la consulta del requerimiento 1 " + ex.getMessage()
      );
    } finally {
      if (conn != null) {
        conn.close();
      }
    }
    return result;
  }
}
