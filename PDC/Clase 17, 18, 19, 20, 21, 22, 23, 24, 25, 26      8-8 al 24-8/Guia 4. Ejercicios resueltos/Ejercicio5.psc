Algoritmo Ejercicio5
	Definir vector, num, aux Como Entero
	Escribir "Ingresar tama�o del vector"
	leer num
	Dimension vector(num)
	Escribir "Ingresar un numero"
	leer vector(0)
	para aux <- 1 hasta num - 1
		Escribir "Ingrese otro n�mero"
		leer vector(aux)
	FinPara
	
	Escribir "El numero mayor del vector es: " mayor(vector, num)
FinAlgoritmo


Funcion retorno <- mayor (vector Por Referencia, num)
	Definir retorno, aux Como Entero
	retorno = vector(0)
	para aux <- 0 hasta num - 1
		si retorno < vector(aux)
			retorno = vector(aux)
		FinSi
		
	FinPara
	
FinFuncion
	