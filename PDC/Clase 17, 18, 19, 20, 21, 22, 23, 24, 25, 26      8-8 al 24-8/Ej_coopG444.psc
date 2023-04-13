//Se debe crear una matriz con las siguientes palabras como se muestra a
//continuación. Luego de eso debemos acomodar las palabras para que la primera
//	letra ?R? de cada una quede en la posición 5, alineándose.

//PALABRAS: vector, matriz, programa, subprograma, subproceso, variable, entero, para, mientras.

Algoritmo Ej_coopG4
	
	definir matriz Como caracter
	definir dimF, dimC, F,i Como Entero;dimF=9;dimC=12;i=0;F=0
	Dimension Matriz(dimF,dimC)
	
	inicializarMatriz(matriz, dimF, dimC)
	
	imprimirMatriz(matriz, dimF, dimC)
	
	definir palabra Como Caracter
	Dimension palabra(9)
	palabra(0)= "vector"
	palabra(1)= "matriz"
	palabra(2)= "programa"
	palabra(3)= "subprograma"
	palabra(4)= "subproceso"
	palabra(5)= "variable"
	palabra(6)= "entero"
	palabra(7)= "para"
	palabra(8)= "mientras"
	
	Para i<-0 Hasta 8 Hacer
		agregarPalabras(matriz, F, palabra, i)
	Fin Para
	acomodarPalabra(matriz)
	imprimirMatriz(matriz, dimF, dimC)
	
	
	
FinAlgoritmo

//subprograma inicializarMatriz:
//	Debe recibir como parámetros la matriz a inicializar, la cantidad de filas y la cantidad de
//	columnas.
//	En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar para que
//	la misma no esté vacía y no tengamos problemas.

SubProceso inicializarMatriz(Matriz, dimF, dimC)
	
	definir i,j Como Entero
	Para i<-0 Hasta 8 Hacer
		Para j<-0 Hasta 11 Hacer
			matriz(i,j) = "*"
		Fin Para
	Fin Para
	
FinSubProceso

//subprograma imprimirMatriz:
//	Debe recibir como parámetros la matriz a imprimir, la cantidad de filas y la cantidad de
//	columnas.
//	Para que veamos la matriz en la consola cuando lo necesitemos.
//		Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un
//			espacio, la letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la
//				matriz.

Subproceso imprimirMatriz(matriz, dimF, dimC)
	
	definir i,j Como Entero
	Para i<-0 Hasta 8 Hacer
		Para j<-0 Hasta 11 Hacer
			escribir sin saltar " " matriz(i,j)
		Fin Para
		escribir ""
	Fin Para
	
FinSubProceso

//subprograma agregarPalabra:
//	Se le debe indicar en los parámetros la matriz donde se va a agregar la palabra, la fila en la
//	que se agregará y la propia palabra. Una vez el subprograma reciba eso debe descomponer
//	la palabra y agregarla a la matriz en la posición deseada.

SubProceso agregarPalabras(matriz, F, palabra, i)
	
	definir j Como Entero
	para i<-0 hasta 8 Hacer
		Para j<-0 Hasta Longitud(palabra(i))-1 Hacer
			matriz(i,j) = Subcadena(palabra(i),j,j)
		Fin Para
	FinPara
FinSubProceso

//subprograma buscarR:
//	Se le debe indicar la matriz donde se buscará la letra R y el número de fila en el que
//	buscaremos.
//	Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra ?R?. Ahí
//	debe devolvernos la posición de ?R?.
//Nota: cuidado! debe devolver la posición de la primera R solamente.

funcion posicionR <- buscarR(matriz, i)
	definir posicionR,j Como Entero
	para j<-11 hasta 0 con paso -1 hacer
		si matriz(i,j) = "r" Entonces
			posicionR = j
		FinSi
	FinPara
	escribir posicionR
FinSubProceso

//subprograma acomodarPalabra:
//	Se le debe indicar sólo la matriz en donde se acomodarán las palabras.
//	Ahora debemos crear una lógica que nos permita mover las palabras de las filas. Recordar
//	que podemos llamar a buscarR para saber cuántos espacios hay que mover las palabras.
//		Una vez que las palabras se muevan hay que llenar los espacios con asteriscos
//	nuevamente: es decir, si la palabra se mueve dos posiciones a la derecha hay que agregar
//			dos asteriscos a la izquierda de la fila.
//		Nota: ¡recuerden que la primera letra ?R? debe quedar en la posición 5 de la matriz!

subproceso acomodarPalabra(matriz)
	definir posicionI, posicionF,j,i Como Entero
	posicionI=5
	
	para i<-0 hasta 8 Hacer
		posicionF = posicionI - buscarR(matriz,i)
		Para j<- 11 hasta posicionF hacer
			
			matriz(i,j) = matriz (i,j - posicionF)
			
		FinPara	
		Para j<-posicionF-1 Hasta 0  Hacer
			Si posicionF>0 Entonces
				matriz[i,j]="*"
			Fin Si
			
		Fin Para
	FinPara
	
FinSubProceso






