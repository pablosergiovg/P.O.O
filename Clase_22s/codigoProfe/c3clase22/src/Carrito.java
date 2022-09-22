import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> comprableList;

    public Carrito() {
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }

    public Double calcularPrecioTotal(){
        Double precioTotal = 0.0;
        for (Comprable comprable : comprableList) {
            precioTotal += comprable.calcularPrecio();
        }

        return precioTotal;
    }
}
