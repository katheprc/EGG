Algoritmo Ejercicio9
	
	Definir op1 Como Caracter
	definir op2, op3 Como Real
	
	Escribir "CALCULADORA"
	Escribir " "
	escribir "Escribir la letra de opción que necesites"
	escribir "S - SUMA"
	Escribir "R - RESTA"
	Escribir "M - MULTIPLICACIÓN"
	Escribir "D - DIVISIÓN"
	
	leer op1
	
	Escribir " "
	Escribir "Ingresa tus números"
	
	leer op2, op3
	
	segun op1
		"S" O "s": escribir "La suma entre " op2 " y " op3 " da: " op2 + op3
			
		"R" O "r": escribir "La resta entre " op2 " y " op3 " da: " op2 - op3
			
		"M" O "m": escribir "La multiplicación entre " op2 " y " op3 " da: " op2 * op3
			
		"D" O "d": si (op3 <> 0)
				escribir "La división entre " op2 " y " op3 " da: " op2 / op3
			SiNo
				Escribir "No puede realizarse una división por 0"
			FinSi
			
		De Otro Modo: 
			escribir "Opción no válida"
	finSegun
	
	
	
	
	
FinAlgoritmo