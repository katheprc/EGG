Algoritmo Ejercicio5
	
	Definir num, numMin, numMax, suma, contador, promedio como real
	Escribir "Ingrese numeros enteros."
	Leer num
	suma = num
	numMin = num
	numMax = num
	contador = 0
	hacer
		Escribir "Ingrese otro numero."
		leer num
		suma = suma + num
		contador = contador + 1
		si numMax < num y numMax <> 0 y num <> 0 Entonces
			numMax = num
		FinSi
		si numMin > num y numMin <> 0 y num <> 0 Entonces
			numMin = num
		FinSi
	Mientras Que num <> 0 
	promedio = suma / contador
	Escribir "El numero maximo es ", numMax ,". El numero minimo es ", numMin ,". El promedio es ", promedio ,"."
	
FinAlgoritmo
