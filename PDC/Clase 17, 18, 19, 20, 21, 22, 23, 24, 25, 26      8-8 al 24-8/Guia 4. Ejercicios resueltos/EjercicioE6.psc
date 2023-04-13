Algoritmo EjercicioE6
	
	Definir vector1, vector2, n, aux Como entero
	Escribir "Ingresar tamaño de vectores"
	leer n
	Dimension vector1(n), vector2(n)
	para aux <- 0 hasta n - 1
		vector1(aux) = Aleatorio(1, 10)
		vector2(aux) = Aleatorio(1, 10)
		Escribir "La diferencia entre " vector1(aux) " y " vector2(aux) " es: " vector1(aux) - vector2(aux)
	FinPara
	
FinAlgoritmo
