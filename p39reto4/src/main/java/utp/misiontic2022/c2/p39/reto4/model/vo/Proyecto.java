/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p39.reto4.model.vo;

/**
 *
 * @author HP
 */
public class Proyecto {   
    private int idProyecto;
    private String fechaInicio;
    private String constructora;
    private int numeroBanos;
    private int numeroHabitaciones;
    private String bancoVinculado;
    private String porcentajeCuotaInicial;
    private String ciudad;
    private String clasificacion;
    private String acabados;
    private String serial;
    private int idTipo;
    private int idLider;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String fechaInicio, String constructora, int numeroBanos, int numeroHabitaciones, String bancoVinculado, String porcentajeCuotaInicial, String ciudad, String clasificacion, String acabados, String serial, int idTipo, int idLider) {
        this.idProyecto = idProyecto;
        this.fechaInicio = fechaInicio;
        this.constructora = constructora;
        this.numeroBanos = numeroBanos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.bancoVinculado = bancoVinculado;
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.acabados = acabados;
        this.serial = serial;
        this.idTipo = idTipo;
        this.idLider = idLider;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    public String getPorcentajeCuotaInicial() {
        return porcentajeCuotaInicial;
    }

    public void setPorcentajeCuotaInicial(String porcentajeCuotaInicial) {
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }
    
    
    
    
}
