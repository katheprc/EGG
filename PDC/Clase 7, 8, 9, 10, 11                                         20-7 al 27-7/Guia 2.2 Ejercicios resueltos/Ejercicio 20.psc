Algoritmo Ejercicio20
	
	Definir num, aza Como Entero
	aza = azar(9)
	num = 0
	Escribir "Adivinar el n�mero"
	Hacer
		Escribir "Ingrese un n�mero"
		Leer num
		si (num < aza)
			Escribir "Tu n�mero es m�s peque�o"
		SiNo
			si (num > aza)
				Escribir "Tu n�mero es m�s grande"
			SiNo
				si (num = aza)
					Escribir "GANASTE!!"
				FinSi
			FinSi
		FinSi
	Mientras Que num <> aza
	
FinAlgoritmo
