Algoritmo EjercicioE7
	
	Definir num, aux, aux2, contador Como Entero
	aux = 0
	aux2 = 1
	
	Escribir "Ingrese el término que desea obtener de la sucesión de Fibonacci"
	leer num
	Escribir aux2 Sin Saltar
	para contador <- 2 Hasta num
		escribir ", " fibonacci(num, aux, aux2, contador) sin saltar
	FinPara
	
FinAlgoritmo


Funcion retorno <- fibonacci(num, aux Por Referencia, aux2 Por Referencia, contador Por Referencia)
	
	Definir retorno Como Entero
	si aux = 0
		retorno = 0
	FinSi
	
	retorno = aux + aux2
	aux = aux2
	aux2 = retorno
	
FinFuncion
	