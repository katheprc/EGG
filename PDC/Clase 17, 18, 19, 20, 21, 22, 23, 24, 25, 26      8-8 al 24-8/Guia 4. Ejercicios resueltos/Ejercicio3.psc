Algoritmo Ejercicio3
	
	Definir num, vector, num2 como real
	Definir aux, cont Como Entero
	cont = 0
	Escribir "Ingrese la cantidad de numeros que va a ingresar"
	leer num
	Dimension vector(num)
	Escribir "Ingrese un numero"
	leer vector(0)
	para aux <- 1 hasta num - 1
		Escribir "Ingrese otro número"
		leer vector(aux)
	FinPara
	Escribir "Indique el numero a buscar dentro del vector"
	leer num2
	para aux <- 0 Hasta num - 1
		si vector(aux) = num2
			Escribir "El numero " num2 " está en la posición " aux " del vector"
		sino
			cont = cont + 1
		FinSi
	FinPara
	si cont = num
		Escribir "El numero no está"
	FinSi
FinAlgoritmo
