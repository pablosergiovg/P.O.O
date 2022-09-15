import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

    private DateTimeFormatter fechaPedido;
    private Cliente cliente;
    private Integer codigo;
    private Integer numeroDeArticulo;
    private Articulo[] articulo;
    private Double precioTotal;


    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.numeroDeArticulo = 0;
        this.articulo = new Articulo[20];

    }

    public void agregarArticulos(Articulo Articulo){
        if(numeroDeArticulo <= 20){
            articulo[numeroDeArticulo] = Articulo;
            numeroDeArticulo++;
        }
    }

    public void facturarPedido(){
        fechaPedido = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println("Fecha: " + fechaPedido.format(LocalDateTime.now()));
        codigo = numeroDeArticulo;
        System.out.println("Codigo de compra: CO-" + codigo * 3);
        cliente.mostrarCliente();
        System.out.println(numeroDeArticulo + " articulos.");
        precioTotal = Double.valueOf(0);
        for (int i = 0; i < numeroDeArticulo; i++) {
            articulo[i].mostrarArticulo();
            precioTotal += articulo[i].getPrecio();
        }
        System.out.println("Total a pagar: $" + precioTotal);
    }




}
