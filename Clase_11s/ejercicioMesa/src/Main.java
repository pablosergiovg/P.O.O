public class Main {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente(1000, "Viera",1234567,9999);

        /*CuentaCajaDeAhorro cuentaCA1 = new CuentaCajaDeAhorro(cliente1,20.0);

        cuentaCA1.depositar(300.0);

        System.out.println(cuentaCA1.getSaldo());

        Cliente cliente2 = new Cliente(1001, "Mejias",1234568,10000);

        CuentaCajaDeAhorro cuentaCA2 = new CuentaCajaDeAhorro(cliente1,20.0);

        cuentaCA2.depositar(3300.0);

        System.out.println(cuentaCA2.getSaldo());

        cuentaCA2.retirar(3000.0);

        cuentaCA2.cobrarIntereses();*/

        CuentaCorriente cuentaC1 = new CuentaCorriente(cliente1);

        cuentaC1.depositar(2000.0);

        System.out.println(cuentaC1.getSaldo());

        cuentaC1.retirar(2222.0);

        System.out.println(cuentaC1.getSaldo());



    }
}