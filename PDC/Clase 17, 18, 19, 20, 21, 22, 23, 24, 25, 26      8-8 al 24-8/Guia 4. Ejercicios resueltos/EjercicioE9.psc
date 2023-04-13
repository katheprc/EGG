Algoritmo EjercicioE9
	
	Definir matriz, n, m Como Entero
	Escribir "Indicar cantidad de columnas de la matriz"
	leer n
	Escribir "Indicar cantidad de filas de la matriz"
	leer m
	Dimension matriz(n, m)
	rellenar(n, m, matriz)
	Escribir ""
	Escribir ""
	mostrarr(n, m, matriz)
FinAlgoritmo



SubProceso rellenar (n, m, matriz Por Referencia)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 1
		
		
		matriz(aux, aux2) = Aleatorio(1,9)
		
		si aux = n - 1 y aux2 <= m - 1
			si aux2 = m - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso mostrarr (n, m, matriz)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 1 
		Escribir matriz(aux, aux2) "   " Sin Saltar
		si aux = n - 1 y aux2 <= m - 1
			si aux2 = m - 1
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
