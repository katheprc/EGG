Algoritmo EjercicioE3
	
	Definir vector2, aux, n Como Entero
	Definir vector1 Como Caracter
	Escribir "Ingresar tamaño de vectores"
	leer n
	Dimension vector1(n), vector2(n)
	para aux <- 0 Hasta n - 1
		Escribir "Indicar nombre"
		leer vector1(aux)
		vector2(aux) = Longitud(vector1(aux))
	FinPara
	Escribir ""
	Escribir "Longitud           Nombre"
	para aux <- 0 hasta n - 1
		Escribir vector2(aux) "                  " vector1(aux)
	FinPara
FinAlgoritmo
