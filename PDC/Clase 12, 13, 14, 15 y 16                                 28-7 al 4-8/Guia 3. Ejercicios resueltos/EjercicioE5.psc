Algoritmo EjercicioE5
	
	Definir num como entero
	Escribir "Indicar un número de dos cifras o más"
	leer num
	Escribir "La suma de sus dígitos es: " suma(num)
	
FinAlgoritmo



Funcion retorno <- suma (num)
	
	Definir retorno Como entero
	retorno = 0
	hacer
		retorno = retorno + (num mod 10)
		num = trunc(num / 10)
	mientras que (num > 0)

FinFuncion
	