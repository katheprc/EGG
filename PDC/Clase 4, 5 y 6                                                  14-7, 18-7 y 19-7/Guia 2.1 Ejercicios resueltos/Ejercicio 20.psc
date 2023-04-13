Algoritmo Ejercicio21
	
	definir ano Como Entero
	Escribir "Indicar un año"
	leer ano
	si ((ano mod 4 = 0) y (ano mod 100 <> 0)) o ((ano mod 100 = 0) y (ano mod 400 = 0))
		Escribir "El año " ano " es bisiesto"
	SiNo
		Escribir "El año " ano " no es bisiesto"
	FinSi
	
FinAlgoritmo
