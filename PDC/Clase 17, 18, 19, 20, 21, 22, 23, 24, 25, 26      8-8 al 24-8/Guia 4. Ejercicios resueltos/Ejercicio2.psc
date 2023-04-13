Algoritmo Ejercicio2
	
	Dimension vector(10)
	Definir vector, aux, suma, resta, multiplicacion Como Real
	
	Escribir "Ingrese un numero"
	leer vector(0)
	suma = vector(0)
	multiplicacion = vector(0)
	resta = vector(0)
	para aux <- 1 hasta 9
		Escribir "Ingrese otro numero"
		leer vector(aux)
		suma = suma + vector(aux)
		resta = resta - vector(aux)
		multiplicacion = multiplicacion * vector(aux)
	FinPara
	Escribir "Suma de los numeros ingresados: " suma
	Escribir "Resta de los numeros ingresados: " resta
	Escribir "Multiplicacion de los numeros ingresados: " multiplicacion
	
FinAlgoritmo
