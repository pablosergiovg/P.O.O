public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1,"Camila");
        Cuenta otraCuenta = new Cuenta(2,"Pablo",3000.0);

        cuenta.depositar(200.0);

        cuenta.depositar(500.0);

        otraCuenta.depositar(5000.0);

        cuenta.retirar(3000.0);

        cuenta.retirar(300.0);

        otraCuenta.retirar(8000.0);

        cuenta.setTitular("Nicolas");

        System.out.println(cuenta.getTitular());




    }
}