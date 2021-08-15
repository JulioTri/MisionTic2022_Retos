package com.misiontic2022.nuevosproductos;
public class Alimentos {

  private Double PRECIO_BASE = 80.0;
  private Integer PESO_BASE = 5;
  private char TIPO_ALIMENTO = 'N';
  private Double precioBase;
  private Integer peso;
  private char tipoAlimento;

  public Alimentos() {
    this.precioBase = PRECIO_BASE;
    this.peso = PESO_BASE;
    this.tipoAlimento = TIPO_ALIMENTO;
  }

  public Alimentos(Double precioBase, Integer peso) {
    this.precioBase = precioBase;
    if (precioBase.equals(null)) {
      this.precioBase = PRECIO_BASE;
    }
    this.peso = peso;
    if (peso.equals(null)) {
      this.peso = PESO_BASE;
    }
    this.tipoAlimento = TIPO_ALIMENTO;
  }

  public Alimentos(Double precioBase, Integer peso, char tipoAlimento) {
    this.precioBase = precioBase;
    if (precioBase.equals(null)) {
      this.precioBase = PRECIO_BASE;
    }
    this.peso = peso;
    if (peso.equals(null)) {
      this.peso = PESO_BASE;
    }
    this.tipoAlimento = tipoAlimento;
    if (tipoAlimento == ' '){
      this.tipoAlimento = TIPO_ALIMENTO;
    }
    this.tipoAlimento = TIPO_ALIMENTO;
  }

  public void comprobarTipoAlimento(char tipoAlimento) {
    if (this.tipoAlimento != 'N' && this.tipoAlimento != 'C' ) {
      tipoAlimento = TIPO_ALIMENTO;
    } else if (this.tipoAlimento == 'N' || this.tipoAlimento == 'C') {
      this.tipoAlimento = tipoAlimento;
    }
  }

  public Double calcularPrecio() {
    Double adicion = 0.00;
    if (this.tipoAlimento == 'N' || this.tipoAlimento != 'N' && this.tipoAlimento != 'C' ) {
      adicion = 40.00;
    } else if (this.tipoAlimento == 'C' || this.tipoAlimento == 'c') {
      adicion = 20.00;
    }
    if (this.peso >= 0 && this.peso <= 9) {
      adicion = adicion + 6.00;
    } else if (this.peso > 9 && this.peso <= 16) {
      adicion = adicion + 8.00;
    } else {
      adicion = adicion + 20.00;
    }
    Double precioFinal = this.precioBase + adicion;
    return precioFinal;
  }
}
