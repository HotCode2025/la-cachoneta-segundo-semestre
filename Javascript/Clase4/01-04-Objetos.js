let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido : 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){//Metodo o funcion en JavaScript
        return this.nombre +' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');

let persona2 = new Object(); //debe crear un nuevo objeto de memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492418698522';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']);
console.log('Cambiamos y eliminamos un error');
//For in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

persona.apellido = 'Fratucello'; //Cambiamos dinamicamente un valor del objeto
console.log(persona);


//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto");
console.log(persona.nombre+', '+persona.apellido);

//Numero 2: a través del ciclo for in
console.log("Distinta formas de imprimir un objeto forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
console.log("Distinta formas de imprimir un objeto forma 3");
//Numero 3: a través del ciclo for in

let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizaremos el metodo JSON.stringify
console.log("Distinta formas de imprimir un objeto forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);


