Algoritmo Ejercicio7
	
	definir fra Como Caracter
	Definir long, aux como entero
	
	Escribir "Ingresar una frase"
	leer fra
	long = Longitud(fra) - 1
	Para aux <- 0 Hasta long
		Escribir Sin Saltar Subcadena(fra,aux,aux) " "
	FinPara
	
FinAlgoritmo
