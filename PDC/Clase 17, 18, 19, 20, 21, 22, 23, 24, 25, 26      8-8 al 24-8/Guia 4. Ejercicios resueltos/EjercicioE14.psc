Algoritmo EjercicioE14
	
	Definir matriz, vector, aux, aux2, matrizmulti Como Entero
	Dimension matriz(3, 3), vector(3), matrizmulti(3, 3)
	Escribir ""
	Escribir "Matriz"
	aux2 = 0
	para aux <- 0 hasta 2
		matriz(aux, aux2) = Aleatorio(1, 9)
		si aux2 = 0
			vector(aux) = Aleatorio(1, 9)
		FinSi
		si aux = 2 y aux2 <= 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
	FinPara
	aux2 = 0
	para aux <- 0 hasta 2
		Escribir matriz(aux, aux2) "  " Sin Saltar
		si aux = 2 y aux2 <= 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
				Escribir " "
			FinSi
		FinSi
	FinPara
	
	Escribir ""
	Escribir ""
	Escribir "Vector:"
	para aux <- 0 hasta 2
		escribir vector(aux) "   " Sin Saltar
	FinPara
	aux2 = 0
	escribir ""
	Escribir ""
	Escribir "Resultados:"
	para aux <- 0 hasta 2
		matrizmulti(aux, aux2) = matriz(aux, aux2) * vector(aux2)
		Escribir matrizmulti(aux, aux2) "  " Sin Saltar
		si aux = 2 y aux2 <= 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
				Escribir " "
			FinSi
		FinSi
	FinPara
FinAlgoritmo
