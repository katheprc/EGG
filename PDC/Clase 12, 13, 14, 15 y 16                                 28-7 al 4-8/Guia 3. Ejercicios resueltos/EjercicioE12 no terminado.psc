Algoritmo EjercicioE12
	Definir num Como Entero
	leer num
	escalera(num)
	
FinAlgoritmo



SubProceso escalera (num)
	
	Definir aux, aux2, numm Como Entero
	numm = 1
	Para aux <- 1 hasta num
		para aux2 <- 1 hasta num
			si (aux = num)
				Escribir "" 
			SiNo
				Escribir Sin Saltar aux2 " "
			FinSi
		FinPara
		Escribir ""
		numm = numm + 1
		
	FinPara
	
FinSubProceso
	