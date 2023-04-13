Algoritmo EjercicioE15
	
	Definir matriz, n, m, totalprod, totaldia, prodmv Como Entero
	m = 5
	n = 6
	Dimension matriz(n, m)
	rellenar(n, m, matriz)
	Escribir ""
	Escribir "" 
	Escribir "              Lunes  Martes  Miercoles  Jueves  Viernes    Total"
	mostrarr(n, m, matriz, totalprod)
FinAlgoritmo



SubProceso rellenar (n, m, matriz Por Referencia)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 2
		
		segun aux2
			0: escribir "Producto " aux+1 " Día Lunes"
			1: escribir "Producto " aux+1 " Día Martes"
			2: escribir "Producto " aux+1 " Día Miercoles"
			3: escribir "Producto " aux+1 " Día Jueves"
			4: escribir "Producto " aux+1 " Día Viernes"
		FinSegun
		leer matriz(aux, aux2) 
		
		si aux = n - 2 y aux2 <= m - 1
			si aux2 = m - 1
				aux = n - 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso mostrarr (n, m, matriz, totalprod Por Referencia)
	
	Definir aux, aux2 Como Entero
	aux2 = 0
	para aux <- 0 hasta n - 2 
		
		si aux = 0
			Escribir "Producto " aux2+1 "     " Sin Saltar
		FinSi
		Escribir matriz(aux2, aux) "       " Sin Saltar
		si aux = n - 2 y aux2 <= m - 1
			si aux2 = m - 1
				aux = n - 2
			SiNo
				aux2 = aux2 + 1
				aux = - 1
			FinSi
			Escribir " "
			Escribir " "
		FinSi
	FinPara
	
FinSubProceso




