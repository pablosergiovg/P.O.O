public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa", 300.0);
        Producto papaFrita = new Producto("Papa Frita", 180.0);
        Producto gaseosa = new Producto("Gaseosa", 70.0);
        Producto helado = new Producto("Helado", 150.0);


        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papaFrita);
        combo1.agregarComprable(gaseosa);


        Combo combo2 = new Combo(0.20);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(combo1);

        Combo combo3 = new Combo(0.25);
        combo3.agregarComprable(combo1);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(combo2);

        Carrito carrito = new Carrito();
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(combo2);
        carrito.agregarComprable(combo3);

        System.out.println(carrito.calcularPrecioTotal());
    }
}