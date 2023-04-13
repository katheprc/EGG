Algoritmo EjercicioE5
	
	Definir vector, frase Como Caracter
	Definir aux, pos, aux2 Como Entero
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
		aux2 = 19
		Escribir ""
		Escribir ""
		Escribir "Como la posición seleccionada está ocupada, se ingresó el caracter y desplazó lo demás a la derecha"
			Hacer
				vector(aux2) = vector(aux2-1)
				aux2 = aux2 - 1
			Mientras Que aux2 <> pos
			vector(aux2) = frase
			Escribir ""
			para aux <- 0 hasta 19
				Escribir vector(aux) Sin Saltar
			FinPara
	FinSi
	
FinAlgoritmo
