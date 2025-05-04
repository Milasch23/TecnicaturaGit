var nombre = "Trevor";
console.log(nombre)

var nombre = "Camila";
console.log(typeof nombre)

var num = 7.1;
console.log(typeof num);

var objeto = {
    nombre: "Camila",
    apellido: "Scheurer",
    tel: 123456789
}
console.log(typeof objeto); //Objeto

var bandera = true;
console.log(bandera);

function miFuncion(){}
console.log(typeof miFuncion);

var simbolo = Symbol("Mi símbolo");
console.log(typeof simbolo);

class Persona {
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(Persona);