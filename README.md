# Practica 7 - Persistencia con Queries 

Práctica realizada por Yago Tobio y Luis Bueno. 


## Objetivos: 

Aprender como manejar bases de datos mediante SpringBoot. 
Conocer la nueva estructura de Schemas, Datos, y archivos Java en este proyecto, haciendo uso de las dependencia H2 DATABASE, JDBC, SpringBoot Web y Lombok 

## Contenidos: 

Tenemos un total de 4 tablas: 
- Usuarios 
- Hosts 
- Vehiculos 
- Cargadores 

En el Schema encontrará la estructura de cada una de estas tablas. 
En terminos de las 2 acciones JOIN, hemos decidido unir los Usuarios con los vehiculos, y los Hosts con los cargadores. 
Hemos tenido que tener muy clara la estructura de los archivos al tener que manegar 4 tablas distintas. Cada uno con sus metodos distintos. 
A parte de los JOIN, hemos decidido incorporar la metodología CRUD. Particularmente en la clase de los Chargers, en la que podemos actualizar, borrar y modificar valore. 

Todo esto mediante el mapeo de queries SQL en Java. 
