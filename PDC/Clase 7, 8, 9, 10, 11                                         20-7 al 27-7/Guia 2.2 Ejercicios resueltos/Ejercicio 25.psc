Algoritmo Ejercicio25
	
	Definir num, fac, aux Como real
	Escribir "Indicar un número entero positivo"
	leer num
	fac = 1
	para aux <- 1 hasta num
		fac = fac * aux
		si (aux = 1)
			Escribir Sin Saltar "!" num " = " aux
		SiNo
			Escribir Sin Saltar "*" aux
		FinSi
	FinPara
		Escribir Sin Saltar " = " fac	
FinAlgoritmo
