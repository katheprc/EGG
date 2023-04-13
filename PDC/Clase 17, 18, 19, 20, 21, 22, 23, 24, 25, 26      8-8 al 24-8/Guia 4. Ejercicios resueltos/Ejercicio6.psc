Algoritmo Ejercicio6
	
	Definir vector, frase Como Caracter
	Definir aux, pos Como Entero
	Dimension vector(20)
	hacer
		Escribir "Ingrese una frase de hasta 20 caracteres"
		leer frase
	Mientras Que Longitud(frase) >= 20
	
	para aux <- 0 hasta 19
		vector(aux) = Subcadena(frase, aux, aux)
	FinPara
	Escribir "Ingresar un caracter a ingresar en el vector"
	leer frase
	Escribir "Ingresar una posicion para ingresar el caracter"
	leer pos
	si vector(pos) = " "
		vector(pos) = frase
		Escribir "Su frase con el caracter agregado es: "
		para aux <- 0 hasta 19
			Escribir vector(aux) Sin Saltar
		FinPara
	SiNo
		Escribir "La posición está ocupada"
	FinSi

FinAlgoritmo
