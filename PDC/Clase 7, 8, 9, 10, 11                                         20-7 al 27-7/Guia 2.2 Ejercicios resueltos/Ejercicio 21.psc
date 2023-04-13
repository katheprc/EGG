Algoritmo Ejercicio21
	
	Definir aux, mod2, mod3 Como Entero
	mod2 = 0
	mod3 = 0
	para aux <- 1 Hasta 100
		si (aux mod 2 = 0)
			mod2 = mod2 + 1	
		FinSi
		si (aux mod 3 = 0)
			mod3 = mod3 + 1
		FinSi
	FinPara
	Escribir "Hay " mod2 " números múltiplos de 2 entre el 1 y el 100"
	Escribir "Hay " mod3 " números múltiplos de 3 entre el 1 y el 100"
FinAlgoritmo
