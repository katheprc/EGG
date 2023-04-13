Algoritmo Cooperativo
	
	Definir usuario, contra, acepta Como Caracter
	Definir aux, opc, bot, aux2, aux3, aza, valor1, valor2, valor3, saldo Como Entero
	Definir login Como Logico
	login = Falso
	aux = 3
	opc = 1
	saldo = 0
	Escribir "Ingrese usuario"
	leer usuario
	
	Mientras (aux > 0) y (usuario = "Albus_D")
		Escribir "Ingrese contraseña"
		leer contra
		aux = aux - 1
		si (contra = "caramelosDeLimon")
			Escribir "Contraseña correcta"
			Login = Verdadero
			Hacer
				Escribir "---------------------"
				Escribir "1. Ingresar botellas"
				escribir "2. Consultar saldo"
				escribir "3. Salir"
				Escribir " "
				Escribir "Ingresar una opción"
				Leer opc
				Segun opc
					1: 	valor1 = 0
						valor2 = 0
						valor3 = 0
						escribir "¿Cuantas botellas?"
						Leer bot
						Escribir " "
						para aux2 <- 1 hasta bot
								aza = aleatorio(100, 3000)
								Escribir "Botella ", aux2 " = "Sin Saltar
								Escribir aza "gr"
								Escribir " "
								Si (aza <= 500)
									valor1 = valor1 + 1
								SiNo
									si (aza >= 501) y (aza <= 1500)
										valor2 = valor2 + 1
									SiNo
										si (aza >= 1501)
											valor3 = valor3 + 1
										FinSi
									FinSi
								FinSi
						FinPara
						Escribir " "
						Escribir "El valor por el material ingresado es: "
						Escribir " "
						si (valor1 <> 0)
							Escribir "Botellas de hasta 500gr ($50 c/U):"
							Escribir valor1 " botellas ingresadas, valor ofrecido: $" valor1 * 50
							Escribir " "
						FinSi
						si (valor2 <> 0)
							Escribir "Botellas entre 501gr y 1500gr ($125 c/U):"
							Escribir valor2 " botellas ingresadas, valor ofrecido: $" valor2 * 125
							Escribir " "
						FinSi
						si (valor3 <> 0)
							Escribir "Botellas de 1501gr o más ($200 c/U):"
							Escribir valor3 " botellas ingresadas, valor ofrecido: $" valor3 * 200
							Escribir " "
						FinSi
						Escribir " "
						Escribir "El valor total ofrecido es: $" ((valor1*50) + (valor2*125) + (valor3*200))
						Escribir "¿Acepta el valor ofrecido? (S/N)"
						
						Hacer
							leer acepta
						Mientras Que ((acepta <> "s") y (acepta <> "S") y (acepta <> "n") y (acepta <> "N"))
						
						Si (acepta = "s") o (acepta = "S") 
							Escribir "Acreditado correctamente a su saldo"
							saldo = saldo + ((valor1*50) + (valor2*125) + (valor3*200))
						SiNo
							Escribir "Devolviendo material... Espere"
						FinSi
						
					2: escribir "Su saldo es: " saldo
				FinSegun
			Mientras Que (opc <> 3)
		SiNo
			Escribir "Contraseña incorrecta"
			Escribir "Le quedan " aux " intentos"
		FinSi

	FinMientras
	
FinAlgoritmo
