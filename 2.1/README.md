# Inicio rápido con Maven

## Descarga

Las liberaciones más recientes así como los requerimientos del sistemas pueden consultarse en https://maven.apache.org/download.cgi#

## Instalación

La instalación de Apache Maven es un simple proceso de extracción del archivo descargado y agregar el directorio bin con el comando mvn a la variable de entorno `PATH`

Los pasos detallados son:
* Asegurar que la variable de entorno `JAVA_HOME` fue establecida y que apunte a la instalación del JDK
* Extraer el archivo de distribución en cualquier directorio

```
unzip apache-maven-3.5.3-bin.zip
```

o bien

```
tar xzvf apache-maven-3.5.3-bin.tar.gz
```

Alternativamente utilizar la herramienta de extracción de archivos preferida.

* Agregar el directorio `bin` del directorio apache-maven-3.x.x a la variable de ambiente `PATH`

* Confirmar utilizando el comando `mvn -v` en una consola nueva. El resultado debería ser similar a 

_Apache Maven 3.5.3 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T08:58:13+01:00) Maven home: /opt/apache-maven-3.5.3 Java version: 1.8.0_45, vendor: Oracle Corporation Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre Default locale: en_US, platform encoding: UTF-8 OS name: “mac os x”, version: “10.8.5”, arch: “x86_64”, family: “mac”_

### Consejos para Windows

* Verificar el valor de la variable de entorno, por ejemplo
```
echo %JAVA_HOME% C:\Program Files\Java\jdk1.7.0_51
```

* Agregar a la variable `PATH`: Agregar el directorio `bin` de la distribución en la variable de ambiente `PATH` abriendo las propiedades del sistema (WinKey + Pausa), seleccionar la pestaña "Avanzado" y el botón "Variables de entorno", entonces agregar o seleccionar la variable PATH en las variables del usuario con la ruta del directorio `bin` (ejemplo: `C:\Program Files\apache-maven-3.5.3\bin`). El mismo diálogo puede ser utilizado para establecer la variable `JAVA_HOME` a que apunte al JDK, ej `C:\Program Files\Java\jdk1.7.0_51`

* Abrir una nueva consola de comandos (Winkey + R y después escribir cmd) y ejecutar `mvn -v` para verificar la instalación.

### Consejos para sistemas operativos basados en Unix (Linux, Solaris y Mac OS X)

* Verificar la variable de entorno 
```
echo $JAVA_HOME /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
```

* Agregar a la variable PATH
```
export PATH=/opt/apache-maven-3.5.3/bin:$PATH
```

# Trabajando con el ejemplo

El ejemplo consiste en una aplicación Java web construida con Maven por lo cual presenta una estrucuta de carpetas y archivo preestablecida.

## Estructura de archivos
Al crear un proyecto de Maven se define una estructura prederminada de carpetas y archivos.

En el nivel superior se encuentran los archivos que describen al proyecto (pom.xml). De igual modo se encuentran documentos contextuales para que el usuario sea capaz de leer de manera inmediata al recibir las fuentes como son archivos README, LICENSE, etc.

Solamente hay dos subdirectorios para esta estructura: src y target. El resto de los directorios que se esperarían aquí son metadatos como CVS, .git o .svn, y algunos subproyectos en una construcción multiproyectos.

El directorio target es utilizado para guardar todas las salidas de la construcción.

El directorio src contiene todos los materiales fuente para construir el proyecto. Se contiene un subdirectorio para cada tipo: main para el artefacto de construcción principal, test para el código y recursos de pruebas unitarias, etc.

* `src/main/java`. Fuentes de la aplicación o biblioteca. Archivos *.java
* `src/main/resources`. Recursos de la aplicación o biblioteca. Otros archivos (*.properties, *.xml, *.yml, *.json)
* `src/main/webapp`. Fuentes de la aplicación web. Archivos estáticos  (imágenes, archivos de JavaScript y hojas de estilo), archivos HTML y *.jsp.
* `src/test/java`. Fuentes de las pruebas. Archivos *.java basados en TestNG o JUnit
* `src/test/resources`. Recursos para pruebas. Otros archivos




## Archivo pom.xml

POM son las iniciales de "Project Object Model". Es una representación en XML de un proyecto Maven definido en un archivo llamado pom.xml. Un proyecto en Maven contiene archivos de configuración así como los desarrolladores involucrados y los roles que juegan, el sistema de seguimiento de defectos, la organización y licencias, la URL donde el proyecto vive, las dependencias del proyecto y todas las demás piezas que entran en juego para dar vida al código. Es un único punto de todas las cosas relacionadas con el proyecto. De hecho en el mundo Maven, un proyecto no necesita contener código en absoluto, simplemente un archivo pom.xml

## Comandos básicos

* Compilar el proyecto
```
mvn compile
```

* Instalar el proyecto en el repositorio local
```
mvn install
```

* Limpiar el proyecto
```
mvn clean
```

* Ejecutar múltiples objetivos
```
mvn clean install
```

* Utilizar el complemento de Jetty para ejecutar la aplicación web
```
mvn jetty:run
```
