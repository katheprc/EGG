Algoritmo Ejercicio12
	
	Definir min, max, num, aux Como Real
	Escribir "Ingresar un n�mero entero m�nimo"
	leer min
	Escribir "Ingresar un n�mero entero m�ximo"
	leer max
	Escribir "Ingresar n�meros enteros situados entre ambos numeros ingresados"
	Leer num
	aux = 0
	mientras num >= min y num <= max
		Escribir "Ingrese otro n�mero"
		leer num
		aux = aux + 1
	FinMientras
	
	Escribir "La cantidad de n�meros v�lidos ingresados fue: " , aux
	
FinAlgoritmo
