Algoritmo EjercicioE8
	
	Definir num, multiplicador Como Entero
	multiplicador = 10
	Escribir "Indicar un número de hasta 4 dígitos para saber si es capicúa"
	leer num
	si capicua(num, multiplicador) = Verdadero
		Escribir "Es capicúa"
	SiNo
		Escribir "No es capicúa"
	FinSi
	
FinAlgoritmo



Funcion retorno <- capicua (num, multiplicador Por Referencia)
	
	Definir aux, aux2, contador Como Entero
	Definir retorno Como Logico
	aux = 0
	aux2 = 0
	si (num > 9) y (num < 100)
		aux = num mod 10
		aux2 = trunc(num / 10)
		retorno = (aux = aux2)
	SiNo
		si (num > 99) y (num < 1000)
			aux = num mod 10
			aux2 = trunc(num / 100)
			retorno = (aux = aux2)
		SiNo
			si (num > 999) y (num < 10000)
				aux = num mod 10
				aux2 = trunc(num / 1000)
				retorno = (aux = aux2)
				aux = trunc((num mod 100) / 10)
				aux2 = trunc(num / 100)
				aux2 = aux2 mod 10
				retorno = (aux = aux2)
			FinSi
		FinSi
	FinSi
	
	
	
FinFuncion
	