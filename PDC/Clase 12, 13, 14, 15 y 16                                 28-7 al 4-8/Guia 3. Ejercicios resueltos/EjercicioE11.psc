Algoritmo EjercicioE11
	definir text Como Caracter
	Escribir "Indicar una letra para saber si está entre M y T"
	leer text
	entremyt(text)
	
	
	
FinAlgoritmo



SubProceso entremyt (text)
	
	si ((text > "m") y (text < "t")) o ((text > "M") y (text < "T"))
		
		Escribir "La letra está entre M y T"
	SiNo
		Escribir "La letra no está entre M y T"
		
	FinSi
	
FinSubProceso
	