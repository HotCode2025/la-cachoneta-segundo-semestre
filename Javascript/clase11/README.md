Tarea de Java Script

Integrantes: Nicolas Cohen, Samuel Rodríguez, Mauricio Esparza,
Cristhian Barrientos, Ramiro Soria, Enzo Ulloa, Emmanuel Yapura, Germán
Fratucello, Agustín Gonzalez, Esteban Montenegro.

Grupo: La Cachoneta.

## Funciones que tienen que ver con la manipulación de datos

Ejemplos:

calculateTotalPrice(), formatUserInput(), validateEmailAddress(),
convertToCamelCase(), filterActiveUsers()

1\. calculateTotalPrice()

Significado al español: calcular el precio total.

Puntos importantes:

-   Indica una acción de cálculo o procesamiento, usando el verbo
    calculate.

-   Especifica que es lo que se calcula: el TotalPrice (Precio Total).

-   Es muy descriptiva: sumar o determinar un valor monetario final.

-   Sigue la convención natural de Verbo + Objeto, lo que facilita la
    lectura y comprensión inmediata.

-   Implica una función que retorna un valor (el precio), sin modificar
    datos externos directamente (es una función pura).

2\. formatUserInput()

Significado al español: formatear la entrada de datos del usuario.

Puntos importantes:

-   Utiliza el verbo format, que indica una acción de transformación o
    estilización de datos.

-   Especifica qué dato se está transformando: el UserInput (lo que el
    usuario introdujo).

-   El nombre comunica que la función está preparando el dato para ser
    usado, guardado o mostrado (ej. quitando espacios, aplicando
    mayúsculas).

-   Es clara y concisa, sobre su rol dentro del flujo de la aplicación.

-   Sigue el principio de un solo propósito, indicando que su única
    responsabilidad es cambiar la presentación del *input*.

3\. validateEmailAddress()

Significado al español: validar la dirección de correo electrónico.

Puntos importantes:

-   Usa el verbo validate, que implica una comprobación o verificación
    de que el dato cumple con ciertas reglas (patrones).

-   Especifica el dato que se comprueba: el EmailAddress (la dirección
    de correo).

-   Transmite su resultado esperado: la función devolverá un booleano
    (true o false), indicando si el correo es válido o no.

-   El nombre deja claro que es una función de control de calidad de los
    datos.

-   Es coherente con la terminología de programación estándar, donde
    validate es común para este tipo de verificaciones de *inputs*.

4\. convertToCamelCase()

Significado al español: convertir a formato *CamelCase*.

Puntos importantes:

-   Usa el verbo convert, que indica una transformación de un tipo de
    dato a otro (en este caso, un *string* a un formato específico).

-   Especifica de forma directa el formato de salida: ToCamelCase.

-   El nombre es un término técnico exacto que cualquier desarrollador
    entiende (ej. nombre_usuario se convierte en nombreUsuario).

-   Es una función de manipulación de *strings* con un propósito muy
    específico, lo que la hace reutilizable.

-   Al igual que las de formato y validación, implica que es una función
    pura que devuelve un resultado sin efectos secundarios.

5\. filterActiveUsers()

Significado al español: filtrar a los usuarios activos.

Puntos importantes:

-   Usa el verbo filter, que corresponde a la acción de seleccionar o
    reducir un conjunto de datos basándose en un criterio.

-   Especifica claramente qué criterio se aplica y sobre qué datos: solo
    los ActiveUsers (usuarios que están marcados como activos).

-   Comunica que la función trabaja sobre una colección o *array* de
    datos, devolviendo un subconjunto.

-   El nombre es autodocumentado: indica que se está reduciendo la lista
    original para mostrar solo a los que cumplen con la condición
    \"activo\".

-   Es un nombre claro y directo, siguiendo las buenas prácticas para
    funciones de consulta y manipulación de listas.


  ## Eventos o Interacción

Ejemplos: handleButtonClick(), onFormSubmit(), toggleDarkMode(),
updateProgressBar(), initializeApp()

1\. handleButtonClick()

Significado al español: manejar el clic del botón.

Puntos importantes:

-   Usa el prefijo handle (manejar/gestionar), que es una convención
    estándar para indicar que la función es un controlador de eventos
    (*event handler*).

-   Especifica claramente el evento y el objeto que lo origina:
    ButtonClick (el evento de clic en un botón).

-   El nombre comunica que el objetivo de la función es ejecutar una
    secuencia de acciones en respuesta a la interacción del usuario.

