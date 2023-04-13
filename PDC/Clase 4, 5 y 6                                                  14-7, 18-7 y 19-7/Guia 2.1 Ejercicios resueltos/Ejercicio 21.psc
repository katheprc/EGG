Algoritmo Ejercicio22
	
	Definir kilos, precio Como Real
	Escribir "Indicar cantidad de kilos de manzanas comprados ($100/kg)"
	leer kilos
	precio = 100 * kilos
	si (kilos <= 2) 
		Escribir "El porcentaje de descuento es 0%. El total de su compra es: $" precio
	SiNo
		si (kilos <= 5)
			Escribir "El porcentaje de descuento es del 10%. El total de su compra es: $" (precio - ((10*precio)/100))
		SiNo
			si (kilos <= 10)
				Escribir "El porcentaje de descuento es del 15%. El total de su compra es: $" (precio - ((15*precio)/100))
			SiNo
				Escribir "El porcentaje de descuento es del 20%. El total de su compra es: $" (precio - ((20*precio)/100))
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
