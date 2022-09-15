import Carrito.Carrito;
import Carrito.Producto;

public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        carrito.mostrarEstado();

        carrito.agregarProducto(new Producto("Papa", 50.0));
        carrito.agregarProducto(new Producto("Lechuga", 50.0));
        carrito.agregarProducto(new Producto("Boñato", 50.0));

        carrito.mostrarEstado();

        carrito.mostrarLista();

        carrito.siguiente();

        carrito.mostrarEstado();

        carrito.siguiente();

        carrito.mostrarEstado();

        carrito.siguiente();

        carrito.mostrarEstado();

        carrito.mostrarLista();

    }
}