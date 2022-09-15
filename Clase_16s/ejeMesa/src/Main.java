import javax.xml.crypto.KeySelector;

public class Main {
    public static void main(String[] args) {

        Puerto puerto = new Puerto();

        Contenedor contenedor1 = new Contenedor(20, "GRECIA", true);
        Contenedor contenedor2 = new Contenedor(243, "DESCONOCIDA", true);
        Contenedor contenedor3 = new Contenedor(2, "NORUEGA", true);
        Contenedor contenedor4 = new Contenedor(65, "ARGENTINA", false);
        Contenedor contenedor5 = new Contenedor(154, "CHINA", true);

        puerto.agregarContenedores(contenedor1);
        puerto.agregarContenedores(contenedor2);
        puerto.agregarContenedores(contenedor3);
        puerto.agregarContenedores(contenedor4);
        puerto.agregarContenedores(contenedor5);

        System.out.println(puerto.contarContenedoresPeligrosos());

        puerto.ordenarContenedores();


    }
}