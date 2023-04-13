SubProceso cambio(frase por valor)
	
	Definir i Como Entero
	
	Definir letra, frase1 Como Caracter
	frase1=""
	
	Para i<-0 Hasta Longitud(frase) Hacer
		
		letra = SubCadena(frase,i,i)
		
		si letra = "." Entonces
			
			i = Longitud(frase)
			frase1 = Concatenar(frase1,letra)
//			Escribir Sin Saltar "."
			
		SiNo
			
			Segun letra Hacer
				
				"a":
					letra = "@"
					
//					Escribir Sin Saltar letra
					frase1 = Concatenar(frase1,letra)
					
				"e":
					letra = "#"
					
					//Escribir Sin Saltar letra
					frase1 = Concatenar(frase1,letra)
					
				"i":
					letra = "$"
					
					frase1 = Concatenar(frase1,letra)
//					Escribir Sin Saltar letra
				"o":
					letra = "%"
					frase1 = Concatenar(frase1,letra)
//					Escribir Sin Saltar letra
				"u":
					letra = "*"
					frase1 = Concatenar(frase1,letra)
//					Escribir Sin Saltar letra
					
				De Otro Modo:
					
					letra = letra
					
//					Escribir Sin Saltar letra
					frase1 = Concatenar(frase1,letra)
				
			Fin Segun
		FinSi
	Fin Para
	
	Escribir frase1
	
FinSubProceso

Algoritmo ejercicio9
	
	Definir frase como cadena
	
	Escribir "Ingrese una frase y termine con un punto."
	
	leer frase
	
	cambio(frase)

	
FinAlgoritmo
