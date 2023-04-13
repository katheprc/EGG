Algoritmo sin_titulo
//	Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//	devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//	Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
	//	solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.
	
	definir intentos,intentos1 Como Entero
	definir usuario,contrasenia Como Caracter
	definir i Como Logico
	escribir "ingrese el usuario"
	
	leer usuario
	escribir "ingrese la contraseña"
	leer contrasenia
i=fun(usuario,contrasenia)
escribir i	
	
	
FinAlgoritmo
funcion retorno<-fun(usuario,contrasenia)
	definir retorno Como Logico
	Definir contador Como Entero
	contador=2
	mientras (usuario<>"usuario1"o contrasenia<>"asdasd") y contador>0 Hacer
		escribir "te quedan ",contador,"intentos"
		escribir "ingrese nuevamente el usuario"
		leer usuario
		escribir "ingrese nuevamente la contraseña"
		leer contrasenia
		contador=contador-1
		
	FinMientras
	si usuario="usuario1" y contrasenia="asdasd"
		retorno=Verdadero
	SiNo
		retorno=falso
	FinSi
FinFuncion
