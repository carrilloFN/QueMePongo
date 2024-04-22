package ar.edu.utn.frba.dds.domain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.exception.ColorNullException;
import ar.edu.utn.frba.dds.exception.MaterialNullException;
import ar.edu.utn.frba.dds.exception.TipoNullException;
import ar.edu.utn.frba.dds.exception.TramaNullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BorradorPrendaTest {

  private BorradorPrenda borrador;

  @BeforeEach
  public void setUp(){
    borrador = borradorValido();
  }

  public BorradorPrenda borradorValido(){
    return new BorradorPrenda()
      .tipo(Tipo.REMERA)
      .trama(Trama.LISA)
      .material(Material.MODAL)
      .colorPrimario(Color.ROJO)
      .colorSecundario(Color.NEGRO);
  }

  @DisplayName("Crear una prenda sin tipo arroja un TipoNullException")
  @Test
  public void crearPrendaSinTipoLanzaTipoNullException(){
    borrador.tipo(null);
    assertThrows(TipoNullException.class, () -> borrador.crear());
  }

  @DisplayName("Crear una prenda sin trama arroja un TramaNullException")
  @Test
  public void crearPrendaSinTramaLanzaTramaNullException(){
    borrador.trama(null);
    assertThrows(TramaNullException.class, () -> borrador.crear());
  }

  @DisplayName("Crear una prenda sin material arroja un MaterialNullException")
  @Test
  public void crearPrendaSinMaterialLanzaMaterialNullException(){
    borrador.material(null);
    assertThrows(MaterialNullException.class, () -> borrador.crear());
  }

  @DisplayName("Crear una prenda sin color principal arroja un MaterialNullException")
  @Test
  public void crearPrendaSinColorPrincipalLanzaColorNullException(){
    borrador.colorPrimario(null);
    assertThrows(ColorNullException.class, () -> borrador.crear());
  }

  @DisplayName("Es válido crear una prenda sin color secundario")
  @Test
  public void esOpcionalCrearPrendaConColorSecundario(){
    borrador.colorSecundario(null);
    assertDoesNotThrow( () -> borrador.crear());
  }

}