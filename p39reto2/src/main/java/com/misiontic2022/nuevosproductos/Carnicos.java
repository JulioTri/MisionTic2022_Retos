package com.misiontic2022.nuevosproductos;

public class Carnicos extends Alimentos {

  private Integer TEMPERATURA = 10;
  private Integer temperatura;

  public Carnicos() {
    this.temperatura = TEMPERATURA;
  }

  public Carnicos(Double precioBase, Integer peso) {
    super(precioBase, peso);
    this.temperatura = TEMPERATURA;
  }

  public Carnicos(Double precioBase, Integer peso, Integer temperatura) {
    super(precioBase, peso);
    this.temperatura = temperatura;
    if (temperatura.equals(null)) {
      this.temperatura = TEMPERATURA;
    }
  }

  public Double calcularPrecio() {
    Double adicion = 0.00;
    if (this.temperatura >= 5 && this.temperatura < 10) {
      adicion = 20.00;
    } else if (this.temperatura >= 10 && this.temperatura <= 15) {
      adicion = 18.00;
    } else {
      adicion = 5.00;
    }
    Double precioFinal = super.calcularPrecio() + adicion;
    return precioFinal;
  }
}
