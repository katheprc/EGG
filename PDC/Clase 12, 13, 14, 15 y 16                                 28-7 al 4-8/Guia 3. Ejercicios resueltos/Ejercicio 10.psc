//Escribir una función recursiva que devuelva la suma de los primeros N enteros
Algoritmo Ejercicio10
	
	Definir num, suma, aux Como Entero
	suma = 0
	aux = 1
	Escribir "Indicar un número"
	leer num
	sumaa(num, aux, suma)
	Escribir "El total de la suma de los primeros " num " enteros es: " suma
	
FinAlgoritmo



SubProceso sumaa (num, aux, suma por referencia)
	
		suma = suma + aux	
		aux = aux + 1
		si (aux <= num)
			sumaa(num, aux, suma)
		FinSi
FinSubProceso

