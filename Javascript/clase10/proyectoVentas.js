class Orden {
  static contadorOrdenes = 0;

  static get MAX_PRODUCTOS() {
    return 5;
  }

  constructor() {
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
    this.contadorProductosAgregados = 0;
  }

  agregarProducto(producto) {
    if (this._productos.length < Orden.MAX_PRODUCTOS) {
      this._productos.push(producto);
      this.contadorProductosAgregados++;
    } else {
      console.log("Ya se alcanzaron los productos al maximo");
    }
  }

  calcularTotal() {
    let total = 0;
    for (let producto of this._productos) {
      total += producto.precio;
    }
    return total;
  }

  mostrarOrden() {
    console.log(
      `Orden N° ${
        this._idOrden
      }, Total: $${this.calcularTotal()}, Cantidad de productos: ${
        this.contadorProductosAgregados
      }`
    );
      for (let producto of this._productos) {
      console.log(producto.toString());
    }
  }
}

class Producto {
  static contadorProductos = 0;

  constructor(nombre, precio) {
    this._nombre = nombre;
    this._precio = precio;
    this._idProducto = ++Producto.contadorProductos;
  }

  get idProducto() {
    return this._idProducto;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get precio() {
    return this._precio;
  }

  set precio(precio) {
    this._precio = precio;
  }

  toString() {
    return (
      "Producto " +
      this._idProducto +
      ": " +
      this.nombre +
      ", precio: $" +
      this.precio +
      " "
    );
  }
}

/* prod1 = new Producto("casco", 5000);
console.log(prod1.toString());
prod1.nombre = "alfajor";
prod1.precio = 3500;
console.log(prod1.toString());

prod2 = new Producto("casco gris", 6000);
console.log(prod2.toString());
prod2.nombre = "chupetines";
prod2.precio = 3000;
console.log(prod2.toString()); */

const producto1 = new Producto("Mouse", 2500);
const producto2 = new Producto("Teclado", 5000);
const producto3 = new Producto("Monitor", 15000);

const orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

orden1.mostrarOrden();
