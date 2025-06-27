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
Analizar cambios en los archivos de tu proyecto Git parte 3

Ingresamos de la siguiente manera:

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

cd tecnicaturagit #Ingresamos al direcotorio donde están nuestras carpetas de trabajo

ls #Vemos los archivos y directorios que ya tenemos

cd git #No hay nada

cd .. #Salimos

rm historia.txt #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica

rm Git #rm: cannot remove 'Git': Is a directory

rm --recursive -R Git #By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments

option to remove each listed directory, too, along with all of its contents. Esto es para practica

rm --help #Nos muestra lo que les puse arriba como documentación en Inglés.

mkdir class-git #Creamos la carpeta o directorio para trabajar en Git local por ahora.

cd class-git #Entramos para crear el README.md para este sector.

touch README.md #Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.

Enlace a la documentación en GitHub de MARKDOWN

Leemos la documentación para ir creando en README.md como lo enseña GitHub.

code . #Abrimos VSC para editar el archivo.

Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear

git status

git add .

git status

git commit -m "Cargamos el README dentro del directorio class-git"

git status

git log #Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.

cd ..

cd ..

# CLASE 4
Analizar cambios en los archivos de tu proyecto Git parte 4

Ingresamos de la siguiente manera:

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

cd tecnicatura

cd class-git

ls

touch historia.txt

code .

#Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido     mi nombre es Ariel (coloca tu nombre)

ctrl + s

git status

git add .

git status

git commit #Sin agregar -m veremos que pasa


#Agregar mensaje y salir con

Esc #Presionamos Escape 

:wq! + enter #Y ya salimos si estamos en git bash con window

Esc + shift + z + z #Salimos del mensaje para el commit, en linux, esto anda en algunas terminales

#Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación

ctrl + s

git add .

git commit

#Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim

Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario

ctrl + x #Para salir en linux

s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux

git show #Vemos todos los cambios en el último commit

git log historia.txt #Vemos todos los commit

q #Para salir del registro de commits

#Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando

git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva

q #Para salir

cd ..

cd ..

# Clase 6

cd tecnicatura

cd class-git

ls

touch historia.txt

cd ..

code . #Agamos cambios en el archivo historia.txt

git commit -a #Abrimos el vim para editar el commit

esc + i  #Esto para escribir

esc #Para poner el comando de salida del editor

:wq!  #Comando para salir del editor

git log #Vemos los commit hechos hasta ahora

git show

git log --oneline #Copiamos el hash corto del commit seleccionado

Copiar el hash #El número largo que tiene el commit después de un git log o el hash corto

git reset hash-nombre-commit #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave

git status #Veremos que por default hizo un reset suave --soft y quedaron los cambios en el working

git add .   #Volvemos a commitear

git commit -m "Agregamos datos de estudios en historia.txt"

git config --list #Veremos la configuración que ya hemos hecho con en nombre y email

git log --oneline #Copiar hash

git reset --hard hash #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo

#Crear, modificar y commitear de nuevo el archivo historia.txt dejar cosas en el staging

git reset --soft hash #Este es el suave, lo que tengamos en staging segirá allí

git diff + enter #y nos muestra los cambios en memoria ram y en disco

git add . #Agregamos todo al staging

git status #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea

git commit -m "Commiteamos lo último de hoy"

git log #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte

hacer cambios en historia.txt #Cambiamos la última línea y

ctrl + s 

git diff

#Agregar cambios al archivo historia.txt una vez más

git commit -am "cambio en la última línea del historia.txt"

git log

q  #Esto para salir

git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits

q #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit

git checkout hash #Veremos el archivo en su estado original

git status

git checkout master #Volvemos a la versión master del archivo historia.txt

git checkout hash #Volvemos a hacer esto y cambiamos cosas del archivo

git commit -am "Reemplazo de una versión por otra de la historia"

git log

#Veremos un nuevo hash para el nuevo commit, se recomienda esta tecnica para quitar posibles errores no encontrados, desde aquí se debe crear una nueva rama para guardar estos cambios y continuar desde lo que si esta funcionando.

git branch cambios

git checkout master

#Por esto es que se recomienda trabajar con ramas secundarias, con nombres alternativos, nombres practicos, release, hotfix, etc. y las ramas primarias no se deben tocar, las ramas primarias son master o main y una segunda que podemos poner de nombre second, develop, etc.

git branch second #Creamos las ramas de trabajo

git branch tuNombre

git branch hotfix

git branch #Vemos las ramas que tenemos

git branch -d cambios #Borramos la rama, si no se borra utilizar

git branch -D cambios

cd ..

cd ..