# Project Title

INTRODUCTION TO JAVA, MVN, AND GIT: LOC COUNTING

## Descripción

En este repositorio se encontrará un programa en java el cual le permitirá contar las líneas físicas o las líneas de código de un archivo o un directorio.

### LOC/h

Para este taller se hicieron 90 líneas de código, en 2 horas.

**45 LOC/h**

### Prerrequisitos

Para correr este se debe tener instalado:

- Maven
- Java

### Guía de uso

Para compilar el proyecto se debe usar:

```
mvn package
```

Para ejecutarlo, se debe hacer de la siguiente forma

```
$ java -cp "target\classes" edu.escuelaing.arem.ASE.app.CountLoc [Forma de contar líneas] [Archivo o Directorio]
```

Como primer parámetro, se podrá mandar 'phy' en caso de contar todas las líneas de cada archivo o 'loc' en caso de contar las líneas que solo sean código de cada archivo.

## Ejecutar Test

Para ejecutar los test, en la consola se debe ejecutar el siguiente comando:

```
mvn test
```

### Explicación test

En cuanto a las pruebas, se tienen cuatro, 2 para directorios y 2 para archivos.

Uno de estos 2 test, probará el contador de líneas físicas y el otro líneas de código

### Reporte de Pruebas

![Reporte de Pruebas](img\report_test.png)

## Documentación

Para visualizar la documentación se debe ejecutar el siguiente comando:

```
mvn javadoc:javadoc
```

Una vez se realice este comando, se debe buscar en la siguiente ruta "target\site\apidocs\index.html"

## Estructura de Archivos

    .
    |____pom.xml
    |____src
    | |____main
    | | |____java
    | | | |____edu
    | | | | |____escuelaing
    | | | | | |____app
    | | | | | | |____CountLoc.java
    | |____test
    | | |____java
    | | | |____edu
    | | | | |____escuelaing
    | | | | | |____app
    | | | | | | |____CountLocTest.java

## Diagrama de Clases

![Diagrama de Clases](img\Diagrama_de_Clases.png)

## Construido con

- [Maven](https://maven.apache.org/) - Dependency Management
- [Java](https://www.java.com/es/) - Progamming Language

## Autor

- **Juan Carlos Baez Lizarazo** - [juanbaezl](https://github.com/juanbaezl)

## Fecha

7 de Junio, 2022

## Licencia

Para más información ver: [LICENSE.txt](LICENSE.txt)
