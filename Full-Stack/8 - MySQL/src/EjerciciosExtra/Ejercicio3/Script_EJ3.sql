-- 1. Mostrar el nombre de todos los pokemon.

select nombre from pokemon order by nombre;



-- 2. Mostrar los pokemon que pesen menos de 10k.

select * from pokemon where peso < 10;



-- 3. Mostrar los pokemon de tipo agua.

select pokemon.*, pokemon_tipo.id_tipo, tipo.nombre from pokemon
INNER JOIN pokemon_tipo ON pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
inner join tipo on pokemon_tipo.id_tipo = tipo.id_tipo 
where tipo.nombre like "agua";



-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.

select pokemon.*, pokemon_tipo.id_tipo, tipo.nombre from pokemon
INNER JOIN pokemon_tipo ON pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
inner join tipo on pokemon_tipo.id_tipo = tipo.id_tipo 
where tipo.nombre like "agua" or tipo.nombre like "fuego" or tipo.nombre like "tierra"
order by tipo.nombre, pokemon.nombre;



-- 5. Mostrar los pokemon que son de tipo fuego y volador.

select pokemon.*, pokemon_tipo.id_tipo, tipo.nombre from pokemon
INNER JOIN pokemon_tipo ON pokemon.numero_pokedex = pokemon_tipo.numero_pokedex
inner join tipo on pokemon_tipo.id_tipo = tipo.id_tipo 
where tipo.nombre like "fuego" or tipo.nombre like "volador"
order by tipo.nombre, pokemon.nombre;



-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.

select pokemon.*, es.ps from pokemon
INNER JOIN estadisticas_base es ON es.numero_pokedex = pokemon.numero_pokedex
where es.ps > 200;



-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

select nombre, peso, altura,  evoluciona_de.pokemon_origen from pokemon
inner join evoluciona_de on evoluciona_de.pokemon_origen= pokemon.numero_pokedex
where evoluciona_de.pokemon_evolucionado = (select numero_pokedex from pokemon where nombre like "Arbok");



-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.






-- 9. Mostrar el nombre del movimiento con más prioridad.




-- 10. Mostrar el pokemon más pesado.



-- 11. Mostrar el nombre y tipo del ataque con más potencia.



-- 12. Mostrar el número de movimientos de cada tipo.



-- 13. Mostrar todos los movimientos que puedan envenenar.



-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.



-- 15. Mostrar todos los movimientos que aprende pikachu.



-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).



-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.



-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.



-- 19. Mostrar todos los pokemon que evolucionan por piedra.



-- 20. Mostrar todos los pokemon que no pueden evolucionar.



-- 21. Mostrar la cantidad de los pokemon de cada tipo.

