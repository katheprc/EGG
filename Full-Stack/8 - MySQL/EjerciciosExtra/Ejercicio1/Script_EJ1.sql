/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/
 
 select nombre from jugadores order by nombre asc;
  
    

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, 
-- ordenados por nombre alfabéticamente.

select nombre from jugadores where Posicion like "%c%" and peso > 200;



/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/

select nombre from equipos order by Nombre ;



/*4. Mostrar el nombre de los equipos del este (East).*/

select nombre from equipos where Conferencia like "east"



/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/

select * from equipos where Ciudad like "C%" order by nombre;



/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/

select nombre, Nombre_equipo  from jugadores order by Nombre_equipo ; 



/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/

select * from jugadores j where Nombre_equipo like "raptors" order by Nombre ;



/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/

select Puntos_por_partido from estadisticas e 
inner join jugadores j on e.jugador = j.codigo 
where j.Nombre like "Pau Gasol";



/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/

select Puntos_por_partido from estadisticas e 
inner join jugadores j on e.jugador = j.codigo 
where j.Nombre like "Pau Gasol" and temporada like "04/05";



/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/

select j.Nombre, sum(Puntos_por_partido) from estadisticas e 
inner join jugadores j on e.jugador = j.codigo 
group by j.Nombre 



/*11. Mostrar el número de jugadores de cada equipo.*/

select count(*) from jugadores j
inner join equipos eq on j.Nombre_equipo = eq.Nombre 
group by eq.Nombre ;



/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera.*/

select j.Nombre, sum(Puntos_por_partido) from estadisticas e 
inner join jugadores j on e.jugador = j.codigo 
group by j.Nombre order by sum(Puntos_por_partido) desc limit 1



/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/

select e.Nombre, Conferencia, Division from equipos e 
inner join jugadores j on j.Nombre_equipo = e.Nombre 
order by j.Altura desc limit 1



/*14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor*/
/*diferencia de puntos.*/

select equipo_local, equipo_visitante, if(puntos_local > puntos_visitante, (puntos_local - puntos_visitante), (puntos_visitante-puntos_local)) as diferencia from partidos p
where puntos_local - puntos_visitante = (select max(puntos_local - puntos_visitante) from partidos) or puntos_visitante-puntos_local = (select max(puntos_visitante-puntos_local) from partidos)



/*15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,*/
/*equipo_ganador), en caso de empate sera null.*/

select codigo, equipo_local, equipo_visitante, puntos_local, puntos_visitante, (if (puntos_local > puntos_visitante, equipo_local, if(puntos_visitante>puntos_local, equipo_visitante, null)))as equipo_ganador from partidos p 


