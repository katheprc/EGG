Algoritmo Ejercicio23
	
	Definir nota1, nota2, nota3, nota4 como real
	
	Escribir "Insertar las cuatro notas del alumno"
	
	leer nota1, nota2, nota3, nota4
	
	si ((nota1 > nota4) y (nota2 > nota4) y (nota3 > nota4))
		Escribir "Las notas más altas son: " nota1 ", " nota2 " y " nota3 ". La nota eliminada es " nota4
		Escribir "El promedio de notas es: " ,(nota1 + nota2 + nota3) / 3
	SiNo
		si ((nota1 > nota3) y (nota2 > nota3) y (nota4 > nota3))
			Escribir "Las notas más altas son: " nota1 ", " nota2 " y " nota4 ". La nota eliminada es " nota3
			Escribir "El promedio de notas es: " ,(nota1 + nota2 + nota4) / 3
		SiNo
			si ((nota1 > nota2) y (nota3 > nota2) y (nota4 > nota2))
				Escribir "Las notas más altas son: " nota1 ", " nota3 " y " nota4 ". La nota eliminada es " nota2
				Escribir "El promedio de notas es: " ,(nota1 + nota3 + nota4) / 3
			SiNo
				Escribir "Las notas más altas son: " nota2 ", " nota3 " y " nota4 ". La nota eliminada es " nota1
				Escribir "El promedio de notas es: " ,(nota2 + nota3 + nota4) / 3
			FinSi
		FinSi
			
	FinSi
	
FinAlgoritmo
