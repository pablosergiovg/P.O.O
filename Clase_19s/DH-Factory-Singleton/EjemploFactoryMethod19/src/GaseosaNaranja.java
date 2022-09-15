/*Clase del producto concreto que hereda de la abstracta*/
public class GaseosaNaranja extends Gaseosa{
    String nombre = "Naranja dulce";

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void abrir() {
        super.abrir();
    }
}
