# Regexamples
## Caso A
Extraer años en un texto.
### Caso base:
Ariadna Thalía Sodi Miranda (Ciudad de México, 26 de agosto de 1971), conocida como Thalía, 
es una cantante, actriz y empresaria mexicana.
Inició su carrera musical a principios de los años 1980 como vocalista de un grupo infantil 
llamado Din-Din y en 1986 se integró a la banda Timbiriche, con la que grabó tres álbumes de 
estudio, y de la que se separó en 1989. Regresó a México en 1990. Publicó Mundo de cristal en 
1991 y Love en 1992, los cuales lograron éxito en ventas en territorio mexicano. En 1994 firmó 
un contrato. En 2009 firmó un contrato con Sony Music. Primera fila: Thalía, al distribuir 
500000 copias en México.
### Expresión regular:
```
/(?:\D|^)(\d{4})(?:\D|$)/g
```
## Caso B
Comprobar si una matrícula es válida
### Casos base:
E1337ZZZ, E-0000 PCB, 7899-FGV, E7654AER
### Expresión regular:
```
/\b(E[- ]?)?)\d{4})[- ])([A-Z]{3})\b/g
```
## Caso C
Saber si un correo de profesor o alumno de la URJC es válido (y separar ambos casos)
### Casos base:
e.aozanoo.2015@alumnos.urjc.es, elvis.aozanoo@urjc.es
### Expresión regular:
```
/(?:[a-z]\.([a-z]{2,})\.(\d{4})@alumnos\.urjc\.es)|(?:[a-z]+)\.([a-z]+)@urjc\.es)/
```
## Caso D
Ver si una dirección es válida
### Casos base:
C/ Dulcinea Nº 10, 28936, Calle Dulcineña 10, 28106, Calle Dulcínea N10, 28091; Calle Ñ n9, 
23451
### Expresión regular:
```
/(?:(?:C\/)|(?:Calle)) ([A-ZÑÀ-ÿ][\wñÀ-ÿ]*),? *(?:[Nn]º? ?)?(\d+), *(\d{5})/g
```
## Caso E
Separar información por campos en un log
## Casos base:
2022-02-07 01:14:28.313 INFO 1174086 --- [main] drfp.Main : Starting Main v0.1- SNAPSHOT 
using Java 17.0.1 on raul2-ubuntu with PID 1174086 started by rmartin 
2022-02-07 01:14:28.317 INFO 1174086 --- [main] drfp.Main : No active profile set, falling back 
to default profiles: default 
2022-02-07 01:14:29.428 INFO 1174086 --- [main] a.p.q.PostPCheck : Bean 
’eventAsyncConfigurer’ of type 
[es.urjc.etsii.grafo.solver.services.events.EventAsyncConfigurer] is not eligible for getting 
processed by all BeanPostProcessors (for example: not eligible for auto-proxying) 
2022-02-07 01:14:29.806 INFO 1174086 --- [main] TomcatWebServer : Tomcat initialized with 
port(s): 8080 (http) 
2022-02-07 01:14:29.818 INFO 1174086 --- [main] o.a.c.c.StdSvc : Starting service [Tomcat]
### Expresión regular:
```
/([A-Z]+).*\[(\w+)][\sa-z.]*([A-Z][\w]*)\s*:\s*(.+)/g
```
