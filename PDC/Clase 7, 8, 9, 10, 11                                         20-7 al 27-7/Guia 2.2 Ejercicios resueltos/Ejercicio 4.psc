Algoritmo Ejercicio4
	
	Definir clave Como Caracter
	Definir aux Como Entero
	Escribir "Ingresar la clave en minúsculas. 3 intentos"
	aux = 0
	Hacer
		leer clave
		si (clave = "eureka")
			Escribir "Has ingresado al sistema correctamente"
			aux = 4
		SiNo
			aux = aux + 1
			si (aux = 3)
				Escribir "Se acabaron los intentos"
			FinSi
		FinSi
	Mientras Que (aux < 3) 
	
FinAlgoritmo
