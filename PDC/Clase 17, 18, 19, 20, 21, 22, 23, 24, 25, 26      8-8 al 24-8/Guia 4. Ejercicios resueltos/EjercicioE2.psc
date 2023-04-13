Algoritmo EjercicioE2
	
	Definir n, vector, sum, aux Como Entero
	Escribir "Indicar cantidad de números a ingresar"
	leer n
	Dimension vector(n)
	sum = 0
	para aux <- 0 Hasta n - 1
		leer vector(aux)
		sum = sum + vector(aux)
	FinPara
	Escribir "El promedio de los números ingresados es: " sum/n
	
FinAlgoritmo
