Algoritmo EjercicioE15
	
	Definir matriz, n, m, matriz2 Como Entero
	m = 5
	n = 6
	Dimension matriz(n, m), matriz2(2, 5)
	rellenar(n, m, matriz, matriz2)
	Escribir ""
	Escribir "" 
	Escribir "              Lunes  Martes  Miercoles  Jueves  Viernes    Total"
	mostrarr(n, m, matriz, matriz2)
FinAlgoritmo



SubProceso rellenar (n, m, matriz Por Referencia, matriz2 Por Referencia)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	Para aux <- 0 Hasta 4
		matriz(5, aux) = 0
		matriz(5, aux) = 0
		matriz2(0, aux) = 0
		matriz2(1, aux) = 0
	FinPara
	para aux <- 0 hasta n - 2

		segun aux2
			0: escribir "Producto " aux+1 " Día Lunes"
			1: escribir "Producto " aux+1 " Día Martes"
			2: escribir "Producto " aux+1 " Día Miercoles"
			3: escribir "Producto " aux+1 " Día Jueves"
			4: escribir "Producto " aux+1 " Día Viernes"
		FinSegun
		leer matriz(aux, aux2) 
		matriz(5, aux) = matriz(5, aux) + matriz(aux, aux2)
		si aux = n - 2 y aux2 <= m - 1
			si aux2 = m - 1
				aux = n - 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	aux2 = 0
	Para aux <- 0 Hasta 4
		matriz2(0, aux) = matriz2(0, aux) + matriz(aux2, aux)
		
		si matriz(aux2, aux) > matriz2(1, aux)
			matriz2(1, aux) = matriz(aux2, aux)
		FinSi
		
		si aux = 1 y aux2 <= 4
			si aux2 = 4 
				aux = 1
				
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso mostrarr (n, m, matriz, matriz2)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 2 
		
		si aux = 0 y aux2 < m
			Escribir "Producto " aux2+1 "     " Sin Saltar
		FinSi
		si aux2 <> 5
			Escribir matriz(aux2, aux) "       " Sin Saltar
		FinSi
		si aux = n - 2 y aux2 <= m 
			si aux2 = m 
				aux = n - 2
				
			SiNo
				aux2 = aux2 + 1
				Escribir matriz(5, aux) "       " Sin Saltar
				aux = - 1
			FinSi
			
			Escribir " "
		FinSi
	FinPara
	
	aux2 = 0
	escribir "Total / día    " sin saltar
	para aux <- 0 hasta 1
		
		si aux = 1 y aux2 <= 4
			si aux2 = 4 
				aux = 1
				
			SiNo
				aux2 = aux2 + 1
				Escribir matriz2(aux, aux2) "       " Sin Saltar
				aux = - 1
			FinSi
			
			Escribir " "
		FinSi
	FinPara
	
FinSubProceso




