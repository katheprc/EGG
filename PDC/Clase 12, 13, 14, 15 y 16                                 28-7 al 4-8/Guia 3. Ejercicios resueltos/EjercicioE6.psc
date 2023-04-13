Algoritmo EjercicioE6
	
	Definir num, aux1 Como Entero
	aux1 = 0
	Escribir "Ingresar un número"
	leer num
	Escribir "Hay " parimpar(num, aux1) " números impares y " aux1 " números impares"
	
FinAlgoritmo



Funcion retorno <- parimpar (num, aux1 Por Referencia)
	Definir retorno, aux2 Como Entero
	retorno = 0
	Hacer
		aux2 = (num mod 10)
		num = trunc(num / 10)
		si (num mod 2 = 0)
			aux1 = aux1 + 1
		SiNo
			retorno = retorno + 1
		FinSi
	Mientras Que (num > 0)
	
	
	
FinFuncion
