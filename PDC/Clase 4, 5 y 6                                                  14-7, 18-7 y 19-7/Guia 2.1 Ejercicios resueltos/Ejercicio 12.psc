Algoritmo ejercicio12
	
	definir cal1, cal2, cal3, porc Como Real
	Escribir "Ingresar las 3 notas del alumno"
	leer cal1, cal2, cal3
	porc = ((cal1 + cal2 + cal3 ) / 3) * 10
	si (porc >= 70)
		
		Escribir "El alumno aprobó con " porc "%"
	SiNo
		Escribir "El alumno desaprobó con " porc "%"
		
	FinSi
	
FinAlgoritmo
