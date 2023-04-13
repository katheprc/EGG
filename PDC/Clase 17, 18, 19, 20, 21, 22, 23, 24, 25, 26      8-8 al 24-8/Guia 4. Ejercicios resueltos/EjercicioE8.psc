Algoritmo EjercicioE8
	Definir vector, n, aux Como Entero
	Escribir "Indicar tamaño de vector"
	leer n
	Dimension vector(n)
	para aux <- 0 Hasta n - 1
		vector(aux) = Aleatorio(1, 10)
		Escribir vector(aux) "    " Sin Saltar
	FinPara
	Escribir ""
	Escribir ""
	Escribir "El producto entre los números es: " producto(vector, n)
	
FinAlgoritmo



Funcion retorno <- producto (vector, n)
	Definir retorno, aux Como Entero
	retorno = 1
	para aux <- 0 Hasta n - 1
		retorno = retorno * vector(aux)
	FinPara
FinFuncion
	