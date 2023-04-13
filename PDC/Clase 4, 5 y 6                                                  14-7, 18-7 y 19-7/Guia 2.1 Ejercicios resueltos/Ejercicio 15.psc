Algoritmo Ejercicio16
	
	definir hora, nafta, nafta2, hora2 Como Real
	Escribir "Ingresar cantidad de horas de uso"
	leer hora
	si hora <= 2
		Escribir "El total a pagar es de $400 con nafta de regalo!"
	SiNo
		escribir "Ingresar litros de nafta gastados"
		leer nafta
		nafta2 = 40 * nafta
		hora2 = 5.20 * 60 * hora
		Escribir "El total a pagar por " hora " horas de uso y " nafta " litros de nafta gastados es de: $" nafta2 + hora2
	FinSi
	
FinAlgoritmo
