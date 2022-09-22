public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria("PIZZA LOCA");
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();

        pizzeria.agregarPizza("PMC");
        pizzeria.agregarPizza("PEC");
        pizzeria.agregarPizza("PAC");
        pizzeria.agregarPizza("COMBINADA");

        pizzeria.mostrarPizza();

    }
}