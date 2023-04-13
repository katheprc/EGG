Algoritmo ejercicio4
	
	Definir frase, letra Como Caracter
	Escribir "Ingrese una frase"
	leer frase
	Escribir "Ingrese la letra a buscar"
	leer letra
	Escribir busqueda(frase, letra)
	
FinAlgoritmo

Funcion retorno <- busqueda (frase, letra)
	
	Definir retorno, aux Como Entero
	retorno = 0
	para aux <- 0 hasta Longitud(frase)
		si letra = Subcadena(frase, aux, aux)
			retorno = retorno + 1
		FinSi
	FinPara
	
FinFuncion





	