/* 1. Obtener los datos completos de los empleados. */

select * from empleados;



/* 2. Obtener los datos completos de los departamentos. */

select * from departamentos;
 


/* 3. Listar el nombre de los departamentos. */

select nombre_depto from departamentos;



/* 4. Obtener el nombre y salario de todos los empleados. */

select nombre, sal_emp from empleados;



/* 5. Listar todas las comisiones. */

select comision_emp from empleados;



/* 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’. */

select * from empleados where cargo_emp = "Secretaria";



/* 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente. */

select * from empleados 
where cargo_emp = "vendedor" 
order by nombre asc;



/* 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor. */

select nombre, cargo_emp from empleados 
order by sal_emp;



/* 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real” */

select nombre_jefe_depto from departamentos where ciudad = 'CIUDAD REAL';



/* 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados. */

select nombre as Nombre, cargo_emp as Cargo from empleados;



/* 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor. */

select sal_emp, comision_emp from empleados 
where id_depto = 2000 
order by comision_emp;



/* 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación
 de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético. */

select nombre as Nombre, (sal_emp + comision_emp + 500) as ValorAPagar from empleados where id_depto = 3000 order by nombre;



/* 13. Muestra los empleados cuyo nombre empiece con la letra J. */

select nombre from empleados where nombre like 'J%';



/* 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000. */

select sal_emp, comision_emp, nombre, (sal_emp + comision_emp) as SalarioTotal from empleados 
where comision_emp > 1000; 



/* 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión. */

select sal_emp, comision_emp, nombre, (sal_emp + comision_emp) as SalarioTotal from empleados 
where comision_emp = 0;



/* 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo. */

select nombre, comision_emp, sal_emp from empleados 
where comision_emp > sal_emp;



/* 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. */

select nombre, comision_emp, sal_emp from empleados 
where comision_emp <= (sal_emp*30/100);



/* 18. Hallar los empleados cuyo nombre no contiene la cadena “MA” */

select * from empleados where nombre not like '%MA%';



/* 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento. */

select * from departamentos  
where nombre_depto like "ventas" or nombre_depto like "investigación" or nombre_depto like "mantenimiento";



/* 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento. */

select * from departamentos  
where nombre_depto not like "ventas" and nombre_depto not like "investigación" and nombre_depto not like "mantenimiento";



/* 21. Mostrar el salario más alto de la empresa. */

select max(sal_emp) from empleados; 



/* 22. Mostrar el nombre del último empleado de la lista por orden alfabético. */

select max(nombre) from empleados order by nombre;



/* 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos. */

select max(sal_emp) as SalarioAlto, min(sal_emp) as SalarioBajo, (max(sal_emp)-min(sal_emp)) as Diferencia from empleados;



/* 24. Hallar el salario promedio por departamento. */

select id_depto, avg(sal_emp) as SalarioPromedio from empleados group by id_depto 



/* ------------------------------------- */

/* Consultas con Having */

/* 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos. */

select id_depto, count(id_depto) as CantidadEmpleados from empleados group by id_depto having count(id_depto) > 3;



/* 26. Hallar los departamentos que no tienen empleados */

select id_depto, count(id_depto) as CantidadEmpleados from empleados group by id_depto having count(id_depto) = 0;



/* ------------------------------------- */

/* Consulta con Subconsulta */

/* 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento. */

select * from empleados where (sal_emp >= (select avg(sal_emp) from empleados)) order by id_depto;


