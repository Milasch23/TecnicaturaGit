'''Ejercicio 3 - Calcular estación del año
Pedir al usuario que ingrese un mes del año,
el valor debe ser entre 1 y 12. Luego imprimir
en qué estación del año está'''

estacion = int(input("Ingrese el mes del año actual: "))

if estacion >= 1 and estacion <= 3:
    print(f"Mes: {estacion}, estación: Verano")
elif estacion >= 4 and estacion <= 6:
    print(f"Mes: {estacion}, estación: Otoño")
elif estacion >= 7 and estacion <= 9:
    print(f"Mes: {estacion}, estación: Invierno")
elif estacion >= 10 and estacion <= 12:
    print(f"Mes: {estacion}, estación: Primavera")
else:
    print("Error")

#*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

'''Ejercicio 4 - Etapas de la vida
Hacer un programa donde se le pida al usuario 
su edad. En base a eso, imprimir en qué etapa
de la vida se encuentra'''

edad = int(input("Ingrese su edad: "))
if edad >= 0 and edad <= 10:
    print(f"Edad: {edad}. La infancia es increíble y bella.")
elif edad >= 11 and edad <= 19:
    print(f"Edad: {edad}. Tienes muchos cambios, mucho que estudiar.")
elif edad >= 20 and edad <= 29:
    print(f"Edad: {edad}. Amor y comienza el trabajo.")
elif edad >= 30 and edad <= 59:
    print(f"Edad: {edad}. Responsabilidad, la estabilidad laboral, familiar y social")
else:
    print(f"Edad: {edad}. Adaptación a nuevos roles sociales y la reflexión sobre la vida")

#*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

'''Ejercicio 5 - Sistema de calificaciones
Pedirle al usuario que ingrese una calificación del 0 al 10
Imprimir el equivalente correspondiente al sistema estadounidense'''

calificacion = float(input("Ingrese la nota: "))

if calificacion >= 9 and calificacion <= 10:
    print("Nota: A")
elif calificacion >= 8 and calificacion < 9: 
    print("Nota: B")
elif calificacion >= 7 and calificacion < 8:
    print("Nota: C")
elif calificacion >= 6 and calificacion < 7:
    print("Nota: D")
elif calificacion < 6:
    print("Nota: F")
else: 
    print("Error.")