class Cliente extends Persona{
    
    static contadorClientes = 0;

    constructor(nombre,apellido,edad,fechaRegistro){
        super(nombre,apellido,edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaRegistro = fechaRegistro;
    }

get idCliente(){
    return this._idCliente;
}

set fechaRegistro(fechaRegistro){
    this._fechaRegistro = fechaRegistro;
}

toString(){
    return super.toString()+" "+this._idCliente+" "+this._fechaRegistro;
}



}