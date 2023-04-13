Algoritmo Ejercicio5
	
	Definir num, Min, Max, suma, contador como entero
	Definir promedio Como Real
	Escribir "Ingrese numeros enteros."
	Leer num
	suma = num
	Min = num
	Max = num
	contador = 0
	hacer
		Escribir "Ingrese otro numero."
		leer num
		suma = suma + num
		contador = contador + 1
		si Max < num y Max <> 0 y num <> 0 Entonces
			Max = num
		FinSi
		si Min > num y Min <> 0 y num <> 0 Entonces
			Min = num
		FinSi
	Mientras Que num <> 0 
	promedio = suma / contador
	Escribir "El numero maximo es ", Max ,". El numero minimo es ", Min ,". El promedio es ", promedio ,"."
	
FinAlgoritmo