-   Es descriptiva y clara, lo que ayuda a otros desarrolladores (o a
    uno mismo) a encontrar rápidamente dónde se define la lógica de la
    interfaz.

-   Sigue la estructura de nomenclatura común en muchos *frameworks* de
    desarrollo web (React, Vue, etc.) para eventos de interfaz de
    usuario (UI).

2\. onFormSubmit()

Significado al español: al enviar el formulario.

Puntos importantes:

-   Usa el prefijo on (al), que indica que la función se ejecuta
    inmediatamente después o en el momento de que ocurre un evento
    específico.

-   Especifica el evento clave de interacción: FormSubmit (el envío o
    *submit* del formulario).

-   El nombre es conciso y estándar en la programación de interfaces,
    implicando que esta función se encarga de la validación final y la
    comunicación con el *backend*.

-   Transmite su propósito de manera precisa: es la puerta de entrada de
    los datos que el usuario acaba de ingresar.

-   Implica que es un *callback* que se dispara en el momento crítico de
    la interacción de envío.

3\. toggleDarkMode()

Significado al español: alternar el modo oscuro.

Puntos importantes:

-   Utiliza el verbo toggle (alternar/conmutar), que significa cambiar
    el estado entre dos opciones (generalmente *on/off* o *true/false*).

-   Especifica el estado que se alterna: DarkMode (el modo oscuro de la
    interfaz).

-   El nombre es muy claro y moderno, inmediatamente asociable a una
    funcionalidad común de cambio de tema visual.

-   Comunica que la función no solo activa, sino que gestiona el cambio
    bidireccional (de claro a oscuro y viceversa).

-   Es simple y efectivo, indicando una acción directa de manipulación
    del estado global de la aplicación o de la interfaz.

4\. updateProgressBar()

Significado al español: actualizar la barra de progreso.

Puntos importantes:

-   Usa el verbo update (actualizar), que indica una modificación de un
    componente visible de la interfaz.

-   Especifica el componente que se modifica: ProgressBar (la barra de
    progreso).

-   El nombre transmite que esta función refleja el estado interno de un
    proceso (ej. descarga, carga de datos) en la UI.

-   Es una función de presentación, cuyo objetivo es cambiar el ancho,
    color, o texto del elemento para dar *feedback* al usuario.

-   Sigue la convención de Verbo + Objeto, lo que la hace fácil de
    entender: *Actualiza* qué cosa (*la Barra de Progreso*).

5\. initializeApp()

Significado al español: inicializar la aplicación.

Puntos importantes:

-   Usa el verbo initialize (inicializar), que indica que la función
    realiza todas las configuraciones de arranque necesarias.

-   Especifica el objeto que se prepara: App (la aplicación o el sistema
    completo).

-   El nombre comunica que esta función debe ser llamada una sola vez al
    principio de la ejecución del programa.

-   Transmite que su rol es el de configuración y preparación (ej.
    cargar datos iniciales, configurar *listeners*, establecer estado
    por defecto).

-   Es un nombre fundamental y esencial en la arquitectura de
    *software*, siendo el punto de entrada para toda la lógica
    posterior.


  ## Operaciones CRUD

Operaciones CRUD (Create, Read, Update and Delete)

Traducido al español: Crear, Leer, Actualizar y Eliminar

1\. createNewUser()

Significado al español: crear nuevo usuario.

Puntos importantes:

-   Es descriptiva: indica claramente que crea un nuevo usuario.

-   Contiene la palabra create, que en CRUD representa la acción Create
    (Crear).

-   El término NewUser especifica el tipo de dato que se está creando
    (un usuario).

-   Suena natural en inglés y sigue la convención verbo + objeto.

-   Es fácil de entender: cualquier desarrollador sabe que esta función
    genera un registro nuevo en el sistema.

2\. fetchUserData()

Significado al español: obtener datos del usuario.

Puntos importantes:

-   Indica una acción de lectura, correspondiente al Read de CRUD.

-   Usa el verbo fetch, común en programación para traer datos desde una
    fuente externa o API.

-   UserData deja claro que los datos pertenecen a un usuario.

-   Es corta y fácil de recordar.

-   Transmite claramente su propósito: leer información, no modificarla.

3\. updateUserProfile()

Significado al español: actualizar perfil de usuario.

Puntos importantes:

-   Usa el verbo update, que representa la acción Update (Actualizar) de
    CRUD.

