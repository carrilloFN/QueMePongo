package ar.edu.utn.frba.dds.domain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.exception.ColorNullException;
import ar.edu.utn.frba.dds.exception.MaterialNullException;
import ar.edu.utn.frba.dds.exception.TipoNullException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BorradorPrendaTest {

  @DisplayName("Crear una prenda sin tipo arroja un TipoNullException")
  @Test
  public void crearPrendaSinTipoLanzaTipoNullException(){
    assertThrows(TipoNullException.class, () -> new Prenda(null, Material.LANA, Color.ROJO, null ));
    assertThrows(TipoNullException.class, () -> new Prenda(null, Material.LANA, Color.ROJO, Color.NEGRO ));
  }

  @DisplayName("Crear una prenda sin material arroja un MaterialNullException")
  @Test
  public void crearPrendaSinMaterialLanzaMaterialNullException(){
    assertThrows(MaterialNullException.class, () -> new Prenda(Tipo.REMERA, null, Color.ROJO, null ));
    assertThrows(MaterialNullException.class, () -> new Prenda(Tipo.REMERA, null, Color.ROJO, Color.NEGRO ));
  }

  @DisplayName("Crear una prenda sin color principal arroja un MaterialNullException")
  @Test
  public void crearPrendaSinColorPrincipalLanzaColorNullException(){
    assertThrows(ColorNullException.class, () -> new Prenda(Tipo.REMERA, Material.MODAL, null, null ));
    assertThrows(ColorNullException.class, () -> new Prenda(Tipo.REMERA, Material.MODAL, null, Color.NEGRO ));
  }

  @DisplayName("Es válido crear una prenda sin color secundario")
  @Test
  public void esOpcionalCrearPrendaConColorSecundario(){
    assertDoesNotThrow( () -> new Prenda(Tipo.REMERA, Material.MODAL, Color.AZUL, null ));
  }

}