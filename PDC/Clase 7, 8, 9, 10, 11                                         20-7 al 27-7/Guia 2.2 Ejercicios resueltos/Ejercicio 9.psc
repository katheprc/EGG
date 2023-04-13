Algoritmo Ejercicio9
	
	Definir lado, aux, aux2 Como Entero
	Escribir "Indicar el tamaño del lado"
	leer lado
	
	para aux <- 1 Hasta lado
		para aux2 <- 1 Hasta lado 
			si ((aux > 1) y (aux < lado) y (aux2 > 1) y (aux2 < lado))
				Escribir "  " Sin Saltar 
			SiNo
				Escribir "* " Sin Saltar 
			FinSi
		FinPara
		Escribir " "
	FinPara

FinAlgoritmo
