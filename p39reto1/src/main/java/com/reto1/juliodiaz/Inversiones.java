package com.reto1.juliodiaz;

/**
 * clase inversiones
 */

public class Inversiones {

    private int vTiempo;
    private double vMonto;
    private double vInteres;

    public void Inversiones() {
        this.vInteres = 0;
        this.vMonto = 0;
        this.vInteres = 0;
    }

    public int getVTiempo() {
        return this.vTiempo;
    }

    public void setVTiempo(int vTiempo) {
        this.vTiempo = vTiempo;
    }

    public double getVMonto() {
        return this.vMonto;
    }

    public void setVMonto(double vMonto) {
        this.vMonto = vMonto;
    }

    public double getVInteres() {
        return this.vInteres;
    }

    public void setVInteres(double vInteres) {
        this.vInteres = vInteres;
    }

    public String validarInversion(int vTiempo, double vMonto, double vIteres) {
        double interesSimple = vMonto * vIteres * vTiempo;
        double interesCompuesto = vMonto * (Math.pow((1 + vIteres), vTiempo) - 1);

        Double validacion = interesCompuesto - interesSimple;
        StringBuilder validarInversion = new StringBuilder();
        if (vTiempo != 0 && vMonto != 0 && vIteres != 0){
            validarInversion.append("La diferencia en el total de intereses generados para el proyecto, ");
            validarInversion.append("si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa ");
            validarInversion.append("de interés Simple, asciende a la cifra de: $");
            validarInversion.append(validacion);
        }else{
            validarInversion.append("Faltan datos para calcular la diferencia en el total ");
            validarInversion.append("de intereses generados para el proyecto.");
        }
        return validarInversion.toString();
    }

}
