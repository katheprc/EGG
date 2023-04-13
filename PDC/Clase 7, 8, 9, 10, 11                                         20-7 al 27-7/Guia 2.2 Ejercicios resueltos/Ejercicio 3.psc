Algoritmo Ejercicio3
	
	Definir num, aux, suma, prom Como Real
	Escribir "Ingresar una secuencia de números y al finalizar colocar -1"
	num = 0
	aux = 0
	suma = 0
	Mientras (num <> -1)
		leer num
		aux = aux + 1
		suma = suma + num
	FinMientras
	
	prom = (suma + 1)/(aux-1)
	Escribir "El promedio entre los numeros ingresados es de: ", prom
	
FinAlgoritmo
