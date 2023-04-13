Algoritmo Ejercicio8
	
	Definir cant, inte, expo, parc, aux, final, cantrep, promrep, cantapr, expomay, cantparc Como Real
	Escribir "Ingresar cantidad de estudiantes"
	leer cant
	cantrep = 0
	promrep = 0
	expomay = 0
	cantapr = 0
	cantparc = 0
	para aux <- 1 Hasta cant
		Escribir "  "
		Escribir "Alumno: " aux
		Escribir "Indicar nota del integrador"
		leer inte
		Escribir "Indicar nota de la exposición"
		leer expo
		Escribir "Indicar nota del parcial"
		leer parc
		final = (inte*0.35) + (expo*0.25) + (parc*0.40)
		Escribir "La nota final del alumno es: " final
		
		si final < 6.5
			cantrep = cantrep + 1
			promrep = promrep + final
		FinSi
		
		si inte > 7.5
			cantapr = cantapr + 1
		FinSi
		
		si expomay < expo
			expomay = expo
		FinSi
		
		si (parc >= 4) y (parc <= 7.5)
			cantparc = cantparc + 1
		FinSi
	FinPara
	si cantrep > 0 
		Escribir "Cantidad de alumnos reprobados: " , cantrep ". Nota promedio final de los estudiantes reprobados: " , promrep/cantrep
	SiNo
		Escribir "No hay alumnos reprobados"
	FinSi
	
	Escribir "Porcentaje de alumnos con nota de integrador mayor a 7.5: " ((cantapr*100)/cant) "%"
	Escribir "Mayor nota obtenida en las exposiciones: " , expomay
	Escribir "Total de estudiantes que obtuvieron entre 4 y 7.5 en el parcial: " , cantparc
	
FinAlgoritmo
