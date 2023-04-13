Algoritmo Ejercicio14
	
	Definir alumno Como Caracter
	Definir nota1, nota2, nota3, final Como Real
	
	alumno = "a"
	
	mientras alumno <> ""
		
		Escribir "Indicar nombre del alumno"
		leer alumno
		
		si alumno <> ""
			Escribir "Indicar nota de práctica"
			leer nota1
			Escribir "Indicar nota de problemas"
			leer nota2
			Escribir "Indicar nota de teórico"
			leer nota3			
			final = (nota1 * 0.10) + (nota2 * 0.50) + (nota3 * 0.40)
			si ((nota1 >= 0) y (nota1 <= 10) y (nota2 >= 0) y (nota2 <= 10) y (nota3 >= 0) y (nota3 <= 10))
				Escribir "La nota final del alumno " alumno " es: " final
			SiNo
				Escribir "Notas no válidas"
			FinSi
		FinSi
		
	FinMientras
	
FinAlgoritmo
