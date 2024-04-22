package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.exception.ColorNullException;
import ar.edu.utn.frba.dds.exception.MaterialNullException;
import ar.edu.utn.frba.dds.exception.TipoNullException;
import ar.edu.utn.frba.dds.exception.TramaNullException;

public class BorradorPrenda {
  private Tipo tipo;
  private Trama trama;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public BorradorPrenda() {}

  public BorradorPrenda tipo(Tipo tipo) {
    this.tipo = tipo;
    return this;
  }

  public BorradorPrenda trama(Trama trama) {
    this.trama = trama;
    return this;
  }

  public BorradorPrenda material(Material material) {
    this.material = material;
    return this;
  }

  public BorradorPrenda colorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
    return this;
  }

  public BorradorPrenda colorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
    return this;
  }

  public Prenda crear() {
    validarBorrador();
    return new Prenda(tipo, trama, material, colorPrimario, colorSecundario);
  }

  public void validarBorrador() {
    if (this.tipo == null) {
      throw new TipoNullException("El tipo NO puede ser null");
    }
    if (this.trama == null) {
      throw new TramaNullException("La trama NO puede ser null");
    }
    if (this.material == null) {
      throw new MaterialNullException("El material NO puede ser null");
    }
    if (this.colorPrimario == null) {
      throw new ColorNullException("El color primario NO puede ser null");
    }
  }

  public Tipo getTipo() {
    return tipo;
  }

  public Trama getTrama() {
    return trama;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
