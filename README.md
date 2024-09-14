# LAB 1.08
## Introducción

Acabamos de aprender cómo crear e implementar interfaces, así como cómo crear y extender clases abstractas, así que ahora practiquemos un poco.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

### Operaciones BigDecimal

1. Usando [la documentación de BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), crea un método que acepte un `BigDecimal` y devuelva un `double` del número `BigDecimal` redondeado al centésimo más cercano. Por ejemplo, `4.2545` debería devolver `4.25`.
2. Usando [la documentación de BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), crea un método que acepte un `BigDecimal`, invierte el signo (si el parámetro es positivo, el resultado debería ser negativo y viceversa), redondea el número a la décima más cercana y devuelva el resultado. Por ejemplo, `1.2345` debería devolver `-1.2` y `-45.67` debería devolver `45.7`.

<br>

### Sistema de inventario de automóviles

1. Supongamos que estás construyendo un sistema de inventario de automóviles. Todos los automóviles tienen un `vinNumber`, `make`, `model` y `mileage`. Pero ningún automóvil es solo un automóvil cualquiera. Cada automóvil puede ser un `Sedan`, un `UtilityVehicle` o un `Truck`.
2. Crea una clase abstracta llamada `Car` y define las siguientes propiedades y comportamientos:
   - `vinNumber`: una `String` que representa el número de VIN del automóvil
   - `make`: una `String` que representa la marca del automóvil
   - `model`: una `String` que representa el modelo del automóvil
   - `mileage`: un `int` que representa el kilometraje del automóvil
   - `getInfo()`: un método que devuelve una `String` que contiene todas las propiedades del automóvil en un formato legible
3. Crea tres clases que extiendan `Car`: `Sedan`, `UtilityVehicle` y `Truck`.
4. Los objetos de `UtilityVehicle` deben tener una propiedad adicional `fourWheelDrive`, un `boolean` que representa si el vehículo tiene tracción en las cuatro ruedas.
5. Los objetos de `Truck` deben tener una propiedad adicional `towingCapacity`, un `double` que representa la capacidad de remolque del camión.

<br>

### Servicio de transmisión de vídeo

1. Supón que está construyendo un servicio de transmisión de vídeo. Todos los videos son series de televisión o películas.
2. Crea una clase abstracta llamada `Video` y define las siguientes propiedades y comportamientos:
   - `title`: un `String` que representa el título del video
   - `duration`: un `int` que representa la duración del video en minutos
   - `getInfo()`: un método que devuelve un `String` que contiene todas las propiedades del video en un formato legible
3. Crea dos clases que extiendan `Video`: `TvSeries` y `Movie`.
4. Los objetos `TvSeries` deben tener una propiedad adicional `episodes`, un `int` que representa el número de episodios en la serie.
5. Los objetos `Movie` deben tener una propiedad adicional `rating`, un `double` que representa la calificación de la película.

<br>

### Interfaz IntList

1. Crea una interfaz `IntList` con los siguientes métodos:
   - `add (int number)`: un método que agrega un nuevo número a la lista
   - `get (int id)`: un método que recupera un elemento por su ID
2. Crea dos implementaciones de `IntList`: `IntArrayList` y `IntVector`.
3. `IntArrayList` debe almacenar números en un array con una longitud de 10 por defecto. Cuando se llama al método `add`, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el 50% más grande, mueve todos los elementos al nuevo array y agregue el nuevo elemento. (Por ejemplo, un array de longitud 10 aumentaría a 15).
4. `IntVector` debe almacenar números en un arreglo con una longitud de 20 por defecto. Cuando se llama al método `add`, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el doble del tamaño del array actual, mueve todos los elementos al nuevo array y agrega el nuevo elemento. (Por ejemplo, un array de longitud 10 aumentaría a 20).
5. En su `README.md`, incluye un ejemplo de cuándo `IntArrayList` sería más eficiente y cuándo `IntVector` sería más eficiente.

#### IntArrayList
- IntArrayList es más eficiente en escenarios donde el crecimiento de la lista es moderado o poco predecible. Al crecer solo un 50%, utiliza menos memoria en escenarios donde no es necesario un gran buffer de memoria adicional. Es ideal para casos de uso en los que los incrementos de memoria deben ser más conservadores y el tamaño de la lista no se escala exponencialmente.

#### IntVector
- IntVector es más adecuado para situaciones donde se espera que la lista crezca rápidamente o de manera significativa. Al duplicar su tamaño, reduce el número de veces que se necesita redimensionar, lo cual puede ser beneficioso en términos de rendimiento cuando las operaciones de adición son muy frecuentes y el tamaño final de la lista es considerablemente grande.
  <br>

<br>