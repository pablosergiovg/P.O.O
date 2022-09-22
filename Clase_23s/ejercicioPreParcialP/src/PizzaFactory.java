public class PizzaFactory{

    private static PizzaFactory instance;

    private PizzaFactory(){

    }

    public static PizzaFactory getInstance() {
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;

    }

    public Pizza crearPizza(String codigo){

        switch (codigo){
            case "PMC":
                return new PizzaSimple("Pizza Muzzarella Chica", "la peque Muzza", 700.0, false);

            case "PEC":
                return new PizzaSimple("Pizza Especial Chica", "no se sabe con que viene", 850.0,false);

            case "PAC":
                return new PizzaSimple("Pizza con Ananá", "la mas querida y odiada", 950.0,false);

            case "COMBINADA":
                PizzaCombinada locaCombinada = new PizzaCombinada("Loca", "mitad especial, mitad ananá");
                locaCombinada.agregarPizza(crearPizza("PEC"));
                locaCombinada.agregarPizza(crearPizza("PAC"));
                return locaCombinada;
        }
        return null;

    }

}
