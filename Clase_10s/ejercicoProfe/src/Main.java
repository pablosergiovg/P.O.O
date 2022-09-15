import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Socio socio = new Socio("1","Tincho",2000.0,"Rugby");
        Socio otroSocio = new Socio("1","Tincho",2000.0,"Rugby");

        System.out.println(socio.calcularCostoMensual());

        SocioPileta socioPileta = new SocioPileta("2","Mili",1500.0,"Hockey",700.0);

        System.out.println(socioPileta.calcularCostoMensual());

        System.out.println(socio.equals(otroSocio));

        System.out.println(socio.hashCode());
        System.out.println(otroSocio.hashCode());





    }
}