console.log(typeof miFuncion);  // function

function miFuncionDos(a, b){
    console.log(arguments.length);  // 4
}

miFuncionDos(5, 3, 6);

// toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);  // ...ionDos(a, b) { var $_c = $_$wff(); $_w(1, 12, $...