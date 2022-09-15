import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productoList;

    public Almacen() {
        productoList = new ArrayList<>();
    }

    public void  agregarProducto(Producto producto){
        productoList.add(producto);
    }

    public Double calcularEspacioNecesario(){

        Double espacioNecesario = 0.0;

        for (Producto producto : productoList) {
            espacioNecesario += producto.calcularEspacio();
        }

        return espacioNecesario;
    }
}
