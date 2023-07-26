/*1 - POSICION
 Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.*/

select count(*) from estadisticas where Asistencias_por_partido = (select max(Asistencias_por_partido) from estadisticas)

/*resultado 2*/



/*1 - CLAVE
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/

select sum(j.peso) as clave from jugadores j, equipos e
where j.Nombre_equipo =e.Nombre and e.Conferencia = 'east' and j.Posicion like '%c%'

/*resultado 14043*/



/*2 - POSICION
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.*/

select count(*) from jugadores 
inner join estadisticas on jugadores.codigo = estadisticas.jugador 
where estadisticas.Asistencias_por_partido > (select count(*) from jugadores where Nombre_equipo = 'heat');

/*resultado 3*/



/*3 - CLAVE
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/

select distinct count(*) from estadisticas where temporada like '%99%'

select distinct count(*) from partidos where temporada like '%99%' /*correcto*/

/*resultado 3480*/



/* 3 - POSICIÓN:: 
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

select ((count(*) / (select count(codigo) from jugadores where Peso >= 195)) + 0.9945) from jugadores j
right join equipos e on j.Nombre_equipo = e.Nombre 
where j.Procedencia  like 'Michigan' and e.Conferencia like 'West';

/*resultado 1*/



/*3 - CLAVE: 
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central*/

select floor(avg(Puntos_por_partido) + sum(Asistencias_por_partido) + sum(Tapones_por_partido)) as resultado from estadisticas es
inner join jugadores j on j.codigo = es.jugador 
inner join equipos eq on j.Nombre_equipo = eq.Nombre 
where eq.Division like 'central';

/*resultado 1038*/



/*4 - POSICIÓN:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado*/

select round(Tapones_por_partido) from estadisticas e
inner join jugadores j on j.codigo = e.jugador 
where j.Nombre like 'corey maggette' and temporada like '00/01';

/*resultado: 4*/



/* 4 - CLAVE:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/

select floor(sum(Puntos_por_partido)) from estadisticas e
inner join jugadores j on j.codigo = e.jugador 
where j.Procedencia like "argentina"

/*resultado 191*/