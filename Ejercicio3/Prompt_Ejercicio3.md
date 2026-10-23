CONTEXTO:
Se utiliza Java 21 en la IDE IntelliJ IDEA. Es la Práctica 8 de Modelos de Programación Orientada a Objetos (MPOO), Herencia (2da parte), de la Facultad de Ingeniería, UNAM. El programa se ejecuta por consola, sin package, y utiliza Scanner y ArrayList de java.util. Sigue el nivel y el estilo de la guía de Classroom: menú repetitivo, captura de datos por teclado y validación de entradas.

OBJETIVO:
Diseñar un videojuego con la clase base Personaje y las subclases Mago, Guerrero, Villano y Aldeano. Personaje contiene nombre, vida y ataque. Cada subclase reutiliza el código de Personaje mediante super(...), agrega sus atributos propios y encadena sus constructores con this(...). Cada subclase sobrescribe toString() reutilizando super.toString(). El cálculo de daño se reutiliza en Guerrero y se sobrescribe en Mago, Villano y Aldeano. Los personajes se guardan en un ArrayList<Personaje> durante la ejecución.

CODIGO
Diagrama de clases:

+------------------------------------------+
|                Personaje                 |
+------------------------------------------+
| - nombre : String                        |
| - vida : int                             |
| - ataque : int                           |
+------------------------------------------+
| + Personaje(String, int, int)            |
| + getNombre(), getVida(), getAtaque()    |
| + calcularDano() : int                   |
| + toString() : String                    |
+------------------------------------------+
   ▲            ▲             ▲            ▲
   | hereda     | hereda      | hereda     | hereda
+-----------+ +-----------+ +-----------+ +-----------+
|   Mago    | | Guerrero  | | Villano   | | Aldeano   |
+-----------+ +-----------+ +-----------+ +-----------+
| - mana    | | - armadura| | - amenaza | | - oro     |
+-----------+ +-----------+ +-----------+ +-----------+
| Mago(String)               | Guerrero(String)     | Villano(String, int, int)   | Aldeano(String)     |
| Mago(String, int, int)     | Guerrero(String,int,int) | Villano(String,int,int,int) | Aldeano(String,int) |
| calcularDano() sobrescrito | calcularDano() heredado  | calcularDano() sobrescrito  | calcularDano() sobrescrito |
+------------------------------------------------------------------------------------------+

Reglas de cálculo:
- Personaje base: daño = ataque.
- Mago: vida fija 80; daño = ataque + mana / 10.
- Guerrero: vida fija 120; usa el daño heredado (daño = ataque).
- Villano: daño = ataque + amenaza.
- Aldeano: vida fija 30; no ataca, daño = 0.

Constructores encadenados:
- Mago(String nombre): this(nombre, 10, 50).
- Guerrero(String nombre): this(nombre, 15, 20).
- Villano(String, int, int): this(nombre, vida, ataque, 5).
- Aldeano(String nombre): this(nombre, 0).

Menú del Main:
1. Registrar mago (nombre, ataque, mana).
2. Registrar guerrero (nombre, ataque, armadura).
3. Registrar villano (nombre, vida, ataque, amenaza).
4. Registrar aldeano (nombre, oro).
5. Mostrar personajes con su daño.
6. Salir.

RESTRICCIONES
- Todo debe ejecutarse por consola, sin package; utilizar Scanner y ArrayList de java.util.
- Todos los atributos serán private y se accederá a ellos mediante métodos públicos.
- Usar extends, super(...), this(...), @Override, super.toString() y reutilización de calcularDano() donde corresponda.
- No usar clases abstractas, streams, lambdas, records ni temas posteriores a los vistos en clase.
- Los atributos numéricos deben ser enteros. Si se escribe texto, mostrar "Dato no valido, ingrese un numero entero." y volver a preguntar.
- No aceptar valores negativos en ataque, mana, armadura, vida, amenaza ni oro; mostrar "No se permiten valores negativos." y volver a preguntar.
- El nombre no puede quedar vacío; mostrar "El texto no puede estar vacio." y volver a preguntar.
- Si la opción del menú no existe o se escribe texto, mostrar "Opcion no disponible.".
- Si se intenta mostrar la lista vacía, indicar "No hay personajes registrados.".
- Mantener el código al nivel de la guía de Classroom, sin funcionalidades extra innecesarias.
- El código no debe incluir comentarios ni Javadoc.

CRITERIOS DE ÉXITO
El programa debe compilar y ejecutarse sin errores. El menú se repite hasta elegir 6.

Prueba sugerida:
1. Opción 1: nombre vacío (rechazar), nombre Merlin, ataque x (rechazar), ataque -5 (rechazar), ataque 30, mana 100.
2. Opción 2: nombre Conan, ataque 25, armadura 40.
3. Opción 3: nombre Gorgo, vida 200, ataque 35, amenaza 10.
4. Opción 4: nombre Juan, oro 50.
5. Opción 9 o texto: "Opcion no disponible.".
6. Opción 5: cada personaje con sus datos y su daño. Mago daño 40; Guerrero daño 25; Villano daño 45; Aldeano daño 0.
7. Opción 6: "Fin del programa." y termina.

FORMATO DE RESPUESTA
Entregar seis archivos .java separados: Personaje.java, Mago.java, Guerrero.java, Villano.java, Aldeano.java y Main.java. No usar package. El código debe estar completo y listo para ejecutarse en IntelliJ IDEA. Al final, explicar brevemente extends, super, this(...), @Override y cómo se reutiliza el código.


ACLARACION DE IMPLEMENTACION:
Las validaciones de datos capturados se realizan en los métodos de lectura de Main antes de crear los objetos. Los constructores se encargan de inicializar los atributos y de llamar al constructor de la clase base; no se exige duplicar la validación en cada constructor.
