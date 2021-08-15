package com.misiontic2022.nuevosproductos;

public class PrecioTotal {

  private Double tAlimentos;
  private Double tRefrescos;
  private Double tCarnicos;
  private Alimentos[] listaAlimentos;

  public PrecioTotal() {}

  public PrecioTotal(Alimentos[] listaAlimentos) {
    this.listaAlimentos = listaAlimentos;
    tAlimentos = 0.00;
    tRefrescos = 0.00;
    tCarnicos = 0.00;
    for (Alimentos alimentos : this.listaAlimentos) {
      if (alimentos.getClass() == Refrescos.class) {
        tRefrescos += alimentos.calcularPrecio();
      } else if (alimentos.getClass() == Carnicos.class) {
        tCarnicos += alimentos.calcularPrecio();
      } 
      tAlimentos += alimentos.calcularPrecio();
    }
  }

  public void mostrarTotal() {
    System.out.println(
      "El precio total de los Productos Alimentos es de " + tAlimentos
    );
    System.out.println(
      "La suma del precio de los Refrescos es de " + tRefrescos
    );
    System.out.println("La suma del precio de los Cárnicos es de " + tCarnicos);
  }
}
