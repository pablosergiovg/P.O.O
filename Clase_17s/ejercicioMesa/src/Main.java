public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Manuel", "Godoy", "1234567", 1000.0);

        cliente1.comprar(100.0);

        try {
            cliente1.saldarDeuda(5.0);
        } catch (ClienteException e){
            e.printStackTrace();
        }
    }
}
