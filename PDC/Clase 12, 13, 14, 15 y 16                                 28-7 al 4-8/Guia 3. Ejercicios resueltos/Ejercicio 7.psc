Algoritmo Ejercicio7
	Definir min, max, med Como real
	Definir cant, aux Como Entero
	med = 0
	Escribir "Ingrese cantidad de d�as"
	leer cant
	para aux <- 1 hasta cant
		Escribir "Ingresar temperatura maxima del d�a " aux
		leer max
		Escribir "Ingresar temperatura minima del d�a " aux
		leer min
		media(min, max, med)
		Escribir "La temperatura media del d�a " aux " es: " med
		Escribir " "
		
	FinPara
	
	
FinAlgoritmo

SubProceso media (min, max, med Por Referencia)
	
	med = ((min + max) / 2)
	
FinSubProceso
	