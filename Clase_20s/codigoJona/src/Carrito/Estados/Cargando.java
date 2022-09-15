package Carrito.Estados;

import Carrito.Carrito;
import Carrito.Producto;

import java.util.List;

public class Cargando implements CarritoState {

    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public CarritoState agregarProducto(Producto producto) {
        carrito.getListaProductos().add(producto);
        return this;
    }

    @Override
    public CarritoState siguiente() {
        return new Pagando(carrito);
    }

    @Override
    public CarritoState volver() {
        return this.cancelarCarrito();
    }

    @Override
    public CarritoState cancelarCarrito() {
        carrito.getListaProductos().clear();
        return new Vacio(carrito);
    }
}
