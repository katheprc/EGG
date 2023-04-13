Algoritmo Ejercicio24
	
	Definir mods, venta, hora, cant Como Real
	Escribir "Indicar modalidad de salario"
	Escribir " "
	Escribir "1 - COMISIÓN"
	Escribir "2 - SALARIO FIJO + COMISIÓN"
	Escribir "3 - SALARIO FIJO"
	Escribir " "
	Leer mods
	segun mods
		1:  Escribir "Indicar monto total de las ventas realizadas en la semana"
			leer venta
			escribir "El salario del empleado en modalidad COMISIÓN es: " (40*venta/100)
		2: Escribir "Indicar monto total de las ventas realizadas en la semana"
			leer venta
			escribir "Indicar el valor de la hora y la cantidad de horas trabajadas en la semana"
			leer hora, cant
			si (cant <= 40)
				Escribir "El salario del empleado en modalidad SALARIO FIJO + COMISIÓN es: " ((hora*cant) + (25*venta/100))
			SiNo
				Escribir "El salario del empleado en modalidad SALARIO FIJO + COMISIÓN es: " ((hora*40) + (25*venta/100))
			FinSi
		3: escribir "Indicar el valor de la hora y la cantidad de horas trabajadas en la semana"
			leer hora, cant
				Escribir  "El salario del empleado en modalidad SALARIO FIJO es: " (hora*40) + (((hora)+(hora/2))*(cant-40))
	FinSegun
	
	
FinAlgoritmo
