Algoritmo Ejercicio20
	
	Definir cant Como Entero
	Escribir "Indicar cantidad de llantas a comprar"
	leer cant
	si (cant > 10)
		Escribir "El monto a pagar por " cant " llantas es $" 2000*cant
	SiNo
		si (cant > 4 y cant < 11)
			Escribir "El monto a pagar por " cant " llantas es $" 2500*cant
		SiNo
			si (cant > 1)
				escribir "El monto a pagar por " cant " llantas es $" 3000*cant
			SiNo
				escribir "El monto a pagar por " cant " llanta es $" 3000*cant
			FinSi
			
		FinSi
	FinSi
FinAlgoritmo
