package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.exception.CategoriaNullException;

public enum Tipo {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR),
  REMERA(Categoria.SUPERIOR),
  PANTALON(Categoria.INFERIOR);

  private Categoria categoria;

  Tipo(Categoria categoria) {
    if (categoria == null) {
      throw new CategoriaNullException("La categoria NO puede ser null");
    }
    this.categoria = categoria;
  }
}
