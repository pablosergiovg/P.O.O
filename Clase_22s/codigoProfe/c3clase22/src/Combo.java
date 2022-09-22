import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecio = 0.0;
        System.out.println("encontre un combo");
        for (Comprable comprable : comprableList){
            sumaPrecio += comprable.calcularPrecio();
        }
        Double precioFinal = sumaPrecio - sumaPrecio * descuento;
        System.out.println("el precio con descuento de el combo es de " + precioFinal);

        return precioFinal;
    }
}
