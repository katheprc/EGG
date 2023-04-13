Algoritmo Ejercicio25
	
	Definir aux, fac, aux2 Como Real
	aux = 0
	
	Mientras (aux <= 5)
		fac = 1
		aux = aux + 1
		Segun aux
			
			1: para aux2 <- 1 hasta aux
				fac = fac * aux2
				si (aux2 = 1)
					Escribir Sin Saltar "!" aux " = " aux2
				SiNo
					Escribir Sin Saltar "*" aux2
				FinSi
			FinPara
			Escribir Sin Saltar " = " fac	
			Escribir " "
			
			2:para aux2 <- 1 hasta aux
				fac = fac * aux2
				si (aux2 = 1)
					Escribir Sin Saltar "!" aux " = " aux2
				SiNo
					Escribir Sin Saltar "*" aux2
				FinSi
			FinPara
			Escribir Sin Saltar " = " fac	
			Escribir " "
			
			3:para aux2 <- 1 hasta aux
				fac = fac * aux2
				si (aux2 = 1)
					Escribir Sin Saltar "!" aux " = " aux2
				SiNo
					Escribir Sin Saltar "*" aux2
				FinSi
			FinPara
			Escribir Sin Saltar " = " fac	
			Escribir " "
			
			4:para aux2 <- 1 hasta aux
				fac = fac * aux2
				si (aux2 = 1)
					Escribir Sin Saltar "!" aux " = " aux2
				SiNo
					Escribir Sin Saltar "*" aux2
				FinSi
			FinPara
			Escribir Sin Saltar " = " fac	
			Escribir " "
			
			5:para aux2 <- 1 hasta aux
				fac = fac * aux2
				si (aux2 = 1)
					Escribir Sin Saltar "!" aux " = " aux2
				SiNo
					Escribir Sin Saltar "*" aux2
				FinSi
			FinPara
			Escribir Sin Saltar " = " fac	
			Escribir " "
			
		FinSegun
		
	FinMientras
	
FinAlgoritmo
