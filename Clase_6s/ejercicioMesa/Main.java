import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Perro fido = new Perro("Salchicha", 2015, 8.7, false, false, "Fido");

        fido.getEdad();
        fido.puedePerderse();
        fido.puedeSerAdoptado();
    }
}