import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //CREANDO ARTICULOS.
        Articulo articulo1 = new Articulo("papitas",199.9);
        Articulo articulo2 = new Articulo("coca-cola",99.9);
        Articulo articulo3 = new Articulo("nachos",249.9);
        Articulo articulo4 = new Articulo("salsa",49.9);


        //CREANDO CLIENTE 1.
        Cliente cliente1 = new Cliente("Pablo","099999999","Av. Uruguay");
        //PEDIDIO CLIENTE 1.
        Pedido pedido1 = new Pedido(cliente1);
        //AGREGANDO ARTICULOS A CLIENTE 1.
        pedido1.agregarArticulos(articulo1);
        pedido1.agregarArticulos(articulo2);


        //CREANDO CLIENTE 2.
        Cliente cliente2 = new Cliente("Daniela", "099999999", "Av. Uruguay");
        //PEDIDIO CLIENTE 2.
        Pedido pedido2 = new Pedido(cliente2);
        //AGREGANDO ARTICULOS A CLIENTE 2.
        pedido2.agregarArticulos(articulo1);
        pedido2.agregarArticulos(articulo2);
        pedido2.agregarArticulos(articulo3);
        pedido2.agregarArticulos(articulo4);


        //MOSTRANDO EN CONSOLA EL PEDIDO DEL CLIENTE 1.
        pedido1.facturarPedido();
        System.out.println("------------------------------");
        //MOSTRANDO EN CONSOLA EL PEDIDO DEL CLIENTE 1.
        pedido2.facturarPedido();

    }

}
