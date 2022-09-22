public class PizzaSimple extends Pizza{

    private Double precioBase;
    private Boolean grande;

    public PizzaSimple(String nombre, String descripcion, Double precioBase, Boolean grande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.grande = grande;
    }

    @Override
    public Double calcularPrecio() {

        if(grande){
            return precioBase*2;
        }
        return precioBase;
    }
}
