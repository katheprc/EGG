Algoritmo Ejercicio6
	
	definir a, b Como Entero
	Escribir "Indicar dos numeros"
	leer a, b
	intercambiar(a, b)
	Escribir "Numero 1: " a ". Número 2: " b
	
FinAlgoritmo

SubProceso intercambiar (a Por Referencia, b por referencia)
	
	Definir aux Como Entero
	aux = a
	a = b
	b = aux
	
FinSubProceso
	