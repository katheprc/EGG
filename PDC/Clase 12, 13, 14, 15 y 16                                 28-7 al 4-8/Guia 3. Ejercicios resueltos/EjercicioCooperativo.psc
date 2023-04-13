Algoritmo EjercicioCooperativo
	Definir opc Como Entero
	
	Hacer
		Escribir "1 - Calcular muro de ladrillo"
		escribir "2 - Calcular viga de hormigón"
		escribir "3 - Calcular columnas de hormigón"
		escribir "4 - Calcular contrapisos"
		escribir "5 - Calcular techo"
		escribir "6 - Calcular pisos"
		escribir "7 - Calcular pintura"
		escribir "8 - Calcular iluminación"
		escribir "9 - Salir"
		Escribir " "
		Escribir "Ingrese el número de la opción deseada"
		leer opc
		
	Mientras que (menu(opc) = verdadero)
	
FinAlgoritmo


Funcion retorno <- menu (opc)
	
	Definir retorno Como logico
	retorno = Verdadero
	Segun opc
		1: retorno = calcularmuro(retorno)
		2: retorno = calcularviga(retorno)
		3: retorno = calcularcolumna(retorno)
		4: retorno = calcularcontrapisos(retorno)
		5: retorno = calculartecho(retorno)
		6: retorno = calcularpisos(retorno)
		7: retorno = calcularpintura(retorno)
		8: retorno = calculariluminacion(retorno)
		9: retorno = Falso
	FinSegun

FinFuncion



Funcion retornosup <- calcularsuperficie (largo, ancho)
	
	definir retornosup  Como Real
	retornosup = (largo * ancho)
	
FinFuncion



Funcion retornovolumen <- calcularvolumen (espesor, ancho, largo)
	
	Definir retornovolumen Como Real
	retornovolumen = espesor * ancho * largo
	
FinFuncion



Funcion retornomuro <- calcularmuro (retorno)
	Definir retornomuro Como Logico
	Definir espesor, ladri Como Entero
	Definir ancho, largo, metro2, cemento, arena como real
	Escribir "Indique ancho del muro" //BASE
	leer ancho
	Escribir "Indique largo del muro" //ALTURA
	leer largo
	metro2 = calcularsuperficie(largo, ancho)
	hacer
		Escribir "Indique si el espesor es de 20 o 30cm"
		leer espesor
		si (espesor = 30)
			cemento = metro2 * 15.2
			arena = metro2 * 0.115
			ladri = metro2 * 120
			Escribir "Para un muro de " largo " x " ancho " con un espesor de " espesor " necesitaremos: " cemento "kg de cemento, " arena "m3 de arena y " ladri " ladrillos"
			retornomuro = Verdadero
		SiNo
			si(espesor = 20)
				cemento = metro2 * 10.9
				arena = metro2 * 0.09
				ladri = metro2 * 90
				Escribir "Para un muro de " largo " x " ancho " con un espesor de " espesor " necesitaremos: " cemento "kg de cemento, " arena "m3 de arena y " ladri " ladrillos"
				retornomuro = Verdadero
			FinSi
		FinSi
	mientras que (espesor <> 20) y (espesor <> 30)
FinFuncion



Funcion retornoviga <- calcularviga (retorno)
	
	Definir retornoviga Como Logico
	Definir largo, cemento, arena, piedra, hierro8, hierro4 Como Real
	Escribir "Indicar largo de la viga"
	leer largo
	cemento = largo * 9
	arena = largo * 0.02
	piedra = largo * 0.02
	hierro8 = largo * 4
	hierro4 = largo * 3
	Escribir "Los materiales necesarios para la construir la viga de " largo "m. de largo es: " cemento "kg de cemento, " arena "m3 de arena, " piedra "m2 de piedra, " hierro8 "m. de hierro del 8 y " hierro4 "m. de hierro del 4." 
	retornoviga = Verdadero
FinFuncion



