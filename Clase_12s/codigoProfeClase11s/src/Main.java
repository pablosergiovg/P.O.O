public class Main {


    public static void main(String[] args) {

        Cuenta cuenta = new CuentaCajaDeAhorro(new Cliente(1,"Agustin"),1000.0,0.1);

     //   cuenta = new CuentaCorriente(new Cliente(1,"Agustin"),1000.0,500.0);

        CuentaCajaDeAhorro cuentaCajaDeAhorro = (CuentaCajaDeAhorro) cuenta;


        cuenta.informarSaldo();
    }
}