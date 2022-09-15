import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> listaProducto;

    private CarritoState estadoCarrito;

    public Carrito() {
        listaProducto = new ArrayList<>();
        estadoCarrito = new Vacio(this);
    }

    public void vaciarCarrito(){
        estadoCarrito = estadoCarrito.vacioCarrito();
    }

    public void agregarProductoCarrito(){
        estadoCarrito = estadoCarrito.cargadoCarrito();
    }

    public void pagarCarrito(){
        estadoCarrito = estadoCarrito.pagandoCarrito();
    }

    public void cerrarCarrito(){
        estadoCarrito = estadoCarrito.cerrandoCarrito();
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void agregarProducto(Producto producto){
        estadoCarrito = estadoCarrito.
    }

}
