CONTEXTO:
Se utiliza Java 21 en la IDE IntelliJ IDEA. Es la Práctica 8 de Modelos de Programación Orientada a Objetos (MPOO), Herencia (2da parte), de la Facultad de Ingeniería, UNAM. El programa se ejecuta por consola, sin package, y utiliza Scanner y ArrayList de java.util. Sigue el nivel y el estilo de la guía de Classroom: menú repetitivo, captura de datos por teclado y validación de entradas.

OBJETIVO:
Crear una clase base Figura y una clase derivada Circulo con sus propios constructores. Circulo debe usar this(...) para encadenar constructores y super(...) para llamar al constructor de Figura. Circulo debe sobrescribir calcularArea() y toString() reutilizando super.toString(). Las figuras registradas se guardan en un ArrayList<Figura> durante la ejecución.

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
              ▲
              | hereda
              |
+------------------------------+
|           Circulo            |
+------------------------------+
| - radio : double             |
+------------------------------+
| + Circulo()                  |
| + Circulo(double)            |
| + Circulo(String, double)    |
| + getRadio() : double        |
| + calcularArea() : double    |
| + toString() : String        |
+------------------------------+
              ▲
              |
+------------------------------+
|             Main             |
+------------------------------+
| + main(String[]) : void      |
| - mostrarMenu() : void       |
| - leerOpcion() : int         |
| - leerRadio() : double       |
| - leerTexto(String) : String |
| - registrarCirculo(...)      |
| - registrarCirculoConNombre(...) |
| - mostrarFiguras(...)        |
+------------------------------+

Constructores de Circulo:
- Circulo(): usa this(1.0).
- Circulo(double radio): usa this("Circulo", radio).
- Circulo(String nombre, double radio): llama super(nombre) y asigna el radio.

Menú del Main:
1. Crear círculo por defecto (radio 1.0).
2. Crear círculo con radio.
3. Crear círculo con nombre y radio.
4. Mostrar figuras (con su área).
5. Salir.

RESTRICCIONES
- Todo debe ejecutarse por consola, sin package; utilizar Scanner y ArrayList de java.util.
- Todos los atributos serán private y se accederá a ellos mediante métodos públicos.
- Usar extends, super(...), this(...), @Override y super.toString() donde corresponda.
- No usar clases abstractas, streams, lambdas, records ni temas posteriores a los vistos en clase.
- El radio debe ser un número decimal. Si se escribe texto, mostrar "Dato no valido, ingrese un numero." y volver a preguntar.
- No aceptar radios negativos; mostrar "No se permiten valores negativos." y volver a preguntar.
- El radio debe ser mayor que cero; mostrar "El radio debe ser mayor que cero." y volver a preguntar.
- El radio debe ser finito: no se aceptan NaN ni Infinity; mostrar "Dato no valido, ingrese un numero finito." y volver a preguntar.
- El nombre no puede quedar vacío; mostrar "El texto no puede estar vacio." y volver a preguntar.
- Si la opción del menú no existe o se escribe texto, mostrar "Opcion no disponible.".
- Si se intenta mostrar la lista vacía, indicar "No hay figuras registradas.".
- El área se muestra con dos decimales.
- Mantener el código al nivel de la guía de Classroom, sin funcionalidades extra innecesarias.
- El código no debe incluir comentarios ni Javadoc.

CRITERIOS DE ÉXITO
El programa debe compilar y ejecutarse sin errores. El menú se repite hasta elegir 5.

Prueba sugerida:
1. Opción 2: radio -3 (rechazar), radio abc (rechazar), radio 0 (rechazar), radio 2 (aceptar). Debe mostrar "Circulo registrado.".
2. Opción 3: nombre Moneda, radio 1.5.
3. Opción 1: círculo por defecto con radio 1.0.
4. Opción 4: cada círculo aparece en una línea con su radio y su área (Circulo radio 2.0 área 12.57; Moneda radio 1.5 área 7.07; círculo por defecto área 3.14).
5. Opción 9 o texto: "Opcion no disponible.". Opción 5: "Fin del programa." y termina.
6. Opción 4 sin registros: "No hay figuras registradas.".

FORMATO DE RESPUESTA
Entregar tres archivos .java separados: Figura.java, Circulo.java y Main.java. No usar package. El código debe estar completo y listo para ejecutarse en IntelliJ IDEA. Al final, incluir una explicación breve de dónde se usan extends, super, this(...), @Override y la sobrecarga de constructores.


ACLARACION DE IMPLEMENTACION:
Las validaciones de datos capturados se realizan en los métodos de lectura de Main antes de crear los objetos. Los constructores se encargan de inicializar los atributos y de llamar al constructor de la clase base; no se exige duplicar la validación en cada constructor.
