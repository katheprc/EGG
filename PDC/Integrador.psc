Algoritmo Integrador
	Definir matriz, gen como caracter
	Definir long, aux, aux2, aux3 Como Entero
	aux3 = 0
	gen = "BCAADCCBABCCBABB"
	si Longitud(gen) = 9
		long = Longitud(gen)/3
	SiNo
		si Longitud(gen) = 16
			long = Longitud(gen)/4
		SiNo
			si Longitud(gen) = 1369
				long = Longitud(gen)/37
			FinSi
		FinSi
	FinSi
	
	Dimension matriz(long, long)
	
	para aux <- 0 Hasta long-1
		para aux2 <- 0 hasta long-1
			matriz(aux, aux2) = Subcadena(gen, aux3, aux3)
			Escribir matriz(aux, aux2) "   " Sin Saltar
			aux3 = aux3 + 1
		FinPara
		Escribir " "
		Escribir ""
	FinPara
	
FinAlgoritmo

Funcion retorno <- esgenz (matriz, long)
	
	Definir aux, aux2, cont, cont2 Como Entero
	Definir retorno Como Logicos
	para aux <- 1 hasta long-1
		para aux2 <- 1 Hasta long-1
			si (matriz(aux, aux2)) = (matriz(aux-1, aux2-1))
				retorno = Verdadero
			FinSi
		finpara
	FinPara
	
	
FinFuncion
	