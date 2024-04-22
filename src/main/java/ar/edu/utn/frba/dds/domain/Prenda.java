package ar.edu.utn.frba.dds.domain;

public class Prenda {
  private Tipo tipo;
  private Trama trama;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(
      Tipo tipo,
      Trama trama,
      Material material,
      Color colorPrimario,
      Color colorSecundario) {
    this.tipo = tipo;
    this.trama = trama;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Tipo getTipo() {
    return tipo;
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

  public Trama getTrama() {
    return trama;
  }
}
