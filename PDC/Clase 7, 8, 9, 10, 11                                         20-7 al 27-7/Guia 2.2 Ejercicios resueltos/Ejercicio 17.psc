Algoritmo Ejercicio17
	
	Definir num, sum Como Entero
	definir preg Como caracter
	sum = 0
	Hacer
		Escribir "Ingresar un número entero positivo"
		leer num
		sum = sum + num
		Escribir "¿Desea ingresar otro número? (S/N)"
		leer preg
	Mientras Que ((preg = "s") o (preg = "S"))
	
	Escribir "La suma de los números ingresados es: " sum
	
FinAlgoritmo
