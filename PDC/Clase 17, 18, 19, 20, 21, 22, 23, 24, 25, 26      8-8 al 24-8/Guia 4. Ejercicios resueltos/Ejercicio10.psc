Algoritmo Ejercicio10
	Definir n, m, matriz1, matriz2, matrizsuma, aux, aux2 Como Entero
	Escribir "Indicar cantidad de filas: "
	leer m
	Escribir "Indicar cantidad de columnas: "
	leer n
	Dimension matriz1(n, m), matriz2(n, m), matrizsuma(n, m)
	aleat(n, m, matriz1, matriz2)
	sum(n, m, matriz1, matriz2, matrizsuma)
	
FinAlgoritmo



SubProceso aleat (n, m, matriz1 Por Referencia, matriz2 Por Referencia)
	
	Definir aux, aux2 como real
	aux2 = 0
 	para aux <- 0 hasta (n - 1)
		matriz1(aux, aux2) = aleatorio(1, 5)
		matriz2(aux, aux2) = Aleatorio(1, 5)
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



SubProceso sum (n, m, matriz1, matriz2, matrizsuma Por Referencia)
	Definir aux, aux2 Como Entero
	aux2 = 0
	Escribir " "
	Escribir "Matriz 1: "
	Escribir " "
	para aux <- 0 hasta n - 1
		Escribir matriz1(aux, aux2) "    " Sin Saltar
		si aux = n - 1 y aux2 < m - 1
			Escribir " "
			si aux2 = m - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
	FinPara
	
	aux2 = 0
	Escribir " "
	Escribir " "
	Escribir " "
	Escribir "Matriz 2: "
	Escribir " "
	para aux <- 0 hasta n - 1
		Escribir matriz2(aux, aux2) "    " Sin Saltar
		si aux = n - 1 y aux2 < m - 1
			Escribir " "
			si aux2 = m - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
	FinPara
	
	
	
	
	aux2 = 0
	Escribir " "
	Escribir " "
	Escribir " "
	Escribir "Matriz suma: "
	Escribir " "
	
 	para aux <- 0 hasta n - 1
		matrizsuma(aux, aux2) = (matriz1(aux, aux2)) + matriz2(aux, aux2)
		Escribir matrizsuma(aux, aux2) "    " Sin Saltar
		si aux = n - 1 y aux2 < m - 1
			si aux2 = m - 1
				aux = n - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
		FinSi
	FinPara
	
	
FinSubProceso
	