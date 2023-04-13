Algoritmo Ejercicio3
	Definir num1, num2 Como Entero
	Escribir "Indicar dos números"
	leer num1, num2
	si EsMultiplo(num1, num2) = Verdadero
		Escribir num1 " es multiplo de " num2
	SiNo
		Escribir num1 " no es multiplo de " num2
	FinSi
	
	
FinAlgoritmo

Funcion retorno <- EsMultiplo (num1, num2)
	
	Definir retorno Como Logico
	Definir aux Como Entero
	para aux <- 0 Hasta num2
		retorno = num2 * aux = num1
	FinPara
	
FinFuncion
	