Algoritmo Ejercicio9
	
	Definir secuencia, sub Como Caracter
	Definir long, aux Como Entero
	Escribir "Indique una secuencia de caracteres"
	leer secuencia
	long = Longitud(secuencia)
	para aux <- 0 Hasta long
		sub = Subcadena(secuencia, aux, aux)
		si (sub = "a") o (sub = "A") o (sub = "e") o (sub = "E") o (sub = "i") o (sub = "I") o (sub = "o") o (sub = "O") o (sub = "u") o (sub = "U") 
			reemplazo(sub)
		SiNo
			Escribir sub Sin Saltar
		FinSi
	FinPara
FinAlgoritmo



SubProceso reemplazo (sub)
		Segun sub
			"a" o "A": escribir "@" Sin Saltar
			"e" o "E": escribir "#" Sin Saltar
			"i" o "I": escribir "$" Sin Saltar
			"o" o "O": escribir "%" Sin Saltar
			"u" o "U": escribir "*" Sin Saltar
		FinSegun
FinSubProceso