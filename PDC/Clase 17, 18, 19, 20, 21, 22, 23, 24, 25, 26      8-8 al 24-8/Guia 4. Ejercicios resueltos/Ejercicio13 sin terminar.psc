Algoritmo Ejercicio13
	Definir matriz, aux, aux2, auxsumas, vectorsumas, vectorsumas2, sumacol, sumafila, sumadiag, sumadiaginv Como Entero
	Dimension matriz(3, 3), vectorsumas(3), vectorsumas2(3)
	aux2 = 0
	sumacol = 0
	sumafila = 0
	sumadiag = 0
	sumadiaginv = 0
	auxsumas = 0
	para aux <- 0 Hasta 2
		vectorsumas(aux) = 0
		vectorsumas2(aux) = 0
		Hacer
		Escribir "Indicar los números a colocar en la matriz mágica. Deben ser menores que 9" 
		leer matriz(aux, aux2)
		Mientras Que matriz(aux, aux2) > 9
		sumacol = sumacol + matriz(aux, aux2)
		si aux = 2
			vectorsumas(auxsumas) = sumacol
			sumacol = 0
			auxsumas = auxsumas + 1
		FinSi
		
		si aux = 2 y aux2 < 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
				
			FinSi
		FinSi

	FinPara
	Escribir " "
	aux2 = 0
	para aux <- 0 Hasta 2
		Escribir matriz(aux, aux2) "  " Sin Saltar
		si aux = 2 y aux2 < 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
				Escribir " "
			FinSi
		FinSi
	FinPara
	
	Escribir " "
	Escribir " "
	
	para aux <- 0 Hasta 2
		Escribir vectorsumas(aux) "  " Sin Saltar
		si aux = 2 
			Escribir " "
		FinSi
	FinPara
FinAlgoritmo
