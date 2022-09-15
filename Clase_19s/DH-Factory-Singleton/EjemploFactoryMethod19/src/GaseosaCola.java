/*Clase del producto concreto que hereda de la abstracta*/
public class GaseosaCola extends Gaseosa {
    String nombre = "Coca Cool";

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void abrir() {
        super.abrir();
    }
}
