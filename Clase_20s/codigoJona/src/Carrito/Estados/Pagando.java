package Carrito.Estados;

import Carrito.Carrito;
import Carrito.Producto;

import java.util.List;

public class Pagando implements CarritoState {

    private Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public CarritoState agregarProducto(Producto producto) {
        return this;
    }

    @Override
    public CarritoState siguiente() {
        return new Cerrado(carrito);
    }

    @Override
    public CarritoState volver() {
        return new Cargando(carrito);
    }

    @Override
    public CarritoState cancelarCarrito() {
        carrito.getListaProductos().clear();
        return new Vacio(carrito);
    }
}
