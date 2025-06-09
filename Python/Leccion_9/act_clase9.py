# Ejercicio Año Bisiesto

opcion = 1
while opcion == 1:
    year = int(input("Ingrese un año: "))
    if ((year % 4 == 0) and (year % 100 != 0)) or year % 400 == 0:
        print(f"El año {year} es/fue/será bisiesto.")
    else:
        print(f"El año {year} NO es/fue/será bisiesto.")
    
    opcion = int(input("Para continuar, ingrese el número 1: "))

print("Fin del programa.")

# Ejercicio - Calcular la suma de los N primeros números

numero = int(input("Ingrese el número para la sumatoria: "))
suma = 0
i = 1

for i in range(numero + 1):
    suma = suma + i

print(f"Sumatoria total de los {numero} primeros números: {suma}")

# Ejercicio - Leer 10 números e imprimir cuántos son positivos, cuántos 
# negativos y cuántos neutros

positivos = 0
negativos = 0
neutros = 0

for i in range(10):
    num = float(input(f"Escriba el número {i + 1}: "))
    if num > 0:
        positivos += 1
    elif num < 0:
        negativos += 1
    else:
        neutros += 1

print(f'''números positivos ingresados: {positivos}
números negativos ingresados: {negativos}
números neutros ingresados: {neutros} 
''')

'''Ejercicio ' Suponga que se tiene un conjunto de calificaciones
de un grupo de 10 personas. Realizar un algoritmo para calcular
la calificación promedio y la calificación mas baja de todo 
el grupo'''

cal_promedio = 0
cal_mas_baja = float('inf')
suma = 0

for i in range(10):
    calificacion = float(input(f"Ingrese la calificación del alumno {i+1}"))
    suma += calificacion
    if calificacion < cal_mas_baja:
        cal_mas_baja = calificacion

cal_promedio = suma / 10

print(f'''Calificación promedio: {cal_promedio:.2f}
calificación más baja: {cal_mas_baja:.2f}
''')
