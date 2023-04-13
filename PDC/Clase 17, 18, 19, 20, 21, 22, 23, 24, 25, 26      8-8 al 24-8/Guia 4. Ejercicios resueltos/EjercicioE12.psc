Algoritmo EjercicioE12
	Definir matriz1, matriz2, matrizmulti, aux, aux2 Como Entero
	Dimension matriz1(3, 3), matriz2(3, 3), matrizmulti(3, 3)
	aleat(matriz1, matriz2)
	sum(matriz1, matriz2, matrizmulti)
	
FinAlgoritmo



SubProceso aleat (matriz1 Por Referencia, matriz2 Por Referencia)
	
	Definir aux, aux2 como real
	aux2 = 0
 	para aux <- 0 hasta (2)
		matriz1(aux, aux2) = aleatorio(1, 5)
		matriz2(aux, aux2) = Aleatorio(1, 5)
		si aux = 2 y aux2 <= 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			
		FinSi
	FinPara
	
FinSubProceso



SubProceso sum (matriz1, matriz2, matrizmulti Por Referencia)
	Definir aux, aux2 Como Entero
	aux2 = 0
	Escribir " "
	Escribir "Matriz 1: "
	Escribir " "
	para aux <- 0 hasta 2
		Escribir matriz1(aux, aux2) "    " Sin Saltar
		si aux = 2 y aux2 < 2
			Escribir " "
			si aux2 = 2
				aux = 2
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
	para aux <- 0 hasta 2
		Escribir matriz2(aux, aux2) "    " Sin Saltar
		si aux = 2 y aux2 < 2
			Escribir " "
			si aux2 = 2
				aux = 2
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
	Escribir "Matriz multiplicación: "
	Escribir " "
	
 	para aux <- 0 hasta 2
		matrizmulti(aux, aux2) = (matriz1(aux, aux2)) * matriz2(aux, aux2)
		Escribir matrizmulti(aux, aux2) "    " Sin Saltar
		si aux = 2 y aux2 < 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
		FinSi
	FinPara
	
	
FinSubProceso