package Carrito.Estados;

import Carrito.Producto;

import java.util.List;

public interface CarritoState {
    public CarritoState agregarProducto(Producto producto);
    public CarritoState siguiente();
    public CarritoState volver();
    public CarritoState cancelarCarrito();

}
