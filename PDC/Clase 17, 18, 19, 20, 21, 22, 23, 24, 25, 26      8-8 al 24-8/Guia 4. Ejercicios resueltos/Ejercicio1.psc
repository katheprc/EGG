Algoritmo Ejercicio1
	
	Dimension vector(5)
	Definir aux Como Entero
	Definir num, vector Como Real
	
	Escribir "Ingrese un numero"
	leer num
	vector(0) = num
	
	para aux <- 1 hasta 4
		Escribir "Ingrese otro numero"
		leer num
		vector(aux) = num
	FinPara
	
	para aux <- 0 hasta 4
		Escribir vector(aux) ", " Sin Saltar
	FinPara
	
FinAlgoritmo
