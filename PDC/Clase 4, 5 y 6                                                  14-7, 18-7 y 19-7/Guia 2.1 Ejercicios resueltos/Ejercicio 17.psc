Algoritmo Ejercicio18
	
	definir dia, mes, ano Como real
	Escribir "Indicar d�a"
	leer dia
	Escribir "Indicar mes"
	leer mes
	Escribir "Indicar a�o (AAAA)"
	leer ano
	
	
	si ((dia <= 28) y (mes = 2))
		Escribir dia " de febrero de " ano
	SiNo
		si ((dia = 31) y (mes <> 2))
			segun mes
				1: escribir "31 de enero de " ano
				3: escribir "31 de marzo de " ano
				5: escribir "31 de mayo de " ano
				7: escribir "31 de julio de " ano
				8: escribir "31 de agosto de " ano
				10: escribir "31 de octubre de " ano
				12: escribir "31 de diciembre de " ano 
			De Otro Modo:
				Escribir "Colocar un mes v�lido"	
			FinSegun
		SiNo
			si ((dia <= 30) y (mes <> 2))
				segun mes
					1: escribir dia " de enero de " ano
					3: escribir dia " de marzo de " ano
					4: escribir dia " de abril de " ano
					5: escribir dia " de mayo de " ano
					6: escribir dia " de junio de " ano
					7: escribir dia " de julio de " ano
					8: escribir dia " de agosto de " ano
					9: escribir dia " de septiembre de " ano
					10: escribir dia " de octubre de " ano
					11: escribir dia " de noviembre de " ano
					12: escribir dia " de diciembre de " ano
				FinSegun
			SiNo
				Escribir "Colocar un mes v�lido"
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
