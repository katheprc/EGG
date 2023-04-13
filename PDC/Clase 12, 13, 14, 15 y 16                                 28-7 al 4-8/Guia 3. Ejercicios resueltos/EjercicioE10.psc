Algoritmo EjercicioE10
	Definir text Como Caracter
	Escribir "Ingrese una frase o palabra"
	leer text
	convertirespaciado(text)
FinAlgoritmo



SubProceso convertirespaciado(text)
	Definir aux Como Entero
	para aux <- 0 hasta Longitud(text)
		escribir Subcadena(text, aux, aux) " " sin saltar
	FinPara
	
FinSubProceso
	