-   Específica qué se actualiza: el UserProfile (perfil de usuario).

-   Suena natural y clara en inglés.

-   Indica modificación de datos existentes, no creación.

-   Permite entender que su uso será para cambiar información del
    usuario (nombre, foto, etc.).

4\. deleteUserAccount()

Significado al español: eliminar cuenta de usuario.

Puntos importantes:

-   Utiliza el verbo delete, que forma parte de la acción Delete
    (Eliminar) de CRUD.

-   Específica qué se elimina: la UserAccount (cuenta de usuario).

-   No deja lugar a ambigüedades: su función es borrar datos.

-   Suena profesional y coherente con la terminología estándar.

-   Fácil de identificar y evitar un mal uso (se entiende que la acción
    es destructiva).


  ## Utilidades

Ejemplos: generateRandomId(), formatCurrency(), debounceSearch(),
sanitizeInput(), checkPermissions()

1\. generateRandomId()

Significado al español: generar identificador aleatorio.

Puntos importantes:

-   Usa el verbo generate (generar), que indica la acción de crear o
    producir un nuevo valor

-   Especifica claramente qué se crea: un RandomId (Identificador
    Aleatorio).

-   El nombre es autodocumentado: su propósito es crear una cadena única
    o pseudo-única para identificar un registro, elemento o sesión.

-   Comunica que es una función pura de utilidad que no depende del
    estado de la aplicación ni lo modifica, solo retorna un valor.

-   Sigue la convención de Verbo + Objeto + Cualidad, lo que la hace
    fácil de identificar como un servicio de apoyo.

2\. formatCurrency()

Significado al español: formatear moneda.

Puntos importantes:

-   Usa el verbo format (formatear), indicando una acción de
    transformación para presentación visual.

-   Especifica el tipo de dato que se modifica: Currency (Moneda).

-   El nombre comunica que el dato numérico se convertirá en una cadena
    de texto legible por el usuario (ej. agregando el símbolo de dólar,
    separadores de miles y decimales).

-   Es una función de utilidad reutilizable que maneja la localización
    (idioma y región) de los datos numéricos.

-   Implica que es una función pura que toma un número y devuelve una
    cadena formateada, sin modificar el dato original.

3\. debounceSearch()

Significado al español: limitar la frecuencia de la búsqueda (por
debounce).

Puntos importantes:

-   Utiliza el término técnico debounce, que indica una técnica de
    optimización para limitar la frecuencia con la que se ejecuta una
    función.

-   Especifica la función que se está optimizando: Search (Búsqueda).

-   El nombre es altamente técnico y específico, comunicando a otros
    desarrolladores que esta función controla el rendimiento al esperar
    un periodo de inactividad del usuario antes de ejecutar la lógica de
    búsqueda.

-   Aclara que su rol principal es mejorar la experiencia del usuario y
    reducir la carga del servidor durante la escritura rápida en un
    campo de búsqueda.

-   Es una función de utilidad de rendimiento que envuelve otra función
    (higher-order function).

4\. sanitizeInput()

Significado al español: sanear (limpiar) la entrada de datos.

Puntos importantes:

-   Usa el verbo sanitize (sanear/limpiar), que es un término estándar
    en seguridad que indica la eliminación de código malicioso o no
    deseado.

-   Especifica el dato que se limpia: Input (la entrada de datos).

-   El nombre comunica un propósito de seguridad esencial: proteger la
    aplicación contra ataques como Cross-Site Scripting (XSS) antes de
    procesar o mostrar los datos.

-   Implica que la función eliminará o escapará caracteres especiales,
    etiquetas HTML o scripts para hacer que el dato sea seguro.

-   Es una función de utilidad de seguridad crítica para cualquier
    sistema que acepte datos del usuario.

5\. checkPermissions()

Significado al español: verificar permisos.

Puntos importantes:

-   Utiliza el verbo check (verificar/comprobar), que indica una
    evaluación o consulta para determinar un estado.

-   Especifica qué se evalúa: Permissions (los Permisos).

-   El nombre comunica que su propósito es determinar si el usuario
    actual tiene la autoridad necesaria para realizar una acción
    específica (ej. ver una página, borrar un registro).

-   Transmite que esta función es clave para el control de acceso y la
    lógica de autorización en la aplicación.

Generalmente, devolverá un valor booleano (true o false), indicando si
el acceso está concedido o denegado, lo que la hace una función de
utilidad de lógica de negocio.
