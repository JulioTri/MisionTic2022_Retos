package com.misiontic2022.nuevosproductos;

public class Refrescos extends Alimentos {

  private char LUGAR_ORIGEN = 'N';
  private char lugarOrigen;

  public Refrescos() {
    this.lugarOrigen = LUGAR_ORIGEN;
  }

  public Refrescos(Double precioBase, Integer peso) {
    super(precioBase, peso);
    this.lugarOrigen = LUGAR_ORIGEN;
  }

  public Refrescos(Double precioBase, Integer peso, char lugarOrigen) {
    super(precioBase, peso);
    this.lugarOrigen = lugarOrigen;
    if (lugarOrigen == ' ') {
      this.lugarOrigen = LUGAR_ORIGEN;
    }
  }

  public void comprobarLugarOrigen(char lugarOrigen) {}

  public Double calcularPrecio() {
    Double adicion = 0.00;
    if (this.lugarOrigen == 'N' || this.lugarOrigen != 'N') {
      adicion = 5.00;
    } else if (this.lugarOrigen == 'I' ) {
      adicion = 15.00;
    }
    Double precioFinal = super.calcularPrecio() + adicion;
    return precioFinal;
  }
}
