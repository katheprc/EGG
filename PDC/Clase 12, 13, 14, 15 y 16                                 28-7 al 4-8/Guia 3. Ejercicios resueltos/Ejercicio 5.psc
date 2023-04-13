Algoritmo ejercicio5
	
	Definir num Como Entero
	Escribir "Ingresar un numero"
	leer num
	si primo(num) > 2
		Escribir "No es primo"
	SiNo
		Escribir "Es primo"
	FinSi
	
FinAlgoritmo

Funcion retorno <- primo (num)
	
	Definir retorno, aux Como entero
	retorno = 0
	para aux <- 1 hasta num
		si (num mod aux = 0)
			retorno = retorno + 1
		FinSi
	FinPara
	
FinFuncion



	