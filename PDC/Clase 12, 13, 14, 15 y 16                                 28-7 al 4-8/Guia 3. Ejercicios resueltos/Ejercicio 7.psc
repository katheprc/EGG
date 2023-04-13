Algoritmo Ejercicio7
	Definir min, max, med Como real
	Definir cant, aux Como Entero
	med = 0
	Escribir "Ingrese cantidad de días"
	leer cant
	para aux <- 1 hasta cant
		Escribir "Ingresar temperatura maxima del día " aux
		leer max
		Escribir "Ingresar temperatura minima del día " aux
		leer min
		media(min, max, med)
		Escribir "La temperatura media del día " aux " es: " med
		Escribir " "
		
	FinPara
	
	
FinAlgoritmo

SubProceso media (min, max, med Por Referencia)
	
	med = ((min + max) / 2)
	
FinSubProceso
	