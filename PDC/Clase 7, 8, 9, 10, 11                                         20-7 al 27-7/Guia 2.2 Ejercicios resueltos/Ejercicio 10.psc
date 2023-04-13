Algoritmo Ejercicio10
	
	Definir cant, sueldo, ventas, monto, suma, aux, aux2, comision Como Real
	Escribir "Indicar cantidad de vendedores"
	leer cant
	Para aux <- 1 Hasta cant
		suma = 0
		comision = 0
		Escribir " "
		Escribir "Vendedor " aux
		Escribir "Indicar sueldo base del vendedor"
		leer sueldo
		Escribir "Indicar cantidad de ventas realizadas"
		leer ventas
		Escribir "Indicar monto de cada venta"
		Para aux2 <- 1 Hasta ventas
			Escribir "Venta " aux2
			leer monto
			suma = suma + monto
		FinPara
		Escribir " "
		comision = suma*0.10
		Escribir "Pago por concepto de comisiones al vendedor " aux ": $" , comision
		Escribir "Pago total de sueldo + comisiones al vendedor " aux ": $" , sueldo + comision 
	FinPara
	
FinAlgoritmo
