Algoritmo Ejercicio8
	
	Definir num1, num2, cociente como entero
	cociente = 0
	Escribir "Indicar dos números para realizar su cociente"
	Escribir "Dividendo: " Sin Saltar
	leer num1 
	Escribir "Divisor: " Sin Saltar
	leer num2
	Escribir "El cociente entre " num1 " y " num2 " es " Sin Saltar
	division(num1, num2, cociente)
	Escribir Sin Saltar cociente ". El residuo es " num1
	
FinAlgoritmo

SubProceso division (num1 Por Referencia, num2, cociente Por Referencia)
	
	Mientras (num1 >= num2)
		num1 = num1 - num2
		cociente = cociente + 1
	FinMientras
	
FinSubProceso
