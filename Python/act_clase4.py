# Clase 4 - Operadores en Python
#Videos

operandoA = 6
operandoB = 17
suma = operandoA + operandoB
print("Suma:", suma)
print(f"Suma: {suma}")

#############################################

resta = operandoA - operandoB
print(f"Resta: {resta}")

multi = operandoA * operandoB
print(f"Multiplicación: {multi}")

division = operandoB / operandoA
print(f"División: {division}")

division2 = operandoB // operandoA
print(f"División v2: {division2}")

modulo = operandoB % operandoA
print(f"Módulo: {modulo}")

exponente = operandoB ** operandoA
print(f"Exponente: {exponente}")

####################################################

# Ejercicio: 
# Crear un programa que calcule el área de un 
# rectángulo

print("Calculadora de área y perímetro rectangular")
alto = int(input("Ingrese el alto de su rectángulo (cm): "))
ancho = int(input("Ahora ingrese el ancho (cm): "))

area = alto * ancho
perimetro = (alto + ancho) * 2

print(f"De acuerdo a las medidas ingresadas, el área de su rectángulo es: {area} cm2, y su perímetro es: {perimetro} cm2")

#########################################################################

miVar4 = 17
print(miVar4)

miVar4 = miVar4 + 3
print(miVar4)

miVar4 += 6
print(miVar4)

miVar4 -= 7
print(miVar4)

miVar4 *= 2
print(miVar4)

miVar4 /= 4
print(miVar4)

#########################################################################

d = 3
b = 5

res = d == b
print(res)

res = d != b
print(res)

res = d > b
print(res)

res = d < b
print(res)

res = d <= b
print(res)

res = d >= b
print(res)

############################################################
# Ejercicio 1 - Crear un programa que determine si un 
# número es par o impar

num = int(input("Ingrese un número: "))

if num % 2 == 0:
    print(f"El número {num} es par.")
else:
    print(f"El número {num} es impar.")

##########################################################

# Ejercicio 2 - Crear un programa que determine si el 
# usuario es mayor de edad o no

edad = int(input("Ingrese su edad: "))

if edad < 18:
    print("Es un niño, que se vaya a casa.")
elif edad == 18:
    print("Tecnicamente es mayor de edad, pero es un niño aún.")
elif 18 < edad <= 21:
    print("Ahí si ya es un adulto en mejores condiciones...")
else: 
    print("Ya es grande, ya...")




