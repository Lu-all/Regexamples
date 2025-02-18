# Regexamples

A repository with 5 examples of regular expressions in Java.

## Program A

Extract years from a text.

### Example:

Ariadna Thalía Sodi Miranda (Mexico City, August 26, 1971), known as Thalía, is a Mexican singer, actress and businesswoman.
She began her musical career in the early 1980s as the lead singer of a children's group called Din-Din and in 1986 she joined the band Timbiriche,
with which she recorded three studio albums, and from which she separated in 1989. She returned to Mexico in 1990.
She released Mundo de cristal in 1991 and Love in 1992, both of which achieved sales success in Mexican territory.
In 1994 she signed a contract. In 2009 she signed a contract with Sony Music. First row: Thalia, by distributing 500,000 copies in Mexico.

### Regex:

```
/(?:\D|^)(\d{4})(?:\D|$)/g
```

## Program B

Check if a (Spanish) license plate is valid:

1. It can start with “E-” or "E "
2. Must be followed by 4 digits.
3. Must be followed by a hyphen or a space
4. Must be followed by three letters

### Example:

E1337ZZZ, E-0000 PCB, 7899-FGV, E7654AER

### Regex:

```
/\b(E[- ]?)?)\d{4})[- ])([A-Z]{3})\b/g
```

## Program C

Check if a URJC teacher or student email is valid (and separate both cases)

- Teacher email: ending in @urjc.es
- Student email: ending in @alumnos.urjc.es
  
### Example:

e.aoza.2015@alumnos.urjc.es, elvis.aoza@urjc.es

### Regex:

```
/(?:[a-z]\.([a-z]{2,})\.(\d{4})@alumnos\.urjc\.es)|(?:[a-z]+)\.([a-z]+)@urjc\.es)/
```

## Program D

Check if a (Spanish) address is valid

### Example:

C/ Dulcinea Nº 10, 28936, Calle Dulcineña 10, 28106, Calle Dulcínea N10, 28091; Calle Ñ n9, 
23451

### Regex:

```
/(?:(?:C\/)|(?:Calle)) ([A-ZÑÀ-ÿ][\wñÀ-ÿ]*),? *(?:[Nn]º? ?)?(\d+), *(\d{5})/g
```

## Program E

Separate information by fields in a log

### Example:

2022-02-07 01:14:28.313 INFO 1174086 --- [main] drfp.Main : Starting Main v0.1- SNAPSHOT 
using Java 17.0.1 on r2-ubuntu with PID 1174086 started by rm 

2022-02-07 01:14:28.317 INFO 1174086 --- [main] drfp.Main : No active profile set, falling back 
to default profiles: default 

2022-02-07 01:14:29.428 INFO 1174086 --- [main] a.p.q.PostPCheck : Bean 
’eventAsyncConfigurer’ of type 

[es.urjc.etsii.grafo.solver.services.events.EventAsyncConfigurer] is not eligible for getting 
processed by all BeanPostProcessors (for example: not eligible for auto-proxying) 

2022-02-07 01:14:29.806 INFO 1174086 --- [main] TomcatWebServer : Tomcat initialized with 
port(s): 8080 (http) 

2022-02-07 01:14:29.818 INFO 1174086 --- [main] o.a.c.c.StdSvc : Starting service [Tomcat]

### Regex:

```
/([A-Z]+).*\[(\w+)][\sa-z.]*([A-Z][\w]*)\s*:\s*(.+)/g
```
