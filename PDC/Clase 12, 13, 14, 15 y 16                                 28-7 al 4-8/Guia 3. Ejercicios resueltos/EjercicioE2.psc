Algoritmo EjercicioE2
	
	Definir num como caracter
	Escribir "Ingresar un número entero de hasta 3 dígitos"
	leer num
	Mientras Longitud(num) > 3
		Escribir "Debe ser de hasta 3 dígitos"
		leer num
	FinMientras
	
	escribir enteroo(num)
	
FinAlgoritmo

Funcion retorno <- enteroo (num Por Valor)
	
	Definir retorno Como Entero
	retorno = convertirANumero(num)
	
FinFuncion
	