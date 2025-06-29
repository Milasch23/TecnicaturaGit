//Ejercicio 1 - Estaciones del año
let mes = 4;

if (mes === 1 || mes === 2 || mes === 3) {
    console.log("Verano")
} else if (mes === 4 || mes === 5 || mes === 6) {
    console.log("Otoño");
} else if (mes === 7 || mes === 8 || mes === 9) {
    console.log("Invierno");
} else if (mes === 10 || mes === 11 || mes === 12) {
    console.log("Primavera");
} else {
    console.log("Desconocido");
}

//Ejercicio 2 - Hora del día
let hora = 9;
let mensaje; 

if (hora >= 6 && hora <= 11) {
    mensaje = "Buen día";
}
else if (hora >= 12 && hora <= 16) {
    mensaje = "Buena tarde";
}
else if (hora >= 17 && hora <= 19) {
    mensaje = "Buena noche";
}
else if (hora >= 20 && hora <= 23) {
    mensaje = "Buenas noches";
}

console.log(mensaje);
