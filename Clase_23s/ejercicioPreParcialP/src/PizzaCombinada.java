import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> listaPizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        listaPizzas = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double precio = 0.0;
        for (Pizza pizza : listaPizzas) {
            precio += pizza.calcularPrecio();
        }
        return precio / listaPizzas.size();
    }

    public void agregarPizza(Pizza pizza){
        listaPizzas.add(pizza);
    }

}
