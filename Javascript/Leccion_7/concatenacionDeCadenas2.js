let nombre2 = "Lucas";
console.log(nombre2);

const apellido2 = "Martinez";
//apeliido2 = "Navarro" <- X
console.log(apellido2);

let x, y;
x = 13, y = 78;
let z = x + y;
console.log(z);

let $1num = 18;

let $break = "Hola";

//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
//Ejercicio - Par o Impar

let numeros = [];
for (let i = 0; i < 10; i++) {
    numeros.push(Math.floor(Math.random() * 100) + 1);

}
console.log("Numeros generados", numeros);

let pares = [];
let impares = [];

for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 === 0) {
        pares.push(numeros[i]);
    } else {
    impares.push(numeros[i]);
} 
}

console.log("Pares: ", pares);
console.log("Impares: ", impares);
//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//Ejercicio - Es mayor de edad
let anio = 29;
if (anio >= 18){
    console.log("Es mayor de edad");
}
else {
    console.log("No es mayor de edad.")
}