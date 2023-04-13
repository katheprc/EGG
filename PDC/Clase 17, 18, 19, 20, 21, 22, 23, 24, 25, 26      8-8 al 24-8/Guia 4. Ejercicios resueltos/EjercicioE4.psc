Algoritmo EjercicioE4
	
	Definir vector, aux, def, reg Como Entero
	Dimension vector(100)
	para aux <- 0 Hasta 99
		vector(aux) = Aleatorio(0, 20)
		si vector(aux) <= 5
			Escribir "Estudiante " aux + 1 "        Nota: " vector(aux) "       Deficiente"
		SiNo
			si vector(aux) <= 10
				Escribir "Estudiante " aux + 1 "        Nota: " vector(aux) "       Regular"
			SiNo
				si vector(aux) <= 15
					Escribir "Estudiante " aux + 1 "        Nota: " vector(aux) "       Bueno"
				SiNo
					Escribir "Estudiante " aux + 1 "        Nota: " vector(aux) "       Excelente"
				FinSi
			FinSi
		FinSi
	FinPara
	
FinAlgoritmo
