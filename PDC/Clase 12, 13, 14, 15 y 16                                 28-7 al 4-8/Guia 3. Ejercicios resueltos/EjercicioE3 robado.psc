Algoritmo EjercicioE3robado
	
	definir login Como Logico
	Definir user, password Como Caracter
	
	Escribir "Usuario:"
	leer user
	
	Escribir "Contraseña:"
	leer password
	
	login = ingreso(user,password)
	Escribir login
	
FinAlgoritmo



Funcion r <- ingreso ( user, password )
	
	Definir r Como Logico
	Definir intentos Como Entero
	
	intentos = 3
	
	mientras intentos > 1 Y (user <> "usuario1" O password <> "asdasd") Hacer
		intentos = intentos - 1
		
		Escribir "Te quedan " intentos " intentos."
		Escribir "Usuario: "
		leer user
		
		Escribir "Contraseña: "
		leer password
		
	FinMientras
	
FinFuncion


