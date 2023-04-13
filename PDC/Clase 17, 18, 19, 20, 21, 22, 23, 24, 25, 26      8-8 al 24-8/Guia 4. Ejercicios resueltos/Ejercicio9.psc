Algoritmo Ejercicio9
	
	Definir num, matriz como entero
	Dimension matriz(5, 5)
	Escribir "Indicar un número del 1 al 10 para encontrar su coordenada en la matriz"
	leer num
	random(num, matriz)
	
FinAlgoritmo



SubProceso random (num, matriz por referencia)
	
	Definir aux, aux2 como real
	aux2 = 0
 	para aux <- 0 hasta 4
		matriz(aux2, aux) = aleatorio(1, 10)
		Si matriz(aux2, aux) = num
			escribir "El número " num " está en: columna " aux + 1  ", fila " aux2 + 1
		FinSi
		si aux = 4 y aux2 < 4
			aux2 = aux2 + 1
			aux = - 1
		FinSi
	FinPara
	
	aux2 = 0
	Escribir "" 
	Escribir "" 
	Escribir "" 
	Escribir "Matriz: "
	para aux <- 0 hasta 4
		Escribir matriz(aux2, aux) "    " Sin Saltar
		si aux = 4 y aux2 < 4
			Escribir " "
			aux2 = aux2 + 1
			aux = - 1
		FinSi
	FinPara
	
FinSubProceso