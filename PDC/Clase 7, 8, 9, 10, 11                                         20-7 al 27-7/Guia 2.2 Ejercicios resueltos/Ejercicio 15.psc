Algoritmo Ejercicio15
	
	Definir num, aux, aux2 Como Entero
	Escribir "Ingresar un n�mero entero positivo para ver cuantos digitos tiene"
	leer num
	aux2 = 1
	Mientras num >= 10
		aux = num / 10
		num = trunc(aux)
		aux2 = aux2 + 1
	FinMientras
	Escribir "El n�mero ingresado tiene " aux2 " d�gitos."
	
FinAlgoritmo
