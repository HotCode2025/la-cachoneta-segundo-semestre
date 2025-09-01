// Creacion de array o arreglos

//let autos = new Array("Ferrari","Renault","BMW"); esta es la sintaxis vieja

const autos = ["Ferrari","Renault","BMW"];

console.log(autos);

// Recorremos los elementos del arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
console.log(i + " : " +autos[i])
}

// modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

// agregamos nuevos valores al arreglo
autos.push('Audi'); // agregamos el elemento al final del arreglo
console.log(autos);

// otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

// tercera forma de agregar elementos teniendo cuidado
autos[6] = 'Renault';
console.log(autos);
// como preguntar si es una Array o Arreglo
console.log(Array.isArray(autos)); //decuelve un booleano

console.log(autos instanceof Array); //preguntamos si la variable es una instancia de la clase array
