Algoritmo Ejercicio24
	
	Definir num, aux Como entero
	Escribir "Indicar altura"
	leer num
	
	Mientras (num <> -1)
		para aux <- 0 hasta num
			si (aux = num)
				Escribir "" 
			SiNo
				Escribir Sin Saltar "*"
			FinSi
		FinPara
		num = num -1
	FinMientras
 
FinAlgoritmo
