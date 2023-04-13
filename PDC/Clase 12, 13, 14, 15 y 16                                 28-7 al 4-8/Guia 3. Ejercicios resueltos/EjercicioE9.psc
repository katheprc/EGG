Algoritmo EjercicioE9
	
	Definir numn, numm, numrest Como Entero
	
	Hacer
	Escribir "Ingrese un número n mayor que 0"
	leer numn
	Mientras Que (numn <= 0)
	Hacer
	Escribir "Ingrese  un número m mayor que n"
	leer numm
	Mientras Que (numm <= numn) 
	numrest = numm - numn
	Escribir "El numero combinatorio de m/n es: " combinatorio(numn, numm, numrest)
	
FinAlgoritmo



funcion retorno <- combinatorio (numn, numm, numrest)
	
	Definir retorno Como Real
	
	retorno = (factorial(numm)) / (factorial(numn) * factorial(numrest))
	
FinFuncion



funcion retorno <- factorial (num)

	Definir retorno, aux Como entero
	
	retorno = 1
	para aux <- 1 hasta num
		retorno = retorno * aux
	FinPara
	
FinFuncion
	