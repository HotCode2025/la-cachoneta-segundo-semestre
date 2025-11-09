# Proyecto Integrador La Cachoneta

## Verduleria Don Cacho

##  1. Introducción
**Verdulería Don Cacho** es un proyecto educativo desarrollado en **Java** utilizando el paradigma de **Programación Orientada a Objetos (POO)**.  
El objetivo es simular la gestión de una verdulería a través de un **menú interactivo con JOptionPane**, permitiendo al usuario administrar productos, registrar ventas y consultar información de manera dinámica.

Este proyecto surge a partir de un pseudocódigo desarrollado en **PSeInt** presentado en el primer semestre, el cual fue convertido a Java.

---

## 2. Descripción del Proyecto
El programa representa un sistema básico de inventario y ventas para una verdulería.  
A través de una interfaz simple de ventanas emergentes (JOptionPane), el usuario puede:

- Agregar productos con su nombre, precio y stock.
- Modificar precios o cantidades (stock).
- Realizar ventas y reducir el stock automáticamente.
- Consultar productos con stock crítico.
- Visualizar el total de ventas acumuladas.

Toda la lógica se encuentra implementada con **clases separadas** (`Producto`, `Verduleria`, `Main`), lo que facilita la comprensión, mantenimiento y futuras mejoras.

---

## 3. Integrantes

- **Agustín Gonzalez** 
- **Cristhian Barrientos**
- **Emmanuel Yapura**
- **Enzo Ulloa**
- **Esteban Montenegro**
- **Germán Fratucello**
- **Nicolas Cohen**
- **Ramiro Soria**

---

## 4. Funcionalidades Principales
### Gestión de Productos
- Agregar nuevos productos al inventario.
- Modificar precios o cantidades.
- Eliminar productos del sistema.

### Ventas
- Registrar una venta seleccionando productos disponibles.
- Calcular el total de la compra automáticamente.
- Descontar stock según la cantidad vendida.

### Inventario
- Mostrar la lista completa de productos.
- Indicar productos sin stock o con stock bajo.

### Interfaz Interactiva
- Menú principal con `JOptionPane`.
- Submenús dinámicos para cada opción.
- Validaciones de entrada y mensajes de error claros.

---

## 5. Conceptos y Herramientas Utilizadas
- **Lenguaje:** Java 17+
- **Paradigma:** Programación Orientada a Objetos (POO)
- **Interfaz:** `JOptionPane` (clase de Swing), `StringBuilder` para construir cadenas de texto dinámicas
- **Colecciones:** `ArrayList` para el manejo dinámico de productos
- **Estructuras de control:**  
  - Bucles (`while`, `foreach`)  
  - Condicionales (`if`, `switch`)  
- **Buenas prácticas:**  
  - Encapsulación de atributos  
  - Métodos específicos por responsabilidad  
  - Validaciones de entrada  
  - Código modular y reutilizable

---

## 6. Posibles Mejoras Futuras
- **Persistencia de datos:** guardar y cargar el inventario desde un archivo JSON o base de datos.

- **Interfaz gráfica avanzada:** agregar una interfaz grafica para los usuarios que utilicen el programa.

- **Reportes de ventas:** calcular productos más vendidos, promedio de precios, ingresos totales, etc.

- **Gestión de empleados:** agregar roles (vendedor, administrador).

- **Control de acceso:** implementar un sistema de login.

- **Validaciones avanzandas** evitar errores por ingreso de texto en campos numericos mediante try/catch.

---

## Ejecución del Proyecto
1. Abrir la carpeta del proyecto en **Visual Studio Code** 
2. Compilar el codigo fuente 
    ```
    javac Main.java
    ``` 
3. Luego ejecutar el archivo compilado 
    ```
    java Main 
    ```
