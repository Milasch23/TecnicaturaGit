# Apuntes Markdown de Git

## Clase 1 GitBash


**pwd**  # Vemos la ruta de la carpeta en la que estamos

**cd** # Es para navegar a una carpeta: change directory -> cambiar de directorio

**cd** / # Nos llava al home, en la raíz del disco

**cd ~** # La virgulilla significa que estamos en el lugar de los documentos o del usuario

**ls** # Esto es listar los archivos, nos muestra todos los archivos en la raíz

**ls -al** # El espacio -al significa que es un argumento especial para ver archivos ocultos



##### *Usar la flecha hacía arriba nos muestra el último comando utilizado*



**ls -l** # Muestra casi todos los archivos sin los que están ocultos

**ls -a** # Muestra el grupo de archivos pero no en una lista

**clear** # Limpia la consola o ctrl + l

**cd ..** # Nos devuelve a la carpeta anterior

**cd U + tab** # Esto se usa para un autocompletado o para buscar una referencia

**cd /D** # Cambiamos de disco en window

**df -h** # Muestra todos los directorios en Ubuntu

**cd /mnt/d** # Cambia de directorio usando WSL Ubuntu en window



### CREACIÓN DE CARPETAS

**cd ..**

**cd ..**

**cd /mnt/c**

**cd ~** # Vamos a la raíz

**mkdir Tecnicatura** # Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux

**cd tecnicatura**

**mkdir Python**

**mkdir Java**

**mkdir JavaScript**

## CLASE 2

### Abrir git bash en Windows o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador


**touch vacio.txt** #Crea un archivo con su extención: ESCRIBIR DENTRO

**ctrl + s** #Guardamos lo que escribimos en el archivo

