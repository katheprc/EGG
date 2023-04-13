Algoritmo Ejercicio2
	
	Definir num Como Entero
	Definir vof Como Logico
	Escribir "Ingresar un número"
	leer num
	vof = parimpar(num)
	si (vof = Verdadero)
		Escribir "Su número es par"
	SiNo
		Escribir "Su Número es impar"
	FinSi
	
FinAlgoritmo

Funcion retorno <- parimpar (num)
	Definir retorno Como Logico
	si (num mod 2 = 0)
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
FinFuncion
