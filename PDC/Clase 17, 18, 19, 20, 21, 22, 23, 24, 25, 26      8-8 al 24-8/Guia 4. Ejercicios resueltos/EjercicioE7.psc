Algoritmo EjercicioE7
	definir vector, aux, sumaa Como Entero
	sumaa = 0
	Dimension vector(10)
	para aux <- 0 hasta 9
		vector(aux) = Aleatorio(1, 10)
		Escribir vector(aux) "   " Sin Saltar
	FinPara
	aux = 0
	sum(sumaa, aux, vector)
	Escribir ""
	Escribir ""
	Escribir "La suma de los números es: " sumaa
FinAlgoritmo



SubProceso sum (sumaa Por Referencia, aux Por Referencia, vector)
	mientras aux <= 9
	sumaa = sumaa + vector(aux)
	aux = aux + 1
	sum(sumaa, aux, vector)
	FinMientras
FinSubProceso


