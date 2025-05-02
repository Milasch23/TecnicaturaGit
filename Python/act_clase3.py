#Videos Campus
a: str = "Hola a todo el mundo" #Referencia
b = "Hola a todo el mundo"
print(type(a))
print(b)

c = 11.49
print(type(c))
print(c)

d = True
print(type(d))
print(d)

######################################################################################

bandaFavorita = "Within Temptation"
caracteristicas = "Metal sinfónico y alternativo"
print("Mi banda favorita es: " + bandaFavorita +", " + caracteristicas)

num_a = "5"
num_b = "6"
print(int(num_a) + int(num_b))

###############################################################################

booleana_a = True
print(booleana_a)
booleana_b = 3 > 6
print(booleana_b)

if booleana_b:
    print("Verdadero")
else:
    print("Falso")

#############################################################################

resultado = input("Escriba un número o letra: ") #Valor por defecto de tipo String
print(resultado)

numeroA = (int(input("Escribe número A: ")))
numeroB = (int(input("Escribe número B: ")))
res = numeroA + numeroB
print(res)

##########################################################################

# 3.8 Actividad
#Ejercicio 1

dia = int(input("¡Hola! ¿Cómo estuvo tu día hoy? Califícalo del 1 al 10: "))
if dia == 10:
    print("¡Me alegro que tu día haya estado tan bien!")
elif 9 >= dia >= 7:
    print("¡Me alegro que hayas tenido un día pasable!")
elif 6 >= dia >= 3:
    print("No pasa nada si no te fue como esperabas, mañana es otro día")
else: 
    print("Lamento que tu día haya sido malo, ¿Quieres hablar sobre ello?")

###################################################################################

print("Bienvenido al sistema de carga de libros.")
libro = input("Proporciona el nombre del libro: ")
autor = input("Proporciona el autor del libro ingresado: ")

print("Libro correctamente ingresado: ")
print("Nombre: " + libro)
print("Autor: " + autor)




