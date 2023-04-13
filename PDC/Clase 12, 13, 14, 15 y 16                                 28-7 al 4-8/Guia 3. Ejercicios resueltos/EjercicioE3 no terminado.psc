Algoritmo EjercicioE3
	
	Definir usuario, contra Como Caracter
	Definir aux1, aux2 como entero
	
	Mientras (login(usuario, contra, aux1, aux2) = Falso) y (aux1 <> 3)
		
		Escribir "Ingrese usuario"
		leer usuario
		
		Mientras (login(usuario, contra, aux1, aux2) = Falso) y (aux2 <> 3)
			
			Escribir "Ingrese contraseña"
			leer contra
			
		FinMientras
		
	FinMientras
	
	
	
	
FinAlgoritmo



Funcion retorno <- login (usuario, contra, aux1 Por Referencia, aux2 Por Referencia)
	
	Definir retorno Como Logico
	para aux1 <- 3 hasta 1
		si usuario = "usuario1"
			aux1 = 1
			para aux2 <- 3 hasta 1
				si usuario = "asdasd"
					aux2 = 1
					retorno = verdadero
				SiNo
					Escribir "Le quedan " aux2 " intentos."
				FinSi
			FinPara
		SiNo
			Escribir "Le quedan " aux1 " intentos."
		FinSi
	FinPara
	
FinFuncion
	