import java.util.List;

public class Vacio implements CarritoState{

    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    public void agregarProducto(Producto producto){
        carrito.getListaProducto().add(producto);
    }

    @Override
    public CarritoState vacioCarrito() {
        return this;
    }

    @Override
    public CarritoState cargadoCarrito(List lista) {
        agregarProducto(new Producto(), lista);
    }

    @Override
    public CarritoState pagandoCarrito() {
        return null;
    }

    @Override
    public CarritoState cerrandoCarrito() {
        return null;
    }


}
