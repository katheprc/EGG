Algoritmo Prueba
	
	definir num, cent, dec, uni Como real

	escribir "Ingrese un número de tres cifras:"
	leer num
	
	
	uni = num mod 10
	num = trunc(num/10)
	
	dec = num mod 10
	num = trunc(num/10)
	
	cent = num mod 10
	
	
	escribir "Centena: " ,cent
	escribir "Decena: " ,dec 
	escribir "Unidad: " ,uni
	
	
FinAlgoritmo
