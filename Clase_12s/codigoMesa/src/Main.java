public class Main {


    public static void main(String[] args) {

        Cuenta cuenta = new CuentaCajaDeAhorro(new Cliente(1,"Agustin"),1000.0,0.1);

     //   cuenta = new CuentaCorriente(new Cliente(1,"Agustin"),1000.0,500.0);

        CuentaCajaDeAhorro cuentaCajaDeAhorro = (CuentaCajaDeAhorro) cuenta;

        cuenta.informarSaldo();

        CuentaComitente cuentaComitente = new CuentaComitente(new Cliente(1234, "Pablo"), 2000.0,"asdf");

        cuentaComitente.depositar(100.0);

        cuentaComitente.informarSaldo();



    }
}