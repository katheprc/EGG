Algoritmo Ejercicio18
	
	Definir num, aux, aux2, suma, suma2 Como Real
	suma = 0
	suma2 = 0
	aux = 0
	aux2 = 0
	Hacer
		escribir "Ingresar números"
		leer num
		si (num mod 2 = 0)
			suma = suma + num
			aux = aux + 1
		SiNo
			suma2 = suma2 + num
			aux2 = aux2 + 1
		FinSi
	Mientras Que (aux + aux2) < 10
	Escribir "La media entre los números PARES es: " suma/aux
	Escribir "La media entre los números IMPARES es: " suma2/aux
	
	
FinAlgoritmo
