/*clase abstracta de la que herederán los productos concretos*/
public abstract class Gaseosa {
    private  String nombre;

    public String getNombre(){
        return nombre;
    }

    /*método muestra mensaje concatenando el nombre de la gaseosa*/
    public void abrir(){
        System.out.println("Abriste una refrescante gaseosa de " + getNombre());
    }
}
