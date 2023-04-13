Algoritmo Ejercicio12
	Definir palabra, matriz Como Caracter
	Dimension matriz(3, 3)
	Hacer
		Escribir "Indica una palabra de 9 letras"
		leer palabra
	Mientras Que Longitud(palabra) < 9
	rellenar(palabra, matriz)
	mostrarr(matriz)
FinAlgoritmo



SubProceso rellenar (palabra, matriz Por Referencia)
	
	Definir aux, aux2, auxlong Como Entero
	aux2 = 0
	auxlong = 0
	para aux <- 0 hasta 2
		
		matriz(aux, aux2) = Subcadena(palabra, auxlong, auxlong)
		si auxlong < Longitud(palabra)
			auxlong = auxlong + 1
		FinSi
		
		si aux = 2 y aux2 < 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso mostrarr (matriz)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta 2 
		Escribir matriz(aux, aux2) "    " Sin Saltar
		si aux = 2 y aux2 <= 2
			si aux2 = 2
				aux = 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
			Escribir " "
		FinSi
	FinPara
	
FinSubProceso