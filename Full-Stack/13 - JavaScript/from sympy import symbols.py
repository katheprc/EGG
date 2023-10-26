from sympy import symbols

def solucionarRompecabezas(N):
    var_A = 1
    var_B = 1
    var_C = 1
    var_D = 1

    for i in range(1, N + 1):
        resultado = 3 * var_D + 1 * var_C + 4 * var_B + 1 * var_A
        var_A = var_B
        var_B = var_C
        var_C = var_D
        var_D = resultado

    return var_D % 10000000000

# Calcular y mostrar los resultados
resultado1 = solucionarRompecabezas(10)
resultado2 = solucionarRompecabezas(100)
resultado3 = solucionarRompecabezas(2023**100)

print("Resultado para N=10:", resultado1)
print("Resultado para N=100:", resultado2)
print("Resultado para N=2023^100:", resultado3)