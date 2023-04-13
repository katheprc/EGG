Algoritmo Ejercicio13
	
	Definir mes Como Caracter
	Definir importe, descuento como real
	Escribir "Ingresar mes en mayúsculas"
	leer mes
	Escribir "Ingresar importe sin puntos ni comas"
	leer importe
	descuento = importe - ((10 * importe) / 100)
	Segun mes
		"SEPTIEMBRE" O "SETIEMBRE" O "OCTUBRE" O "NOVIEMBRE": escribir "10% DE DESCUENTO! -> El monto total a cobrar es de: $" descuento
			
		De Otro Modo:
			Escribir "Para este mes no hay descuento, el monto total a cobrar será de: $" importe
	FinSegun
	
FinAlgoritmo
