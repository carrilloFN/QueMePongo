# QueMePongo
QuéMePongo es una empresa dedicada al armado de atuendos adecuados 
a las condiciones climáticas y preferencias de sus clientes. 
El servicio que provee se basa en tomar las prendas del guardarropas 
de une usuarie y generar diferentes combinaciones posibles que cubran 
las necesidades de les mismes en términos de distintos factores 
climáticos tales como temperatura, viento, sol, lluvia, etc. 
Asimismo, se busca que estos atuendos se adecuen de la mejor forma a 
las sensibilidades particulares respecto de dichos factores de cada 
usuario y a sus gustos en el aspecto estético.

## Primera Iteración
> Requerimiento principal:
Como usuario de QueMePongo quiero poder cargar prendas válidas 
para generar atuendos con ellas

### Como usuario de QueMePongo 
1. Quiero especificar qué tipo de prenda estoy cargando: Zapatos, camisa de mangas coras, pantalón, etc.
2. Quiero identificar a qué categoría pertenece una prenda: Parte superior, inferior, calzado, accesorios.
3. Quiero poder indicar qué tela o material está hecha una prenda (en adelante se lo referirá como material).
4. Quiero poder indicar un color principal para mis prendas.
5. Quiero poder indicar, si existe, un color secundario para mis prendas.
6. Quiero evitar que haya prendas sin tipo, material, categoría o color primario.
7. Quiero evitar que haya prendas cuya categoría no se condiga con su tipo (Ej, una remera no puede ser un calzado)

### Desiciones de Diseño
- Se definió una _**PRENDA**_ como una clase que tiene un tipo, material, color primario y secundario 
para poder representar una _**PRENDA**_
- Para los requerimientos _**1,2,3,4**_ se decidió acotar su dominio para lograr una mayor robustez y usabilidad 
a cambio de perder flexibilidad
- El requerimiento _**5**_ es un requerimiento que a nivel diseño nos indica que una _**PRENDA**_ debe poder
representar en ella un color secundario, pero se decidió que su optabilidad será atacada en su implementación
- El requerimiento _**6**_ refiere a que una _**PRENDA**_ sólo pueda crearse indicando todos sus campos (exceptuando el color secundario)
por lo que este requerimiento se atacará en la implementación definiendo un constructor con estas validaciones
- El requerimiento _**7**_ indica que están relacionados el _**TIPO**_ y _**CATEGORIA**_ de una prenda, por lo que
para mantener cierta consistencia se decidió que un _**TIPO**_ conozca _**SU CATEGORIA**_

![Diagrama de clases](/Diagrams/DDC.svg)
