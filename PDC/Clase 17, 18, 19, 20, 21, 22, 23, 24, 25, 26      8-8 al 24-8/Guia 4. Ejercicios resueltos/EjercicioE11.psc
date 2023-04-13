Algoritmo EjercicioE11
	
	Definir aux, aux2, matriz Como Entero
	Dimension matriz(5, 15)
	aux2 = 0
	para aux <- 0 hasta 5 - 1
		
		si (aux = 0)
			matriz(aux, aux2) = 1
		SiNo
			si aux = 5 - 1
				matriz(aux, aux2) = 1
			SiNo
				si aux2 = 0
					matriz(aux, aux2) = 1
				SiNo
					si aux2 = 15 - 1
						matriz(aux, aux2) = 1
					SiNo
						matriz(aux, aux2) = 0
					FinSi
				FinSi
			FinSi
			
		FinSi
		si aux = 5 - 1 y aux2 <= 15 - 1
			si aux2 = 15 - 1
				aux = 5 - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
	aux2 = 0
	para aux <- 0 hasta 5 - 1 
		Escribir matriz(aux, aux2) "    " Sin Saltar
		si aux = 5 - 1 y aux2 <= 15 - 1
			si aux2 = 15 - 1
				aux = 5 - 1
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
			Escribir " "
		FinSi
	FinPara
	
	
FinAlgoritmo
