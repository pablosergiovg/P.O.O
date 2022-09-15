package Carrito.Estados;

import Carrito.Producto;
import Carrito.Carrito;

import java.util.List;

public class Vacio implements CarritoState {

    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public CarritoState agregarProducto(Producto producto) {
        carrito.getListaProductos().add(producto);
        return new Cargando(carrito);

        // return this;
    }

    @Override
    public CarritoState siguiente() {
        return new Cargando(carrito);
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
