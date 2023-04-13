Algoritmo Ejercicio4
	
	Definir opc, a, b, c, aux, long como entero
	Definir opc2 Como Caracter
	Definir vectorA, vectorB, vectorC como real
	
	Escribir "1. Llenar vector A"
	Escribir "2. Llenar vector B"
	Escribir "3. Llenar vector C con la suma de los vectores A y B"
	Escribir "4. Llenar vector C con la resta de los vectores B y A"
	Escribir "5. Mostrar vector elegido"
	Escribir "6. Salir"
	Escribir " "
	Escribir "Ingrese la longitud deseada de los vectores"
	leer long
	Dimension vectorA(long), vectorB(long), vectorC(long)

	
	Hacer
		Escribir "Elija una opcion"
		escribir " "
		leer opc
		Segun opc
			1: 	para aux <- 0 Hasta long -1
					vectorA(aux) = Aleatorio(-100, 100)
				FinPara
			2:	para aux <- 0 Hasta long -1
					vectorB(aux) = Aleatorio(-100, 100)
				FinPara
			3:	para aux <- 0 Hasta long -1
					vectorC(aux) = vectorA(aux) + vectorB(aux)
				FinPara
			4:	para aux <- 0 Hasta long -1
					vectorC(aux) = vectorB(aux) - vectorA(aux)
				FinPara
			5:	escribir "Ingrese la letra del vector a mostrar (A, B, C)"
				Hacer
					leer opc2
				Mientras Que (opc2 <> "A") y (opc2 <> "B") y (opc2 <> "C")
				Segun opc2
					"A":para aux <- 0 hasta long-1
							Escribir vectorA(aux) ", " sin saltar
						FinPara
						
					"B":para aux <- 0 hasta long-1
							Escribir vectorB(aux) ", " sin saltar
						FinPara
					"C": para aux <- 0 hasta long-1
							Escribir vectorC(aux) ", " sin saltar
						FinPara
					
				FinSegun
		FinSegun
	mientras que opc < 6
FinAlgoritmo
