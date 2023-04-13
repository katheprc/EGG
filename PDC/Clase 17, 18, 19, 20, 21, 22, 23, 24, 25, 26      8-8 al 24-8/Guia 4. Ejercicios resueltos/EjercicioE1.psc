Algoritmo EjercicioE1
	Definir vector, vector2, aux Como Entero
	Dimension vector(5), vector2(5)
	para aux <- 0 hasta 4
		vector(aux) = Aleatorio(1, 10)
		vector2(aux) = Aleatorio(1, 10)
		si aux = 4
			Escribir "Vector 1: "
			Escribir ""
			para aux <- 0 hasta 4
				Escribir vector(aux) "   " Sin Saltar
			FinPara
			Escribir ""
			Escribir ""
			Escribir ""
			Escribir "Vector 2: "
			Escribir ""
			para aux <- 0 hasta 4
				escribir vector2(aux) "   " Sin Saltar
			FinPara
		Finsi
	FinPara

FinAlgoritmo
