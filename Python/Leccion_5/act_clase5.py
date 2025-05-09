# Operadores lógicos (4.5)

# AND
a = True
b = True
resultado1 = a and b
print(resultado1)

c = True
d = False
resultado2 = c and d
print(resultado2)


# OR
resultado3 = a or b
print(resultado3)

resultado4 = c or d
print(resultado4)

e = False
f = False
resultado5 = e or f
print(resultado5)


# NOT
resultado6 = not a
print(resultado6)

# -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
# Ejercicio - Valor dentro de un rango (4.6)
 
valor = float(input("Ingrese un valor numérico: "))
if valor >= 0 and valor <= 5:
    print("El valor ingresado está entre 0 y 5")
else: 
    print("El valor ingresado no se encuentra en el rango 0 - 5")

# *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
# Ejercicio - Operador OR (Pregunta si el padre puede asistir al juego de su hijo) - Operador NOT (4.7)
vacaciones = False
franco = True
if not (vacaciones or franco):
    print("Si puede asistir al juego.")
else:
    print("No puede")

# *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

# Ejercicio - Rango entre las edades 20 y 30 años (4.8)

edad = int(input("Ingrese su edad: "))
veintes = edad >= 20 and edad < 30
print(veintes)
treintas = edad >= 30 and edad < 40
print(treintas)

if veintes or treintas:
    if veintes:
        print("Estás en tus veintes.")
    elif treintas:
        print("Estás en tus treintas.")
else:
    print("No estás en ninguno de los rangos etarios.")

# *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
# Ejercicio 1 - El mayor de dos números
# Solicitar al usuario dos números, imprimir el mayor de ellos

num1 = int(input("Ingrese un número: "))
num2 = int(input("Ingrese otro número: "))

if num1 > num2:
    print(f"El número {num1} es el mayor de los ingresados.")
else:
    print(f"El número {num2} es el mayor de los ingresados.")

# Ejercicio Tienda de Libros
print("Ingrese los siguientes datos del libro: ")
nombre = input("Nombre: ")
ident = input("ID: ")
precio = float(input("Precio: "))

envioGra = input("¿El libro cuenta con envío gratis? Y/N: ")
if envioGra == "Yes" or envioGra == "Y" or envioGra == "Si":
    envioGra = True
elif envioGra == "No" or envioGra == "N": 
    envioGra = False
else:
    print("Error.")

print(f'''
Nombre: {nombre}
Id: {ident}
Precio: {precio}
¿Envío gratuito?: {envioGra} ''')

        