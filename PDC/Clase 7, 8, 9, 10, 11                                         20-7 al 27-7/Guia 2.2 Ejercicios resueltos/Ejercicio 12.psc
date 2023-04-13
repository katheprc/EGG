Algoritmo Ejercicio12
	
	Definir min, max, num, aux Como Real
	Escribir "Ingresar un número entero mínimo"
	leer min
	Escribir "Ingresar un número entero máximo"
	leer max
	Escribir "Ingresar números enteros situados entre ambos numeros ingresados"
	Leer num
	aux = 0
	mientras num >= min y num <= max
		Escribir "Ingrese otro número"
		leer num
		aux = aux + 1
	FinMientras
	
	Escribir "La cantidad de números válidos ingresados fue: " , aux
	
FinAlgoritmo
