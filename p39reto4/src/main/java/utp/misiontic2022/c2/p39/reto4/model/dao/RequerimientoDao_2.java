package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

  public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
    ArrayList<Requerimiento_2> result = new ArrayList<Requerimiento_2>();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      String sql =
        "SELECT p.Fecha_Inicio AS 'Fec. Ini.', p.Ciudad AS 'Nombre Ciudad'," +
        "p.Constructora AS 'Nom. Constructora', l.Nombre ||' '|| l.Segundo_Apellido AS 'Nombre Lider'," +
        "t.Codigo_Tipo AS 'Codigo Tipo',t.Estrato " +
        "FROM Proyecto p " +
        "INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider " +
        "INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo " +
        "WHERE p.Fecha_Inicio BETWEEN '2020-01-01' AND '2020-07-09' " +
        "AND p.Ciudad = 'Ibague'";
      conn = JDBCUtilities.getConnection();
      stmt = conn.prepareStatement(sql);
      rs = stmt.executeQuery();

      while (rs.next()) {
        Requerimiento_2 requerimiento2 = new Requerimiento_2();
        requerimiento2.setFechaInicio(rs.getString("Fec. Ini."));
        requerimiento2.setNombreCiudad(rs.getString("Nombre Ciudad"));
        requerimiento2.setNombreConstructora(rs.getString("Nom. Constructora"));
        requerimiento2.setNombreLider(rs.getString("Nombre Lider"));
        requerimiento2.setCodigoTipo(rs.getString("Codigo Tipo"));
        requerimiento2.setEstrato(rs.getString("Estrato"));

        result.add(requerimiento2);
      }
      rs.close();
      stmt.close();
    } catch (SQLException ex) {
      System.out.println(
        "Error en la consulta del requerimiento 2 " + ex.getMessage()
      );
    } finally {
      if (conn != null) {
        conn.close();
      }
    }

    return result;
  }
    public ArrayList<Requerimiento_2> requerimiento2(String fIni, String fFinal, String ciudad) throws SQLException {
    ArrayList<Requerimiento_2> result = new ArrayList<Requerimiento_2>();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      String sql =
        "SELECT p.Fecha_Inicio AS 'Fec. Ini.', p.Ciudad AS 'Nombre Ciudad'," +
        "p.Constructora AS 'Nom. Constructora', l.Nombre ||' '|| l.Segundo_Apellido AS 'Nombre Lider'," +
        "t.Codigo_Tipo AS 'Codigo Tipo',t.Estrato " +
        "FROM Proyecto p " +
        "INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider " +
        "INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo " +
        "WHERE p.Fecha_Inicio BETWEEN '"+fIni+"' AND '"+fFinal+"' " +
        "AND p.Ciudad = '"+ciudad+"'";
      conn = JDBCUtilities.getConnection();
      stmt = conn.prepareStatement(sql);
      rs = stmt.executeQuery();

      while (rs.next()) {
        Requerimiento_2 requerimiento2 = new Requerimiento_2();
        requerimiento2.setFechaInicio(rs.getString("Fec. Ini."));
        requerimiento2.setNombreCiudad(rs.getString("Nombre Ciudad"));
        requerimiento2.setNombreConstructora(rs.getString("Nom. Constructora"));
        requerimiento2.setNombreLider(rs.getString("Nombre Lider"));
        requerimiento2.setCodigoTipo(rs.getString("Codigo Tipo"));
        requerimiento2.setEstrato(rs.getString("Estrato"));

        result.add(requerimiento2);
      }
      rs.close();
      stmt.close();
    } catch (SQLException ex) {
      System.out.println(
        "Error en la consulta del requerimiento 2 " + ex.getMessage()
      );
    } finally {
      if (conn != null) {
        conn.close();
      }
    }

    return result;
  }
}
