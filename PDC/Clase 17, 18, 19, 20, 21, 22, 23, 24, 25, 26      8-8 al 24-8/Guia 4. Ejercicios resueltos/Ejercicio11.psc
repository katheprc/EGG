Algoritmo 	Ejercicio11
	Definir matriz, n Como Entero
	Escribir "Indicar cantidad de filas y columnas para la matriz cuadrada"
	leer n
	Dimension matriz(n, n)
	rellenar(n, matriz)
	mostrarr(n, matriz)
FinAlgoritmo



SubProceso rellenar (n, matriz Por Referencia)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 1
		
		si (aux = aux2)
			matriz(aux, aux2) = 0
		SiNo
			matriz(aux, aux2) = Aleatorio(1,9)
		FinSi
		si aux = n - 1 y aux2 <= n - 1
			si aux2 = n - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso mostrarr (n, matriz)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 1 
		Escribir matriz(aux, aux2) "    " Sin Saltar
		si aux = n - 1 y aux2 <= n - 1
			si aux2 = n - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
			Escribir " "
		FinSi
	FinPara
	
FinSubProceso
	