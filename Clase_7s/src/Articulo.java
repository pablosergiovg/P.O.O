import com.sun.source.tree.ReturnTree;

public class Articulo {

    private String nombre;
    private Double precio;

    public Articulo(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarArticulo(){
        System.out.println(nombre + "   $" + precio);
    }

    public Double getPrecio(){
        return precio;
    }

}
