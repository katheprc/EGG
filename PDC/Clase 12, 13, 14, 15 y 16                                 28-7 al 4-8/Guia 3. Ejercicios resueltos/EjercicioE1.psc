Algoritmo EjercicioE1
	
	Definir num Como Entero
	Escribir "Ingresar un número para saber la suma de sus divisores"
	leer num
	Escribir "La suma de los divisores de: " num " es: " divisores(num)
	
FinAlgoritmo



Funcion retorno <- divisores (num)
	
	Definir retorno, aux Como Entero
	retorno = 0
	para aux <- 1 Hasta num - 1
		si (num mod aux = 0)
			retorno = retorno + aux
		FinSi
	FinPara
	
FinFuncion