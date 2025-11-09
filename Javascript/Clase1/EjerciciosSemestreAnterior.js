// Ejercicio 1: Imprimir en pantalla los números del 1 al 10 (en columna)
let numero1 = 1;

while (numero1 <= 10) {
  console.log(numero1);
  numero1++;
}

// ----------------------------------------------------------------------------------------------------

// Ejercicio 2: Imprimir en pantalla los números del 1 al 10 (en fila y con saltos de línea)
for (let i = 1; i <= 10; i++) {
  console.log(i);
}

// ----------------------------------------------------------------------------------------------------

// Ejercicio 3: Calcular el promedio y la calificación más baja de un grupo de 10 estudiantes
let calificaciones = [8, 7, 9, 6, 5, 10, 4, 3, 2, 1];
let sumaCalif = 0;
let calificacionBaja = calificaciones[0];

for (let i = 0; i < calificaciones.length; i++) {
  if (calificaciones[i] < calificacionBaja) {
    calificacionBaja = calificaciones[i];
  }
  sumaCalif += calificaciones[i];
}

let promedioCalif = sumaCalif / calificaciones.length;

console.log("El promedio de las calificaciones es: " + promedioCalif);
console.log("La calificación más baja es: " + calificacionBaja);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 4: Calcular el salario y la sumatoria de todos los salarios
let horas = [40, 35, 45, 50, 30];
let tarifa = 15; // Tarifa de pago por hora
let sumaSalarios = 0;

for (let i = 0; i < horas.length; i++) {
  let salario = horas[i] * tarifa;
  console.log(`Salario de la persona ${i + 1}: $${salario}`);
  sumaSalarios += salario;
}

console.log(`La sumatoria de todos los salarios es: $${sumaSalarios}`);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 5: Calcular la suma de N términos de la serie: 1 - 1/2 + 1/3 - 1/4 + 1/5 ...
let n1 = 7;
let suma1 = 0;
let signo = 1;
let i1 = 1;

while (i1 <= n1) {
  suma1 = suma1 + signo / i1;
  signo = signo * -1;
  i1++;
}

console.log("El resultado es: " + suma1);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 6: Ingresar N números, calcular el máximo y mínimo
let numeros2 = [15, 8, 2, 60, 10, 3, 50];
let contador2 = 1;
let mayor2 = numeros2[0];
let menor2 = numeros2[0];

while (contador2 < numeros2.length) {
  let numero2 = numeros2[contador2];

  if (numero2 > mayor2) {
    mayor2 = numero2;
  }
  if (numero2 < menor2) {
    menor2 = numero2;
  }
  contador2++;
}

console.log("El mayor de los números ingresados es: " + mayor2);
console.log("El menor de los números ingresados es: " + menor2);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 7: Imprimir del 1 al 10 en pantalla (en columna) con do...while
let i2 = 1;
do {
  console.log(i2);
  i2++;
} while (i2 <= 10);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 8: Determinar si un año es bisiesto (repetir hasta que el usuario decida cancelar)
let respuesta;
do {
  let anio = parseInt(prompt("Ingrese un año y le diré si es bisiesto o no:"));

  if ((anio % 4 === 0 && anio % 100 !== 0) || anio % 400 === 0) {
    console.log(`El año ${anio} es bisiesto`);
  } else {
    console.log(`El año ${anio} no es bisiesto`);
  }

  respuesta = prompt("¿Desea continuar? (si/no)");
} while (respuesta && respuesta.toLowerCase() === "si");

console.log("Gracias por participar!");

// ----------------------------------------------------------------------------------------------------

// Ejercicio 9: Ingresar N números, calcular el máximo y mínimo (versión con prompt)
let n_elementos;
do {
  n_elementos = parseInt(prompt("Digite el número de elementos:"));
} while (n_elementos <= 0);

let num = parseFloat(prompt("1. Digite un número:"));
let mayor = num;
let menor = num;

let i3 = 2;

do {
  num = parseFloat(prompt(i3 + ". Digite un número:"));
  if (num > mayor) mayor = num;
  if (num < menor) menor = num;
  i3++;
} while (i3 <= n_elementos);

console.log("El mayor de los números ingresados es: " + mayor);
console.log("El menor de los números ingresados es: " + menor);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 10: Calcular sumatoria con factorial y potencia
let numero3 = 5;
let numerox = 2;
let suma3 = 1;
let i4 = 1;

while (i4 <= numero3) {
  let factorial = 1;
  let m = 1;
  while (m <= i4) {
    factorial *= m;
    m++;
  }

  let potencia = 1;
  let n = 0;
  while (n < i4) {
    potencia *= numerox;
    n++;
  }

  suma3 += potencia / factorial;
  i4++;
}

console.log("Resultado de la sumatoria: " + suma3);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 11: Factorial con while y do...while
let n2 = 5;

// usando while
let i5 = 1;
let factorialWhile = 1;

while (i5 <= n2) {
  factorialWhile *= i5;
  i5++;
}

// usando do...while
let j = 1;
let factorialDoWhile = 1;

if (n2 === 0) {
  factorialDoWhile = 1;
} else {
  do {
    factorialDoWhile *= j;
    j++;
  } while (j <= n2);
}

console.log("Número:", n2);
console.log("Factorial con while:", factorialWhile);
console.log("Factorial con do...while:", factorialDoWhile);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 12: Imprimir números del 10 al 1 (en fila y con saltos de línea)
let numero4 = 10;
while (numero4 >= 1) {
  console.log(numero4);
  numero4--;
}

// ----------------------------------------------------------------------------------------------------

// Ejercicio 13: Ingresar N números - sumar pares, contar pares y promediar impares
let numeros = [3, 8, 5, 12, 7, 4];
let N = numeros.length;

let sumaPares = 0;
let cantidadPares = 0;
let sumaImpares = 0;
let cantidadImpares = 0;

for (let i = 0; i < N; i++) {
  let num = numeros[i];
  if (num % 2 === 0) {
    sumaPares += num;
    cantidadPares++;
  } else {
    sumaImpares += num;
    cantidadImpares++;
  }
}

let promedioImpares = cantidadImpares > 0 ? sumaImpares / cantidadImpares : 0;

console.log("Suma de pares:", sumaPares);
console.log("Cantidad de pares:", cantidadPares);
console.log("Promedio de impares:", promedioImpares);

// ----------------------------------------------------------------------------------------------------

// Ejercicio 14: Calcular sumatoria de N elementos (S = 1 + 4 + 9 + ... + N²)
let N2 = 5; // Cambiar este número para probar
let sumatoria = 0;
let contador = 1;

while (contador <= N2) {
  sumatoria += contador * contador;
  contador++;
}

console.log("La sumatoria de los " + N2 + " primeros números es: " + sumatoria);
