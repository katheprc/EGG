Algoritmo Ejercicio7
	
	Definir vector1, vector2, tam Como Entero
	
	Escribir "Ingrese el tamaño deseado de los vectores"
	leer tam
	Dimension vector1(tam), vector2(tam)
	rellenar(tam, vector1, vector2)
	si (igual(tam, vector1, vector2) = Verdadero)
		Escribir "Todos los valores de los vectores son iguales"
	SiNo
		Escribir " "
		Escribir "La cantidad de valores iguales es: " tam
	FinSi
	
FinAlgoritmo



SubProceso rellenar (tam, vector1 Por Referencia, vector2 Por Referencia)
	
	Definir aux Como Entero
	
	para aux <- 0 Hasta tam - 1
		vector1(aux) = Aleatorio(1, 10)
		vector2(aux) = Aleatorio(1, 10)
		Escribir "Vector 1: " vector1(aux), "     Vector 2: " vector2(aux)
	FinPara
	
FinSubProceso



Funcion retorno <- igual (tam Por Referencia, vector1 Por Referencia, vector2 Por Referencia)
	
	Definir retorno Como Logico
	Definir aux, aux2 Como Entero
	
	retorno = Verdadero
	aux2 = tam
	tam = 0
	para aux <- 0 hasta aux2 - 1
		si (vector1(aux) = vector2(aux))
			tam = tam + 1
		SiNo
			retorno = Falso
		FinSi
	FinPara
	
FinFuncion