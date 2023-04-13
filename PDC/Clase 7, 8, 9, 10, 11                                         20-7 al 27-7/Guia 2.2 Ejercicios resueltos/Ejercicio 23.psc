Algoritmo Ejercicio23
	
	definir fra Como Caracter
	Definir long, aux como entero
	
	Escribir "Ingresar una frase"
	leer fra
	long = Longitud(fra) - 1
	Para aux <- long Hasta 0
		Escribir Sin Saltar Subcadena(fra,aux,aux) " "
		
	FinPara
	
FinAlgoritmo
