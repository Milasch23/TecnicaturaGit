#6.1 Sentencia if/else

condicion = True
if condicion == True:
    print("Condición verdadera")
elif condicion == False:
    print("Condición falsa")
else:
    print("Condición no especificada")

#*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*

#Ejercicio Conversión de Número a Texto
num = int(input("Ingrese un número, del 1 al 3: "))
numText = ""
if num == 1:
    print(f"{num} = Número Uno")
elif num == 2:
    print(f"{num} = Número Dos")
elif num == 3:
    print(f"{num} = Número Tres")
else:
    print("Error")

#-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

#6.2 Ejercicio 1

# Escribir la expresión en su forma algorítmica

val_a = float(input("Escriba el valor 'a': "))
val_b = float(input("Escriba el valor 'b': "))
val_c = float(input("Escriba el valor 'c': "))

resultado = (val_a ** 3 * (val_b ** 2 - 2 * val_a * val_c))/(2 * val_b)

print(f"Resultado: {resultado}")

#*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

# 6.3 Sintaxis simplificada (Operador Ternario)

condicion = True
print("Condición Verdadera" ) if condicion else print("Condición Falsa")

#*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

# Ejercicios Power Point
#Ejercicio 2 - Determinar la solución lógica de la siguiente operación.
# ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

val_a = float(input("Ingrese el valor a: "))
val_b = float(input("Ingrese el valor b: "))

resultado = ((3 + 5 * 8) < 3 and ((-6/3 * 4 ) + 2 < 2)) or ( val_a > val_b)

print(f"Resultado de la operación lógica: {resultado}")

# Ejercicio 3 - Intercambiar el valor de dos variables

print(f"Valor a: {val_a}")
print(f"Valor b: {val_b}")

val_a, val_b = val_b, val_a

print(f"Nuevo valor a: {int(val_a)}")
print(f"Nuevo valor b: {int(val_b)}")

# Ejercicio 4 - Área y longitud de un circulo
# Hacer un programa para ingresar el radio de un circulo 
# y se reporte su área y la longitud de la circunferencia.

import math

radio = float(input("Escriba el radio de su círculo (cm): "))

area = math.pi * (radio ** 2)
longitud = 2 * math.pi * radio

print(f"Área de su círculo: {area}")
print(f"Longitud de su círculo: {longitud}")




