/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p39.reto4.model.vo.Proyecto;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

/**
 *
 * @author HP
 */
public class ProyectoDao {
    public ArrayList<Proyecto> proyecto() throws SQLException {
    ArrayList<Proyecto> result = new ArrayList<Proyecto>();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      String sql ="SELECT * FROM Proyecto p";
      conn = JDBCUtilities.getConnection();
      stmt = conn.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Proyecto proyecto = new Proyecto();
        proyecto.setIdProyecto(rs.getInt("ID_Proyecto"));
        proyecto.setFechaInicio(rs.getString("Fecha_Inicio"));
        proyecto.setConstructora(rs.getString("Constructora"));
        proyecto.setNumeroBanos(rs.getInt("Numero_Banos"));
        proyecto.setNumeroHabitaciones(rs.getInt("Numero_Habitaciones"));
        proyecto.setBancoVinculado(rs.getString("Banco_Vinculado"));
        proyecto.setPorcentajeCuotaInicial(rs.getString("Porcentaje_Cuota_Inicial"));
        proyecto.setCiudad(rs.getString("Ciudad"));
        proyecto.setClasificacion(rs.getString("Clasificacion"));
        proyecto.setAcabados(rs.getString("Acabados"));
        proyecto.setSerial(rs.getString("Serial"));
        proyecto.setIdTipo(rs.getInt("ID_Tipo"));
        proyecto.setIdLider(rs.getInt("ID_Lider"));

        result.add(proyecto);
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
