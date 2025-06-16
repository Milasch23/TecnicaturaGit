//Ejercicio - Si un padre puede asistir al juego de su hijo

let vacaciones = true, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else {
    console.log("El padre no podrá asistir al juego de su hijo.")
}

//Operador ternario
let resultado = 3 > 2 ? "Verdadero": "Falso"
console.log(resultado);

//Ejercicio número par/impar
let numpar = 4 % 2 == 0 ? "Par": "Impar";
console.log(numpar);

let miNum = "18";
console.log(typeof(miNum));

let edad = Number(miNum); //Función
console.log(typeof(edad))



if (edad >= 18){
    console.log("Puede votar")
}
else {
    console.log("No puede votar aún")
}

let resultado3 = edad >= 18 ? "Puede votar" : "No puede votar aún";
console.log(resultado3)

//Función NaN
let num2 = "21";
let esono = isNaN(num2);
console.log(esono);