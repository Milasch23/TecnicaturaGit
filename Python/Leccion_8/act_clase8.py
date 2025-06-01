# video 6.1 Ciclo While

# condicion = True                           _________
# while condicion:                          |
#     print("Ejecutando el ciclo While")    |
# else:                                    <     Esto da como resultado un ciclo infinito
#     print("Fin")                         |_________


contador = 0
while contador < 10:
    print(f"Ejecutando el ciclo While con un contador ({contador + 1})")
    contador += 1
else:
    print("Fin")
    
print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*''')
# video 6.2 Ejercicios con el ciclo While

contador = 0
while contador < 5:
    print(contador + 1)
    contador += 1

print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*''')

contador = 5
while contador > 0:
    print(contador)
    contador -= 1

print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*''')
# video 6.3 Ciclo For, palabra break, continue

cadena = "Hola que tal"
for letra in cadena:
    print(letra)

print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*''')

for letra in "Bélgica":
    if letra == "l":
        print(f"Letra encontrada: {letra}")
        break

print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*''')

for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

print('''
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*''')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i}")