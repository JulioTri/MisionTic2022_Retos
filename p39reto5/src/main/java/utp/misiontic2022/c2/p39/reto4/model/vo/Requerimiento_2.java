package utp.misiontic2022.c2.p39.reto4.model.vo;

public class Requerimiento_2 {

  // Operaciones de la clase requerimiento 2 -- su código
  private String fechaInicio;
  private String nombreCiudad;
  private String nombreConstructora;
  private String nombreLider;
  private String codigoTipo;
  private String estrato;

  public Requerimiento_2() {}

  public Requerimiento_2(
    String fechaInicio,
    String nombreCiudad,
    String nombreConstructora,
    String nombreLider,
    String codigoTipo,
    String estrato
  ) {
    this.setFechaInicio(fechaInicio);
    this.setNombreCiudad(nombreCiudad);
    this.setNombreConstructora(nombreConstructora);
    this.setNombreLider(nombreLider);
    this.setCodigoTipo(codigoTipo);
    this.setEstrato(estrato);
  }

  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public String getNombreCiudad() {
    return nombreCiudad;
  }

  public void setNombreCiudad(String nombreCiudad) {
    this.nombreCiudad = nombreCiudad;
  }

  public String getNombreConstructora() {
    return nombreConstructora;
  }

  public void setNombreConstructora(String nombreConstructora) {
    this.nombreConstructora = nombreConstructora;
  }

  public String getNombreLider() {
    return nombreLider;
  }

  public void setNombreLider(String nombreLider) {
    this.nombreLider = nombreLider;
  }

  public String getCodigoTipo() {
    return codigoTipo;
  }

  public void setCodigoTipo(String codigoTipo) {
    this.codigoTipo = codigoTipo;
  }

  public String getEstrato() {
    return estrato;
  }

  public void setEstrato(String estrato) {
    this.estrato = estrato;
  }
}
