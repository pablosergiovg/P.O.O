import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Impresora impresora = new Impresora("HP","USB","27/04/1993");

        impresora.agregarHojas(5);
        impresora.imprimir("hola");
        impresora.imprimir("chau",10);
        
    }
}