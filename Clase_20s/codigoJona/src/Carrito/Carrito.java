package Carrito;

import Carrito.Estados.CarritoState;
import Carrito.Estados.Vacio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private CarritoState estadoActual;
    private List<Producto> listaProductos;

    public Carrito() {
        this.estadoActual = new Vacio(this);
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        estadoActual = estadoActual.agregarProducto(producto);
    }

    public void siguiente() {
        estadoActual = estadoActual.siguiente();
    }

    public void volver() {
        estadoActual = estadoActual.volver();
    }

    public void cancelarCarrito() {
        estadoActual = estadoActual.cancelarCarrito();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void mostrarLista() {
        listaProductos.forEach(producto -> System.out.println(producto.getDescripcion() + " - " + producto.getPrecio()));
    }

    public void mostrarEstado() {
        System.out.println(estadoActual.toString());
    }
}
