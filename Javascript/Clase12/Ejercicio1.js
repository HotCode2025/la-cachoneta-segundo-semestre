// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)
function validatePassword(password) {
    const tieneLongitud = password.length >= 8;
    const tieneNumero = /[0-9]/.test(password);
    const tieneMayuscula = /[A-Z]/.test(password);

    return tieneLongitud && tieneNumero && tieneMayuscula;
}

console.log(validatePassword("Abc12345")); // true
console.log(validatePassword("weak"));     // false
