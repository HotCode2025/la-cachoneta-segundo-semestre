# la-cachoneta-segundo-semestre
semana a semana sorteamos mediante ruleta los equipos y las tareas
al igual que el Scrum Master va a ser sorteado por semana

# Clase 1 Miercoles

## USO DE GITHUB

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).<br/>

Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.<br/>

## COMANDOS

#Import repository, New repository, New organization: significa que es como tu empresa, New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa, New gist: es un pedasito de código que puedes compartir<br/>

New repository #Ponemos el nombre: Prueba-Inicio.Repo, descripción: Así armamos un repositorio. Hay muchas licencias para publicar el código: NO lo hacemos ahora.<br/>

Create repository #Lo ponemos en privado o en Publico.<br/>

El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.<br/>
Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando ssh) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub.<br/>
ATENCIÓN: ¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña. Igual esto ya no funciona de una manera fácil.<br/>
Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.<br/>
Cómo conectar un repositorio de GitHub a nuestro documento local, Si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes instrucciones:<br/>

[Teclear aquí para VER el video 1](https://drive.google.com/file/d/1qIz5XokUEoG9j7mnl-trPvkjbFKtAOgg/view?usp=drive_link)

Vamos a comenzar con la creación de un repositorio en la nube de Github <Br/>
Recuerden que el primer paso es tener una cuenta en Github<Br/>
Tener claro el correo con que están allí<Br/>
hacer la autenticación de dos pasos<Br/>
esto quiere decir que nuestra cuenta inicia sesión no solo con correo y contraseña<Br/>
recomiendo tener el sistema de autenticación en varios dispositivos<Br/>
Otro punto a tener muy en cuenta es que debemos crear nuestra clave pública y privada entre Github y nuestro ordenador<Br/>
cada ordenador que usemos con la nube debe tener su propia clave<Br/>

```sh 
#creamos el repositorio
#este puede ser público u privado
#recomiendo que se coloque el readme
#aunque yo no lo puse
#se puede agregar un ignore
#no se olviden de colocar un nombre al repositorio
#copiamos el enlace ssh para traer el repositorio a nuestro ordenador
#vemos que está también el https
#traemos el ssh
#vamos al ordenador para abrir la terminal de git bash
#recuerden abrirla como administrador
#esto es para tener todos los permisos necesarios y trabajar tranquilos
#vamos a ver primero dónde estamos con el comando 
ll
#entramos al directorio: Documents
cd Documents
#vemos de nuevo dónde estamos
ll
#y creamos aquí un nuevo directorio llamado Proyectos
mkdir Proyectos
#entramos en el directorio
#y vamos a traer el repositorio con el comando
git clone (y el enlace ssh)
#vemos con
ll
#si está el repositorio dentro del directorio
#entramos en él con
cd Prueba-Inicio-Repo
#ya teniendo esto vamos a traer toda actualización desde la nube con el comando
git pull origin main
#también podemos usar
git fetch
#creamos el archivo readme con el comando
touch README.md
#luego vemos si está con el comando
ll
ls
#luego
git status
#seguimos con el comando
git add .
#luego
git status
#vamos a commitear
git commit -m"y el mensaje entre comillas dobles"
#pasamos todo esto a la nube con
git push origin main
#Nos vamos a Github y presionamos F 5 para actualizar y ver si están los cambios
```
no olvidemos que github es una red social<br/>
coloquemos una estrella<br/>
está todo hecho<br/>
un dato importante<br/>
estando en el repositorio de la nube<br/>
con solo apretar<br/>
punto .<br/>
se abre visual studio code<br/>
desde aquí vamos a editar el readme<br/>

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>

Dante Nicolás Martinez<br/>

Segundo Semestre Parte 1:<br/>

[IntroYpractica](https://drive.google.com/file/d/1yFihiQVMKXJvOXSwMdczrCesocRS9heY/view?usp=drive_link)

[PDF](https://docs.google.com/presentation/d/10QC9Ii6zvYgTa5fbzUJGNC8z9LukEN5r/edit?usp=drive_link&ouid=103827187004520077964&rtpof=true&sd=true)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>

Profesor Ariel Betancud<br/>




# Clase 2 miercoles

## Vamos a cargar la llave SSH publica en GitHub

Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.<br/>
copiar la llave publica #Ir a GitHub, vamos a setting, vamos a SSH and GPG keys<br/>
crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.<br/>
Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.<br/>
 ```sh
git branch #Vemos en que rama estamos
git checkout master #Ponernos en la rama master
git branch -M main #Cambiamos el nombre a la rama master
git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo
git remote -v #Vemos si ya esta conectado
git merge segunda #Mergeamos lo que tenemos en la rama segunda en main
git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy
git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```
Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master. <br/>

* PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>

 Dante Nicolás Martinez<br/>

 Segundo Semestre Parte 2:<br/>

[Video Capitulo 01](https://drive.google.com/file/d/1op_N1lCHQey2jIJKLHt0JyDi5tqlSYcQ/view?usp=drive_link)


[PDF](https://drive.google.com/file/d/1irin9hTI2Jqf-0Zg2mOsB1nzARkL4Gs3/view?usp=drive_link)


Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>

Profesor Ariel Betancud</br>

# Clase 3 miercoles

## Cambios en GitHub: de master a main

El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.<br/>


Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.<br/>
Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.<br/>
Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.<br/>
Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.<br/>
La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.<br/>
Y sí, las palabras importan.<br/>
Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.<br/>
> ¿Cuando es que sigue siendo master y cuando sigue siendo main?
```sh
#Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando:
 git branch -M main
#O cambiando la asignación por default con este otro comando:
git config --global init.defaultBranch main
#A partir de este comando siempre que ingreses git init será la rama main.
#Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.
#Otro comando que deben saber es:
gitk
#Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.
#Para instalar gitk debemos ejecutar los siguientes comandos:
sudo apt-get update
sudo apt-get install gitk
#Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.
```

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor: <br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 3:<br/>

[Video Capitulo 02](https://drive.google.com/file/d/1sNtWVHF-L4pIiEVTr4qEQUVhT4W964tD/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1snYyd_MldpZ1iGRLTmADzG4uUC21nda5/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>

Profesor Ariel Betancud<br/>


# Clase 4 Miercoles
> Tu primer push
La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.<br/>
Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.<br/>
Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.<br/>
Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:<br/>
```sh
#ssh
git remote set-url origin url-ssh-del-repositorio-en-github
#Comandos para copiar la llave SSH:
#ESTAS SON LAS RUTAS DEL SSH PUBLICO
#-Mac:
pbcopy < ~/.ssh/id_rsa.pub
#Windows (Git Bash):
clip < ~/.ssh/id_rsa.pub
#Linux (Ubuntu):
cat ~/.ssh/id_rsa.pub
```
## Importante

Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.<br/>
Invitar a un colaborador<br/>
Para invitar a un colaborador debemos ir a GitHub y seleccionar:<br/>
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.<br/>
Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.<br/>

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 4:<br/>

[Video Capitulo 03](https://drive.google.com/file/d/1LgOq1_qtjeZcIq1f1PR4GMV8AWANN6Ju/view?usp=drive_link)

[PDF](https://docs.google.com/presentation/d/14odWSx7zoJ78nEj83V5sKkVaRIxqk0j_/edit?usp=drive_link&ouid=103827187004520077964&rtpof=true&sd=true)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>
Profesor Ariel Betancud<br/>

# Clase 5 miercoles

## Git tag y versiones en GitHub

En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.</br>
Creación de etiquetas en Git</br>

```sh
git tag

```


Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.</br>


Listado de etiquetas</br>
Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:</br>



Para crear una etiqueta, ejecuta el siguiente comando:</br>



Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.</br>

```sh
git tag
```
Esto mostrará una lista de las etiquetas existentes, como:</br>
v1.0</br>
v1.1</br>
v1.2</br>
Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.</br>
Uso compartido de etiquetas</br>
Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:</br>
```sh
git push origin
#Para enviar varias etiquetas a la vez, usa:
git push origin --tags
#Eliminación de etiquetas
#Para eliminar una etiqueta, usa el siguiente comando:
git tag -d
#Esto eliminará la etiqueta identificada por en el repositorio local.
```
En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.</br>

## PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:</br>
Dante Nicolás Martinez</br>
Segundo Semestre Parte 5:</br>

[Video Capitulo 04](https://drive.google.com/file/d/1F_kpPnOEJRQDvdymclsKNyqr4h09NWfz/view?usp=drive_link)


[PDF](https://drive.google.com/file/d/12MArnwaV5RfzzedZ0AtDlRk_a12kL-9W/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.</br>

Profesor Ariel Betancud</br>

# Clase 6a miercoles

## Error con los tags
Investigación: ¿Qué pasa si por error cargamos un tag dos veces? <br/>
¿Cómo solucionarías este problema o error?<br/>
La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.<br/>

## PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 6:<br/>

[Video Capitulo 05](https://drive.google.com/file/d/1SV4-SAizEU84_T9B6-iBHJm5c72Gt-Z5/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1HoelHkism3xk_2BzmpN_rMhWokEDADaf/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>

Profesor Ariel Betancud<br/>

# Clase 6b miercoles

## Error con los tags
Investigación: Si un tag es imposible generarlo dos veces ¿Cómo es que existe el error de dos tags con el mismo nombre?<br/>
¿Cómo se origina este problema o error?<br/>
La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.<br/>

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 6:<br/>

[Video Capitulo 06](https://drive.google.com/file/d/1wrqZlPWWZGseWpop94J0jZSgFj_XTqER/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/14p1D22y8L8DJNdQ6BMmkR22So2b3lWkk/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>

Profesor Ariel Betancud<br/>

# Clase 8 miercoles

## Manejo de ramas en GitHub

Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.<br/>
Para instalar gitk debemos ejecutar los siguientes comandos:<br/>
```sh
  sudo apt-get update
  sudo apt-get install gitk

```
Repasa: ¿Qué es Git?<br/>
Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.<br/>
Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.<br/>
Comandos para manejo de ramas en GitHub<br/>
Crear una rama:<br/>
```sh
git branch branchName #Crear una rama
git checkout -b branchName #También crea una rama
git checkout branchName #Movernos a otra rama 
git push origin branchName #Publicar una rama local al repositorio remoto
```
Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.<br/>

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 7:<br/>

[Video capitulo 07](https://drive.google.com/file/d/13rdccGVNp1cyiximL7PBnzt0obCCID3H/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1mzSJke4-kr2CX3pBBuFbcgwkEeUqq5Wo/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>
Profesor Ariel Betancud<br/>

# Clase 9 miercoles

## Configurar múltiples colaboradores en un repositorio de GitHub
Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.<br/>
Cómo agregar colaboradores en Github<br/>
Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:<br/>
Repositorio > Settings > Collaborators<br/>
Ahí, debemos añadir el email o username de los nuevos colaboradores.<br/>
Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:<br/>
Hacer un commit con el nuevo mensaje que queremos, esto nos abre el editor de texto de la terminal:<br/>
```sh
git commit —amend #Corregimos el mensaje
git pull origin main #Traer el repositorio remoto
git push --set-upstream origin main #Ejecutar el cambio, el error arreglado
Comienzo del colaborador
cd Documentos #Abre git bash
mkdir class-git #Crea la carpeta o directorio de trabajo
ls -al #Revisa lo que va haciendo, los archivos o directorios que tiene
# 1. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.
# 2. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.
# 3. En git bash ponemos el siguiente comando.
git clone url-copiada-github #Esto hace que clonemos el repositorio
# 4. No pide ni usuario ni contraseña si el repositorio es publico.
code . #Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt #Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit #Esto en Ubuntu
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
vim escribimos el mensaje del commit #Esto en git bash window
esc #Presionamos escaner luego de terminar de escribir
:wq! #Para salir del editor vim en window
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch #Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log #Para ver toda las historia
git log --graph #Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main, Git es una base de datos de toda las historia de todo lo que se ha hecho
git push origin main #Va a pedir un email que será el del colaborador, su contraseña.
# 5. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.
# 6. Ir a settings del repositorio, veremos la opsión Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.
# 7. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.
# 8. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
# 9. El dueño del repositorio no ve los cambios, ¿Qué hacer?
git pull origin main
git fetch
git log --stat #Se verá claro que el colaborador ingreso su primer commit
# 10. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.
```

## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:<br/>
Dante Nicolás Martinez<br/>
Segundo Semestre Parte 8:<br/>

[Video Capitulo 08](https://drive.google.com/file/d/1e55H586Q_-znRiJHl7jSuJTud-UVf-ZX/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1Pa8KQK65csbgLEI_BAd2AOdonDarsLBU/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.<br/>
Profesor Ariel Betancud<br/>




# Clase 10 Miercoles

## Flujo de trabajo profesional

## Haciendo merge de ramas de desarrollo a main

Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores. </br>
Una buena práctica de flujo de trabajo sería la siguiente:</br>
Crear ramas</br>
Asignar una rama a cada programador</br>
El programador baja el repositorio con git pull origin master</br>
El programador cambia de rama</br>
El programador trabaja en esa rama y hace commits</br>
El programador sube su trabajo con git push origin #nombre_rama</br>
El encargado de organizar el proyecto baja, revisa y unifica todos los cambios</br>


## PORTAFOLIO

Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:</br>
Dante Nicolás Martinez</br>
Segundo Semestre Parte 8:</br>

[Video Capitulo 9](https://drive.google.com/file/d/1Z80SxVKmkzhzVY5hIxTDtWjHfryHgt1J/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1SwPO2PrveW0DRGXyfzKD9yYWeKJUlCkm/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.</br>
Profesor Ariel Betancud</br>




# Clase 11 Miercoles

## Flujo de trabajo profesional -> Archivos binarios

Las imagenes cargandolas en el repositorio, representan un problema: porque las imagenes son pesadas, y si la subimos al repositorio, siempre que hagamos cambios, vamos a estar trayendo la imagen siempre, estas imagenes son binarios para GitHub, mientras mas binarios carguemos, más pesado va a ser el repositorio, algo que no es parte de las buenas practicas.</br>

Otra cosa muy importante a tener en cuenta, es que en cada commit que hagamos hay un tamaño predefinido para la carga, este no lo podemos superar o no podremos subir los commits, el tamaño es 100 mb, si acoplamos un archivo binario en un commit que pese mas de esto, será un problema, no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.</br>

## PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:</br>

Dante Nicolás Martinez</br>

Segundo Semestre Parte 9:</br>

[Video Capitulo 10](https://drive.google.com/file/d/14Ykgp8zJcjjuZlg_JSFiwmjeIT7qUt27/view?usp=drive_link)

[PDF](https://drive.google.com/file/d/1RTKm9QSD_ylnDD3Q719lYqhlYW48cOHe/view?usp=drive_link)

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.</br>

Profesor Ariel Betancud</br>
