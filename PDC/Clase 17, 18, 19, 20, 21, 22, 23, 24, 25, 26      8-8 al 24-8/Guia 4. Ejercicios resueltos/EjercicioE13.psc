Algoritmo EjercicioE13
	
	Definir cant, aux, aux2, matriz Como Entero
	Escribir "Indicar cantidad de filas deseadas"
	leer cant
	Dimension matriz(3, cant)
	aux2 = 0
	cant = cant - 1
 	para aux <- 0 hasta 2
		si aux < 2
			Escribir "Ingrese un número. Fila: " aux2+1 ". Columna: " aux+1
			leer matriz(aux, aux2) 
		SiNo
			matriz(aux, aux2) = matriz(aux-1, aux2) + matriz(aux-2, aux2)
		FinSi
		si aux = 2 y aux2 <= cant
			si aux2 = cant
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			
		FinSi
	FinPara
	aux2 = 0
	para aux <- 0 hasta 2
		si aux = 0
			Escribir matriz(aux, aux2) "  +  " Sin Saltar
		SiNo
			si aux = 1
				Escribir matriz(aux, aux2) Sin Saltar
			FinSi
			si aux = 2
				Escribir "  =  " matriz(aux, aux2) Sin Saltar
			FinSi
			
		FinSi
		si aux = 2 y aux2 < cant
			Escribir " "
			si aux2 = cant
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
	FinPara
	
FinAlgoritmo
