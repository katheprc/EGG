Algoritmo EjercicioE4
	
	Definir nombre, dia, turno, festivo Como Caracter
	Definir cant, aux Como Entero
	Escribir "Indicar cantidad de trabajadores"
	leer cant
	Escribir " "
	para aux <- 1 hasta cant
		Escribir " "
		Escribir  "Indicar nombre del trabajador"
		leer nombre
		
		hacer
			Escribir " "
			Escribir "Indicar turno laboral (D/N)"
			leer turno
		Mientras Que (turno <> "d") y (turno <> "D") y (turno <> "n") y (turno <> "N")   
		
		hacer
		Escribir " "
		Escribir "Indicar día de la semana (LUN/MAR/MIE/JUE/VIE/SAB/DOM)"
		leer dia
		Mientras Que (dia <> "LUN") y (dia <> "lun") y (dia <> "mar") y (dia <> "MAR") y (dia <> "mie") y (dia <> "MIE") y (dia <> "jue") y (dia <> "JUE") y (dia <> "vie") y (dia <> "VIE")
		
		Hacer
		Escribir " "
		Escribir "¿Fue festivo? (S/N)"
		leer festivo
		Mientras Que (festivo <> "s") y (festivo <> "S") y (festivo <> "n") y (festivo <> "N")
		
		Escribir " "
		Escribir "********************************"
		Escribir "Jornal de hoy de " nombre ": $" jornal(nombre, dia, turno, festivo)
		Escribir "********************************"
		Escribir " "
	FinPara
	
FinAlgoritmo



Funcion retorno <- jornal (nombre, dia, turno, festivo)
	
	Definir retorno Como Real
	retorno = 0
	
	si (festivo = "s") o (festivo = "S")
		Segun turno
			"D" o "d": retorno = 90 + (90 * 0.10)
			"N" o "n": retorno = 125 + (125 * 0.15)
		FinSegun
	SiNo
		Segun turno
			"D" o "d": retorno = 90
			"N" o "n": retorno = 125
		FinSegun
	FinSi

FinFuncion
	