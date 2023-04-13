Algoritmo Ejercicio8
	
	Definir matriz, aux Como Entero
	Dimension matriz(3,3)
	
	para aux <- 0 hasta 2
		Escribir "Rellenar columna " aux + 1 " de la primer fila de la matriz"
		leer matriz(0, aux)
		Escribir " "
		Escribir "Rellenar columna " aux + 1 " de la segunda fila de la matriz"
		leer matriz(1, aux)
		Escribir " "
		Escribir "Rellenar columna " aux + 1 " de la tercer fila de la matriz"
		leer matriz(2, aux)
		Escribir " "
	FinPara
	
	Escribir " "
	Escribir "Primer fila: "
	
	Para aux <- 0 hasta 2
		Escribir sin saltar matriz(0, aux) " "
	FinPara
	
	Escribir " "
	Escribir " "
	Escribir "Segunda fila: "
	
	Para aux <- 0 hasta 2
		Escribir sin saltar matriz(1, aux) " "
	FinPara
	
	Escribir " "
	Escribir " "
	Escribir "Tercer fila: "
	
	Para aux <- 0 hasta 2
		Escribir sin saltar matriz(2, aux) " "
	FinPara
	
FinAlgoritmo
