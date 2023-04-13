Algoritmo Ejercicio11
	
	Definir tord, torsd Como Entero
	Escribir "Indicar la producción de tornillos defectuosos del operario"
	leer tord
	Escribir "Indicar la producción de tornillos sin defectos del operario"
	leer torsd
	
	si (tord <= 200) y (torsd >= 10000)
		Escribir "El operario posee una eficiencia de GRADO 8"
	SiNo 
		si (tord > 200) y (torsd >= 10000)
			Escribir "El operario posee una eficiencia de GRADO 7"
		SiNo
			si (tord <= 200) y (torsd < 10000)
				Escribir "El operario posee una eficiencia de GRADO 6"
			SiNo
				Escribir "El operario posee una eficiencia de GRADO 5"
			FinSi
			
		FinSi
		
	FinSi
FinAlgoritmo
