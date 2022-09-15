import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Cuenta cuenta = new CuentaCajaDeAhorro(new Cliente(1,"Agustin"),1000.0,0.1);

     //   cuenta = new CuentaCorriente(new Cliente(1,"Agustin"),1000.0,500.0);

        CuentaCajaDeAhorro cuentaCajaDeAhorro = (CuentaCajaDeAhorro) cuenta;


        //   cuenta.informarSaldo();


        Cliente cliente1 = new Cliente(1,"Pablo");
        Cliente cliente2 = new Cliente(300,"Rodrigo");
        Cliente cliente3 = new Cliente(8,"Damian");

        System.out.println(cliente1.compareTo(cliente3));
        System.out.println(cliente3.compareTo(cliente1));

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);

        System.out.println(clienteList);
        clienteList.sort(null);
        System.out.println(clienteList);


    }
}