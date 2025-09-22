let x = 10; //Variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@mail.com',
    edad: 28,
    idioma:"ES",

    get lang() {
    return this.idioma.toUpperCase(); //convierte las minusculas a mayusculas
    },

set lang(lang) {
    this.idioma = lang.toUpperCase();
    },

nombreCompleto: function() { //método o función en JavaScript
    return this.nombre + ' ' + this.apellido;
    },

get nombreEdad() { //Este es el método get
    return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log('Ejecutando un objeto');
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '54281238912983';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('cambiamos y eliminamos un error');
delete persona.apellida;
console.log(persona);

//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla, concatenar cada valor de cada propiedad
console.log("Distinta formas de imprimir un objeto: forma 1");
console.log(persona.nombre+', '+persona.apellido);

//Numero 2: A traves del ciclo for in
console.log('Distinta formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion Object.values()
console.log('Distinta formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizaremos el metodo JSON stringify
console.log('Distinta formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString)

console.log("comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad); 

console.log("comenzamos con el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;

    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez','lopez@gmail.com');
padre.nombre = 'Luis'; //Modificamos el nombre de padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion

let madre = new Persona3('Laura','Contrera','contrera@gmail.com');
console.log(madre);
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos
//caso objeto 1
let miObjeto = new Object(); //Esta es la opcion formal

//caso objeto 2
let miObjeto2 = {}; //Esta opcion es breve y recomendada

//Diferentes formas de crear cadenas
//caso string 1
let miCadena1 = new String('Hola'); //Sintaxis formal

//caso string 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//Diferentes formas de crear numeros
//caso numero 1
let miNumero1 = new Number(1); //Formal
//caso numero 2
let miNumero2 = 1; //Simplificada

//Diferentes formas de crear booleanos
//caso boolean 1
let miBoolean1 = new Boolean(false); //Formal
//caso boolean 2
let miBoolean2 = false; //Simplificada

//Diferentes formas de crear arreglos
//caso arreglo 1
let miArreglo1 = new Array(); //Formal
//caso arreglo 2
let miArreglo2 = []; //Simplificada

//Diferentes formas de crear funciones
//caso funcion 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso funcion 2
let miFuncion2 = function(){}; //Simplificada

// uso de prototype 
Persona3.prototype.telefono = '1234321413124';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '123214553453';
console.log(madre.telefono);

// uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+ ': '+this.nombre+ ' '+ this.apellido+ ' '+ telefono;
        //return this.nombre + ' ' + this.apellido;
    }
} 

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '12321421421'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing', '15413543261124'));

// metodo apply
let arreglo = ['Ing.', '54612343214'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));