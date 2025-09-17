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


console.log("comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad); 
console.log("comenzamos con el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);