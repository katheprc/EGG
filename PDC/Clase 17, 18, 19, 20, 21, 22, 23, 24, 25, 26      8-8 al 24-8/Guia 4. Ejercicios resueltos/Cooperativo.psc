Algoritmo Cooperativo
	Definir matriz,vector Como Caracter
	Dimension matriz[9,12],vector[9]
	vector[0] <- 'VECTOR'
	vector[1] <- 'MATRIX'
	vector[2] <- 'PROGRAMA'
	vector[3] <- 'SUBPROGRAMA'
	vector[4] <- 'SUBPROCESO'
	vector[5] <- 'VARIABLE'
	vector[6] <- 'ENTERO'
	vector[7] <- 'PARA'
	vector[8] <- 'MIENTRAS'
	rellenar(matriz,vector)
	rellenar2(matriz,vector)
	imprimirmatriz(matriz)
FinAlgoritmo



Funcion rellenar (matriz Por Referencia,vector Por Referencia)
	Definir aux,aux2 Como Real
	Para aux<-0 Hasta (8) Hacer
		Para aux2<-0 Hasta 11 Hacer
			matriz[aux,aux2]<-vector[aux]
			Escribir matriz(aux, aux2) "   "Sin Saltar
		FinPara
		Escribir ""
		Escribir ""
	FinPara
FinFuncion



Funcion rellenar2 (matriz Por Referencia, vector Por Referencia)
	Definir aux,aux2 Como Real
	Definir aux3 Como Caracter
	Para aux<-0 Hasta (8) 
		Para aux2 <- 0 Hasta 11 
			aux3 = vector[aux]
			matriz[aux,aux2]= Subcadena(aux3, aux2, aux2)
		FinPara
	FinPara
FinFuncion



Funcion imprimirmatriz (matriz)
	Definir aux,aux2 Como Real
	Para aux<-0 Hasta (8) 
		Para aux2<-0 Hasta 11 
			Escribir matriz[aux,aux2],'  ' Sin Saltar
		FinPara
		Escribir ''
	FinPara
FinFuncion