Funcion retornocolumna <- calcularcolumna (retorno)
	
	Definir retornocolumna Como Logico
	Definir largo, cemento, arena, piedra, hierro10, hierro4 Como Real
	Escribir "Indicar largo de la columna"
	leer largo
	cemento = largo * 7.5
	arena = largo * 0.016
	piedra = largo * 0.016
	hierro10 = largo * 6
	hierro4 = largo * 3
	Escribir "Los materiales necesarios para la construir la columna de " largo "m. de largo es: " cemento "kg de cemento, " arena "m3 de arena, " piedra "m2 de piedra, " hierro10 "m. de hierro del 10 y " hierro4 "m. de hierro del 4." 
	retornocolumna = Verdadero
	
FinFuncion



Funcion retornocontrapisos <- calcularcontrapisos (retorno)
	Definir retornocontrapisos Como Logico
	Definir espesor, ancho, largo, metro3, cemento, arena, piedra Como Real
	Escribir "Indique el espesor del contrapiso"
	leer espesor
	Escribir "Indique ancho del contrapiso"
	leer ancho
	Escribir "Indique largo del contrapiso"
	leer largo
	metro3 = calcularvolumen(espesor, ancho, largo)
	cemento = metro3 * 105
	arena = metro3 * 0.45
	piedra = metro3 * 0.9
	Escribir "Los materiales necesarios para la construcción del contrapiso de " espesor " x " largo " x " ancho " se necesitan " cemento "kg de cemento, " arena "m3 de arena y " piedra "m3 de piedra."
	retornocontrapisos = verdadero
	
FinFuncion


Funcion retornotecho <- calculartecho (retorno)
	
	Definir retornotecho Como Logico
	Definir espesor, ancho, largo, cemento, arena, piedra, metro2, hierro8, hierro6 como real
	Escribir "Indicar espesor del techo"
	leer espesor
	Escribir "Indicar ancho del techo"
	leer ancho
	Escribir "Indicar largo del techo" 
	leer largo
	metro2 = calcularsuperficie(largo, ancho)
	cemento = metro2 * 33
	arena = metro2 * 0.072
	piedra = metro2 * 0.072
	hierro8 = metro2 * 7
	hierro6 = metro2 * 4
	Escribir "Los materiales que se necesitan para la construcción del techo de " espesor " x " ancho " x " largo " es: " cemento "kg de cemento, " arena "m3 de arena, " piedra "m3 de piedras, " hierro8 "m. de hierro del 8 y " hierro6 "m. de hierro del 6."
	retornotecho = Verdadero
	
FinFuncion



Funcion retornopisos <- calcularpisos (retorno)
	Definir retornopisos Como Logico
	Definir ancho, largo, metro2, largosup, anchosup, metro2sup Como Real
	metro2 = 0
	Escribir "Indicar ancho del paño a colocar"
	leer ancho
	Escribir "Indicar largo del paño a colocar"
	leer largo
	Escribir "Indicar largo de la superficie a cubrir"
	leer largosup
	Escribir "Indicar ancho de la superficie a cubrir"
	leer anchosup
	metro2sup = calcularsuperficie(largosup, anchosup) * 1.10
	metro2 = calcularsuperficie(largo, ancho) * 1.10
	metro2sup = metro2sup * metro2

	Escribir "Se necesitan " metro2sup "m2 de paño para cubrir la superficie de " metro2sup
	retornopisos = Verdadero
	
	
FinFuncion



Funcion retornopintura <- calcularpintura (retorno)
	
	Definir retornopintura Como Logico
	Definir ancho, largo, metro2, cantidadpintura Como Real
	Escribir "Indicar ancho del muro"
	leer ancho
	Escribir "Indicar largo del muro"
	leer largo
	metro2 = calcularsuperficie(largo, ancho)
	cantidadpintura = metro2 / 6
	Escribir "Se necesitan " cantidadpintura "lt. de pintura para pintar la superficie de " metro2 "m2."
	retornopintura = Verdadero
	
FinFuncion



Funcion retornoiluminacion <- calculariluminacion (retorno)
	
	Definir retornoiluminacion Como Logico
	Definir ancho, largo, espesor, metro3, calculo Como Real
	Escribir "Indicar ancho de la pared de la habitación"
	leer ancho
	Escribir "Indicar largo de la pared de la habitación"
	leer largo
	Escribir "Indicar altura de la habitación"
	leer espesor
	metro3 = calcularvolumen(espesor, ancho, largo)
	calculo = metro3 * 0.20
	Escribir "Se necesitan " calculo " de iluminación en la habitación"
	
	
FinFuncion