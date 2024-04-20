package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.exception.ColorNullException;
import ar.edu.utn.frba.dds.exception.MaterialNullException;
import ar.edu.utn.frba.dds.exception.TipoNullException;

public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario) {
    if(tipo == null) throw new TipoNullException("El tipo NO puede ser null");
    this.material = material;
    if(material == null) throw new MaterialNullException("El material NO puede ser null");
    this.tipo = tipo;
    if(colorPrimario == null) throw new ColorNullException("El color primario NO puede ser null");
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
}
