import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> listaPizzas;
    private String nombre;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        listaPizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigo){
        listaPizzas.add(PizzaFactory.getInstance().crearPizza(codigo));
    }

    public void mostrarPizza(){
        for (Pizza pizza : listaPizzas) {
            System.out.println(pizza.toString());
        }
    }



}
