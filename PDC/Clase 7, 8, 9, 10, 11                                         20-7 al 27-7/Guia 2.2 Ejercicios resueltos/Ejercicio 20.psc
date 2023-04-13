Algoritmo Ejercicio20
	
	Definir num, aza Como Entero
	aza = azar(9)
	num = 0
	Escribir "Adivinar el número"
	Hacer
		Escribir "Ingrese un número"
		Leer num
		si (num < aza)
			Escribir "Tu número es más pequeño"
		SiNo
			si (num > aza)
				Escribir "Tu número es más grande"
			SiNo
				si (num = aza)
					Escribir "GANASTE!!"
				FinSi
			FinSi
		FinSi
	Mientras Que num <> aza
	
FinAlgoritmo
