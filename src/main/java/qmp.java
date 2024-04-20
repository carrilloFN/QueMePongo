/*
  Comenzaremos definiendo que un atuendo es una combinación de prendas que tiene sentido usar juntas. Algunos ejemplos de atuendos podrían ser:
  tus anteojos de sol favoritos, una remera de mangas cortas azul, el pantalón que te regaló tu mamá y unas zapatillas converse.
  un pañuelo verde, una remera de mangas largas rayada, un pantalón de jean y un par de botas de cuero.
  una musculosa de mickey, una pollera amarilla y unas crocs.
  Como primer paso para generar los atuendos, les usuaries de QuéMePongo identificaron el siguiente requerimiento como principal:
  Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.
*/

/*
* Requerimiento 1: Como usuarie de QuéMePongo, quiero especificar
* qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).
* */
enum Trama{
  LISA,
  RAYADA,
  LUNARRES,
  CUADROS,
  ESTAMPADO
}

// 1. La prenda
// Como usuarie de QuéMePongo, quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).



class Prenda {
  TipoPrenda tipoPrenda
  Color colorPrimario
  Color colorSecundario
  Trama trama
  Material material

  /**
   * Requerimiento 3:
   * Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar
   * los aspectos relacionados a su material (colores, material, trama, etc)
   * para evitar elegir materiales inconsistentes con el tipo de prenda.
   */

  private Prenda(TipoPrenda tipoPrenda, Trama trama, Material material, Color colorPrimario, Color colorSecundario) {
    if (tipoPrenda == null) {
      throw new IllegalArgumentException("el tipo de prenda es obligatorio")
    }
    if (colorPrimario == null) {
      throw new IllegalArgumentException("el color primario es obligatorio")
    }
    //TODO validar material
    //TODO validar trama
    this.tipoPrenda = tipoPrenda
    this.colorPrimario = colorPrimario
    this.colorSecundario = colorSecundario
    this.material = material
    this.trama = trama
  }
}
/**
 * Requerimiento 2:
 * Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.
 * */
  public static Prenda crearPrenda(TipoPrenda tipo){
     return new Prenda(tipo);
  }

/**
 * Requerimiento 4:
 * Como usuarie de QuéMePongo, quiero guardar un borrador
 * de la última prenda que empecé a cargar para continuar después.
 */

public class Borrador{
  private TipoPrenda tipoPrenda
  private Color colorPrimario
  private Color colorSecundario
  private Trama trama
  private Material material

  /** Requerimiento 5:
   * Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela,
   * y que por defecto ésta sea lisa.
   */

  public Borrador(){
    this.trama = Trama.LISA //Siempre por default tiene una trama lisa
  }

  //Deberia haber uno de estos por cada atributo
  Borrador tipoPrenda(TipoPrenda tipo){
    this.tipoPrenda = tipo;
    return this;
  }

  Borrador trama(Trama trama){
    this.trama = trama;
    return this;
  }

  //....

  Borrador material(Material material){
    this.material = material;
    return this;
  }

  Borrador borrador = new Borrador();
  borrador.trama(trama).material(mat)...

  /**
   * Requerimiento 3:
   * Como usuarie de QuéMePongo, quiero crear una prenda especificando
   * en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc)
   * para evitar elegir materiales inconsistentes con el tipo de prenda.
   * Faltan las reglas para definir què y còmo validar
   */
  Prenda crear(){
    //TODO Validar cada dato de la prenda
    return new Prenda(datos ...)
  }


}




enum TipoPrenda {
  REMERA,
  BUZO,
  PANTALON
}


// ??
remeraAzul = new Prenda(TipoPrenda.REMERA)
buzoAzul = new Prenda(TipoPrenda.BUZO);


// 2. Color
// Como usuarie de QuéMePongo, quiero poder indicar un color principal para mis prendas
// Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.

enum Color {
  AMARILLO,
  AZUL,
  BLANCO,
  MARRON,
  NARANJA,
  NEGRO,
  ROJO,
  ROSA
}



// azul = "azul"
// otroAzul = "AZUL"
// azul == otroAzul ???
// no, es problematico

// podría ser, capaz en el futuro
// azul = new Color(0, 0, 255) // más flexible

azul = Color.AZUL // más simple

// opción 1
    remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL)
remeraAmarillaRayada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Color.BLANCO)


// opción 2
remeraAzul = new Prenda(TipoPrenda.REMERA, [Color.AZUL])
remeraAmarillaRayada = new Prenda(TipoPrenda.REMERA, [Color.AMARILLO, Color.BLANCO])


// opción 3
// permitiríamos tener objetos con estados inconsistentes
// y no necesitamos mutar al color secundario
// Idem con setter


// opción 4?
// Herencia? YAGNI. No hay estado diferenciado

// opción 5: idem 1, pero con un sólo constructor
remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, null)
remeraAmarillaRayada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Color.BLANCO)

// opción 6
remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, Color.AZUL)
remeraAmarillaRayada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Color.BLANCO)

// opcion 7
remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, Optional.none())
remeraAmarillaRayada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Optional.some(Color.BLANCO));



// 3. Categorias
// Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).
// Como usuarie de QuéMePongo, quiero poder indicar de qué tela o material está hecha una prenda

enum Categorias {
  SUPERIOR,
  CALZADO,
  PARTE_INFERIOR,
  ACCESORIOS
}

enum Material {
  ALGODON,
  POLIESTER,
}

remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, null, Material.ALGODON);

// opcion 1
// que la categoria sea parte del tipo?

class TipoPrenda {
  Categoria categoria;
  ....
}

tipoRemera = new TipoPrenda(Categoria.SUPERIOR)
tipoBuzo = new TipoPrenda(Categoria.SUPERIOR)
tipoBoina = new TipoPrenda(Categoria.ACCESORIOS)

remeraAzul = new Prenda(tipoRemera, Color.AZUL, null, Material.FRUTA)
remeraAmarillaRayada = new Prenda(tipoRemera, Color.AMARILLO, Color.BLANCO, Material.ALGODON);


Material unMaterial = Material.ALGODON // funciona
Material unMaterial = null // funciona
Material unMaterial = "ALGODON" // NO funciona; no tipa


// opcion 2?
// es problemático porque es más facil llegar a un estado inconsistente; es menos robusto
remeraAzul = new Prenda(TipoPrenda.REMERA, Categoria.SUPERIOR, Color.AZUL, null, Material.ALGODON)


// 4. Validaciones
// Como usuarie de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario.

// se trata de agregar más validaciones de nulos como venimos trabajando

// Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).


// el diseño del punto anterior ya garantiza la consistencia entre prenda y categoria

