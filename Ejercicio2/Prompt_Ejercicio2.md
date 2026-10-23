CONTEXTO:
Se utiliza Java 21 en la IDE IntelliJ IDEA. Es la Práctica 8 de Modelos de Programación Orientada a Objetos (MPOO), Herencia (2da parte), de la Facultad de Ingeniería, UNAM. El programa se ejecuta por consola, sin package, y utiliza Scanner y ArrayList de java.util. Sigue el nivel y el estilo de la guía de Classroom: menú repetitivo, captura de datos por teclado y validación de entradas.

OBJETIVO:
Implementar una jerarquía de figuras geométricas donde Figura es la clase base y Triangulo, Cuadrado, Rectangulo, Circulo y Pentagono son subclases. Cada subclase llama al constructor de Figura mediante super(...), sobrescribe calcularArea() con su propia fórmula y sobrescribe toString() reutilizando super.toString(). El programa registra figuras, muestra cada una con su área y calcula el área total usando polimorfismo mediante la referencia Figura.

CODIGO
Diagrama de clases:

+------------------------------+
|           Figura             |
+------------------------------+
| - nombre : String            |
+------------------------------+
| + Figura(String)             |
| + getNombre() : String       |
| + calcularArea() : double    |
| + toString() : String        |
+------------------------------+
   ▲        ▲        ▲        ▲        ▲
   | hereda | hereda | hereda | hereda | hereda
+-----------+ +-----------+ +-----------+ +-----------+ +-----------+
| Triangulo | | Cuadrado  | |Rectangulo | | Circulo   | | Pentagono |
+-----------+ +-----------+ +-----------+ +-----------+ +-----------+
| -base     | | -lado     | | -base     | | -radio    | | -lado     |
| -altura   | |           | | -altura   | |           | |           |
+-----------+ +-----------+ +-----------+ +-----------+ +-----------+
| +calcularArea() sobrescrito en cada subclase                      |
+------------------------------------------------------------------+

Fórmulas de área:
- Triángulo: base * altura / 2.
- Cuadrado: lado * lado.
- Rectángulo: base * altura.
- Círculo: PI * radio * radio.
- Pentágono regular: 5 * lado * lado / (4 * tan(PI / 5)).

Menú del Main:
1. Registrar triángulo (base, altura).
2. Registrar cuadrado (lado).
3. Registrar rectángulo (base, altura).
4. Registrar círculo (radio).
5. Registrar pentágono (lado).
6. Mostrar figuras y su área.
7. Mostrar área total.
8. Salir.

RESTRICCIONES
- Todo debe ejecutarse por consola, sin package; utilizar Scanner y ArrayList de java.util.
- Todos los atributos serán private y se accederá a ellos mediante métodos públicos.
- Usar extends, super(...), @Override, super.toString() y polimorfismo mediante la referencia Figura donde corresponda.
- No usar clases abstractas, streams, lambdas, records ni temas posteriores a los vistos en clase. La clase Figura no es abstracta: su calcularArea() devuelve 0.0 y cada subclase lo sobrescribe.
- Las medidas deben ser números decimales. Si se escribe texto, mostrar "Dato no valido, ingrese un numero." y volver a preguntar.
- No aceptar medidas negativas; mostrar "No se permiten valores negativos." y volver a preguntar.
- Ninguna medida puede ser cero; mostrar "El valor debe ser mayor que cero." y volver a preguntar.
- Las medidas deben ser finitas: no se aceptan NaN ni Infinity; mostrar "Dato no valido, ingrese un numero finito." y volver a preguntar.
- Si la opción del menú no existe o se escribe texto, mostrar "Opcion no disponible.".
- Si se intenta mostrar o sumar áreas sin figuras, indicar "No hay figuras registradas.".
- Las áreas se muestran con dos decimales.
- Mantener el código al nivel de la guía de Classroom, sin funcionalidades extra innecesarias.
- El código no debe incluir comentarios ni Javadoc.

CRITERIOS DE ÉXITO
El programa debe compilar y ejecutarse sin errores. El menú se repite hasta elegir 8.

Prueba sugerida:
1. Opción 1: base abc (rechazar), base 4, altura -1 (rechazar), altura 2.5. Área 5.00.
2. Opción 2: lado 3. Área 9.00.
3. Opción 3: base 2.5, altura 4. Área 10.00.
4. Opción 4: radio 2. Área 12.57.
5. Opción 5: lado 4. Área 27.53.
6. Opción 6: cada figura en una línea con sus datos y su área.
7. Opción 7: área total 64.09.
8. Opción 8: "Fin del programa." y termina. Antes, opciones 6 y 7 sin registros deben mostrar "No hay figuras registradas.".

FORMATO DE RESPUESTA
Entregar siete archivos .java separados: Figura.java, Triangulo.java, Cuadrado.java, Rectangulo.java, Circulo.java, Pentagono.java y Main.java. No usar package. El código debe estar completo y listo para ejecutarse en IntelliJ IDEA. Al final, explicar brevemente extends, super, @Override y polimorfismo.


ACLARACION DE IMPLEMENTACION:
Las validaciones de datos capturados se realizan en los métodos de lectura de Main antes de crear los objetos. Los constructores se encargan de inicializar los atributos y de llamar al constructor de la clase base; no se exige duplicar la validación en cada constructor.