**./** #Significa la carpeta actual

**../** #Significa la carpeta anterior

**cat vacio.txt** #Vemos el contenido del archivo

**history** #Veremos la historia completa de los comandos que hemos utilizado

**!72 + enter** #Veremos el comando que utilizamos en ese número

**rm vacio.txt** #Borra el archivo seleccionado, :smile: ¡¡¡¡CUIDADO!!!!

**rm --help** #Muestra como funciona el comando 


### CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

**cd tecnicatura**

**mkdir class-git**

**cd class-git** #Entramos en la carpeta que necesitamos trabajar

**git init** #Creamos un repositorio en la carpeta central, se crea el archivo .git

**code .**  #Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados

**ctrl + n** #Creamos un archivo nuevo y escribimos en el, como lo hicimos antes

**ctrl + s** #Guardamos poniendo el nombre: historia.txt

**git status** #Vemos el estado del proyecto en tiempo real, esta en el área de trabajo

**git add historia.txt** #Enviamos el archivo al área de preparación

**git status** #Para ver el estado de cambios

**git rm --cached historia.txt** #Quitamos el archivo del área de preparación, cached significa que esta en memoria ram

**git config** #Tedremos la lista de como funciona la configuración

**git config --list** #Configuraciones por defecto, faltan cosas importantes

**git config --list --show-origin** #Veremos donde están las configuraciones guardadas

**git config --global user.name "Ariel Betancud"**

**git config --global user.email "betancudariel@gmail.com"** #El correo debe ser el mismo que usaremos en GitHub

**git config --list** #Ahora veremos que ya están todos los datos completos

**git add .** #Ingresamos todos los archivos al área de preparación (ram)

**git commit -m "Mensaje importante del commit"** #El primer commit esta hecho

**code .** #Hacemos cambios en el archivo y guardamos

**git status** #Hay cambios para commitear

**git add .**

**git commit -m "Mi segundo commit"**


**git log historia.txt** #Vemos toda la historia de este archivo, el número largo es el hash del commit

# CLASE 3

## Analizar cambios en los archivos de tu proyecto Git parte 3

### Ingresamos de la siguiente manera:

#### Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

**cd tecnicaturagit** #Ingresamos al direcotorio donde están nuestras carpetas de trabajo

**ls** #Vemos los archivos y directorios que ya tenemos

**cd git** #No hay nada

**cd ..** #Salimos

**rm historia.txt** #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica

**rm Git #rm: cannot remove 'Git': Is a directory**

**rm --recursive -R Git #By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments**

**option to remove each listed directory, too, along with all of its contents.** Esto es para practica

**rm --help** #Nos muestra lo que les puse arriba como documentación en Inglés.

**mkdir class-git** #Creamos la carpeta o directorio para trabajar en Git local por ahora.

**cd class-git** #Entramos para crear el README.md para este sector.

**touch README.md** #Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.

### Enlace a la documentación en GitHub de MARKDOWN

#### Leemos la documentación para ir creando en README.md como lo enseña GitHub.

**code .** #Abrimos VSC para editar el archivo.

#### Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear

**git status**

**git add .**

**git status**

**git commit -m "Cargamos el README dentro del directorio class-git"**

**git status**

**git log** #Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.

**cd ..**

**cd ..**

# CLASE 4

## Analizar cambios en los archivos de tu proyecto Git parte 4

### Ingresamos de la siguiente manera:

#### Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

**cd tecnicatura**

**cd class-git**

**ls**

**touch historia.txt**

**code .**

#### Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido     mi nombre es Ariel (coloca tu nombre)

**ctrl + s**

**git status**

**git add .**

**git status**

**git commit** #Sin agregar -m veremos que pasa

#### Agregar mensaje y salir con

**Esc** #Presionamos Escape 

**:wq! + enter** #Y ya salimos si estamos en git bash con window

**Esc + shift + z + z** #Salimos del mensaje para el commit, en linux, esto anda en algunas terminales

#### Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación

**ctrl + s**

**git add .**

**git commit**

#### Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim

**Esc + i** #Para comenzar a escribir mensaje del commit, no suele ser necesario

**ctrl + x** #Para salir en linux

**s + enter** #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux

**git show** #Vemos todos los cambios en el último commit

**git log historia.txt** #Vemos todos los commit

**q** #Para salir del registro de commits

#### Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando

**git diff hash_commit_numerico hash_commit_numerico** #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva

**q** #Para salir

**cd ..**

**cd ..**

# Clase 6

**cd tecnicatura**

**cd class-git**

**ls**

**touch historia.txt**

**cd ..**

**code .** #Hagamos cambios en el archivo historia.txt

**git commit -a** #Abrimos el vim para editar el commit

**esc + i**  #Esto para escribir

**esc** #Para poner el comando de salida del editor

**:wq!**  #Comando para salir del editor

**git log** #Vemos los commit hechos hasta ahora

**git show**

**git log --oneline** #Copiamos el hash corto del commit seleccionado

#### Copiar el hash #El número largo que tiene el commit después de un git log o el hash corto

**git reset hash-nombre-commit** #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave

**git status** #Veremos que por default hizo un reset suave --soft y quedaron los cambios en el working

**git add .**   #Volvemos a commitear

**git commit -m** "Agregamos datos de estudios en historia.txt"

**git config --list** #Veremos la configuración que ya hemos hecho con en nombre y email

**git log --oneline** #Copiar hash

**git reset --hard hash** #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo

#### Crear, modificar y commitear de nuevo el archivo historia.txt dejar cosas en el staging

**git reset --soft hash** #Este es el suave, lo que tengamos en staging segirá allí

**git diff + enter** #y nos muestra los cambios en memoria ram y en disco

**git add .** #Agregamos todo al staging

**git status** #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea

**git commit -m** "Commiteamos lo último de hoy"

**git log** #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuertehacer cambios en historia.txt #Cambiamos la última línea y

**ctrl + s**

**git diff**

#### Agregar cambios al archivo historia.txt una vez más

**git commit -am "cambio en la última línea del historia.txt"**

**git log**

**q**  #Esto para salir

**git log --stat** #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits

**q** #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit

**git checkout hash** #Veremos el archivo en su estado original

**git status**

**git checkout master** #Volvemos a la versión master del archivo historia.txt

**git checkout hash** #Volvemos a hacer esto y cambiamos cosas del archivo

**git commit -am "Reemplazo de una versión por otra de la historia"**

**git log**

#### Veremos un nuevo hash para el nuevo commit, se recomienda esta tecnica para quitar posibles errores no encontrados, desde aquí se debe crear una nueva rama para guardar estos cambios y continuar desde lo que si esta funcionando.

**git branch cambios**

**git checkout master**

#### Por esto es que se recomienda trabajar con ramas secundarias, con nombres alternativos, nombres practicos, release, hotfix, etc. y las ramas primarias no se deben tocar, las ramas primarias son master o main y una segunda que podemos poner de nombre second, develop, etc.

**git branch second** #Creamos las ramas de trabajo

**git branch tuNombre**

**git branch hotfix**

**git branch** #Vemos las ramas que tenemos

**git branch -d cambios** #Borramos la rama, si no se borra utilizar

**git branch -D cambios**

**cd ..**

**cd ..**

# Clase 7

**cd tecnicatura** #Vamos a hacer pruebas, es por esto que creamos una carpeta nueva

**cd practicas** #Entramos en la carpeta

**touch reset_file.txt** #Agregar información y hacer uno a dos commits

**git add reset_file.txt**

**git add .**

**git commit -m"Iniciando el primer commit"**

###Comenzar con las pruebas de git reset

**git reset --soft** # Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit. 

**git reset --hard** # Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

**git reset --mixed** # Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial. 

**git reset HEAD** # El comando git reset saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.

# clase 8

## Comandos para trabajo remoto con GIT

**git clone url_del_servidor_remoto** #Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git

**git push** #Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.

**git fetch** #Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).

**git merge** #También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.

**git pull** #Básicamente, git fetch y git merge al mismo tiempo.

### Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:

**git log --oneline** #Te muestra el id commit y el título del commit.

**git log --decorate** #Te muestra donde se encuentra el head point en el log.

**git log --stat** #Explica el número de líneas que se cambiaron brevemente.

**git log -p** #Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.

**git shortlog** #Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.

**git log --graph --oneline --decorate --all**

**git log -3** #Limitamos el número de commits.

**git log --after=“2018-1-2”**

**git log --after=“today”**

**git log --after=“2018-1-2” --before=“today”** #Commits para localizar por fechas.

**git log --author=“Name Author”** #Commits hechos por autor que cumplan exactamente con el nombre.

**git log --grep=“INVIE”** #Busca los commits que cumplan tal cual está escrito entre las comillas.

**git log --grep=“INVIE” –i** #Busca los commits que cumplan sin importar mayúsculas o minúsculas.

**git log – index.html** #Busca los commits en un archivo en específico.

**git log -S “Por contenido”** #Buscar los commits con el contenido dentro del archivo.

**git log > log.txt** #guardar los logs en un archivo txt


# clase 9

## Comandos básicos de GitHub:

**git init** # crear un repositorio, si ya esta en la nube traerlo sin hacer git init

**git add .** #agregar un archivo a staging.

**git commit -m** “mensaje” #guardar el archivo en git con un mensaje.

**git branch nombre_rama** #crear una nueva rama.

**git checkout nombre_rama** #moverse entre ramas.

**git push origin rama** #mandar cambios a un servidor remoto.

**git fetch** #traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local.

**git merge rama** #tiene dos usos. Uno es la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada. Su otro uso es guardar los cambios de un servidor remoto en nuestro directorio.

**git pull origin rama** #fetch y merge al mismo tiempo.

**git checkout “codigo de version” “nombre del archivo”** #volver a la última versión de la que se ha hecho commit.

**git reset** #vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones.

**git reset --soft** #vuelve a la versión en el repositorio, pero guarda los cambios en staging. Así, podemos aplicar actualizaciones a un nuevo commit.

**git reset --hard** #todo vuelve a su versión anterior

**git reset HEAD** #saca los cambios de staging, pero no los borra. Es lo opuesto a git add.

**git rm** #elimina los archivos, pero no su historial. Si queremos recuperar algo, solo hay que regresar. se utiliza así:

**git rm --cached** #elimina los archivos en staging pero los mantiene en el disco duro.

**git rm --force** #elimina los archivos de git y del disco duro.

**git status** #estado de archivos en el repositorio.

**git log** #historia entera del archivo.

**git log --stat** #cambios específicos en el archivo a partir de un commit.

**git show** #cambios históricos y específicos hechos en un archivo.

**git diff “codigo de version 1” “codigo de version 2”** #comparar cambios entre versiones.

**git diff** #comparar directorio con staging.

### Comando en producción: TUVE QUE SOLUCIONAR UN CONFLICTO

**git status** #En rama segunda: hacemos cambios en el archivo y guardamos

**git commit -am "Finalizado el cambio en rama segunda"** #enter

**git status**

**git checkout master** #perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo parrafo y guardamos

**git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"**

**git checkout segunda** #vemos como desaparecen los cambios

**git checkout master** #Aquí es que vamos a hacer el merge

**git merge segunda** #En mi caso tuve algunos conflictos que solucione a través de VSC, aclaro que nunca debemos utilizar Fusionar los dos cambios

**git commit -am "Arreglando conflicto"** #Una vez solucionado debemos commitear

**git status** #Debemos revisar en el navegador y en el código si algo quedo mal y cambiarlo

**git commit -am "Solucionado el conflicto 2"**

**git merge segunda** #ahora todo va bien

**git commit -am "Volvi a comentar en este caso de mi area laboral"** #Añado información al archivo

**git log**

**q** #Para salir

**git commit -am "Para guardar estos cambios en el README.md"**

**git checkout segunda**

**git merge master** #Traemos todos los cambios

**git commit -am "Cargamos esto ahora"** #vamos a master y mergeamos

**git checkout master**

**git merge segunda** #y terminamos con esto

# clase 10

## Cómo revertir un merge Si nos hemos equivocado y queremos cancelar el merge, debemos usar el siguiente comando:

**git merge --abort**

### Conflictos en repositorios remotos Al trabajar con otras personas, es necesario utilizar un repositorio remoto.
­
#### Para copiar el repositorio remoto al directorio de trabajo local, se utiliza el comando git clone , y para enviar cambios al repositorio remoto se utiliza git push.

**git clone enlace-ssh**

**git fetch**

**git push origin master**

**git merge**

**git pull origin master**

**git commit -am "Este es un commit rápido"**

**git branch** #Vemos las ramas creadas y en cual estamos ubicados

**git branch second** #Estamos creando una rama nueva llamada second

**git checkout second** #Vamos a la rama second saliendo de master


#### Hacemos cambios en el código que estamos trabajando

**ctrl + s** #Guardamos los cambios

**git add .**

**git commit -m "Cambios en el archivo de trabajo"**

**git push origin second**

**git checkout master**

**git merge second** #Mergeamos los cambios a la rama master

**git push origin master**

#### Para actualizar el repositorio local se hace uso del comando git fetch, luego se debe fusionar los datos traídos con los locales usando git merge.

#### Para traer los datos y fusionarlos a la vez, en un solo comando, se usa git pull.

­#### Para crear commits rápidamente, fusionando git add y git commit -m "", usamos git commit -am "".

­#### Para generar nuevas ramas, hay que posicionarse sobre la rama que se desea copiar y utilizar el comando git branch .

### Configuración muy importante para cambiar el nombre por default que recibe la rama principal (master)

**git config --global init.defaultBranch main**  #A partir de este momento cada repositorio creado recibira el nombre main por default

#### Para saltar entre ramas, se usa el comando git checkout

­#### Una vez realizado los cambios en la rama, estas deben fusionarse con git merge.

#### El merge ocurre en la rama en la que se está posicionado. Por lo tanto, la rama a fusionar se transforma en la principal.

#### Los merges también son commits.

#### Los merges pueden generar conflictos, esto aborta la acción y pide que soluciones el problema manualmente, aceptando o rechazando los cambios que vienen.

### Repasa qué es un branch

## Sección Práctica

### Hacemos cambios estando en la rama master, en el archivo de trabajo

**ctrl  + s**

**git status**

**git add .**

**git commit -m"Aregando cambios nuevos al archivo de trabajo"**

**git push origin master**

**git log**

**q** #Para seguir en la línea decomandos

**git checkout second** #volvemos a la rama second

**git merge master** #traemos los cambios desde la master y tenemos las dos ramas actualizadas

**git push origin second**


### Ahora vamos a crear un conflicto para ver como salimos de el, vamos a cargar datos nuevos creando un archivo html estando en la rama second, y también vamos a hacer lo mismo estando en la master y veremos como lo solucionamos.


#### Abrimos el archivo html y lo modificamos estando en la rama second, ctrl + s para guardar


#### Luego commiteamos en la rama second y pasamos a la rama master, hacemos modificaciones también, guardar y commitear, hacer un merge estando en master: pongo en orden los comandos abajo.

**ctrl + s** #Guardamos los cambios en la rama second, ponemos cambios en el archivo html

**git commit -am "Modifique el html y el color del texto"** es un ejemplo

**git checkout master** #Modificamos el html, ponemos código y ponemos texto blue

**ctrl + s** #Guardamos los cambios

**git commit -am "Agregue información, cambie el código y puse todo el texto azul"**

**git merge second** #Hacemos un merge estando en master y veremos el conflicto



### Para solucionar el conflicto podemos abrir el archivo con el editor de texto y modificar lo que nos este señalando y guardamos, esto en el html, lo podemos hacer desde VSC seleccionando: el cambio entrante.


#### Debemos ahora commitear estos cambios, abajo pongo los comandos.

**git status**

**git commit -am "Solución de conflictos al mergear las ramas"**

**git checkout second** #Seguiremos con la versión anterior, porque el merge fue en master

**git merge master** #Ahora pasamos los cambios a la rama second.