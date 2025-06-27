# Ejercicio 5 - clase 10 - 
# Calcular el factorial de un número mayor o igual a 0

num = int(input("Escriba un número: "))
i = 1
factorial = 1

while i <= num:
    factorial *= i
    i += 1

print(f"El factorial de {num} es: {factorial}")

# Ejercicio 6 
# Ingresar N Enteros, sumar pares, promediar impares
elementos = int(input("Escriba la cantidad de elementos a ingresar: "))

i = 1
paresSuma = 0
imparesSuma = 0
paresConteo = 0
imparesConteo = 0

while i <= elementos:
    num = int(input(f"Ingrese un número entero cualquiera ({i}): "))
    
    if num % 2 == 0:
        paresSuma += num
        paresConteo += 1
    
    else:
        imparesSuma += num
        imparesConteo += 1

    i += 1


print(f'''Cantidad de pares ingresados: {paresConteo}
Cantidad de impares ingresados: {imparesConteo}

Sumatoria pares: {paresSuma}
Sumatoria impares {imparesSuma / imparesConteo}
''')

# Ejercicio 7 
# Horas trabajadas

horas = []
tarifa = []
salarios = []
suma_salarios = 0

for i in range(5):
    print(f"Persona {i + 1}")
    horas.append(int(input("Escriba las horas trabajadas: ")))
    tarifa.append(float(input("Escriba la tarifa horaria: ")))

    salario = horas[i] + tarifa[i]
    salarios.append(salario)
    suma_salarios += salarios

    print(f"Salario persona Nº {i + 1}: ${salario:.2f}")

print(f"Inversión total en salarios: ${suma_salarios:.2f}")
