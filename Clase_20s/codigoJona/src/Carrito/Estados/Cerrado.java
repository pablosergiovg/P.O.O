package Carrito.Estados;

import Carrito.Carrito;
import Carrito.Producto;

public class Cerrado implements CarritoState {

    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public CarritoState agregarProducto(Producto producto) {
        return this;
    }

    @Override
    public CarritoState siguiente() {
        carrito.getListaProductos().clear();
        return new Vacio(carrito);
    }

    @Override
    public CarritoState volver() {
        return this;
    }

    @Override
    public CarritoState cancelarCarrito() {
        return this;
    }
}
