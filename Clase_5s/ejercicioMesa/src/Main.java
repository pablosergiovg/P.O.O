public class Main {
    public static void main(String[] args) {

        UsuarioJuego usuario1 = new UsuarioJuego("Rocky","4834" );

        usuario1.aumentarPuntaje();
        usuario1.subirNivel();
        usuario1.bonus(2.5);

        System.out.println(usuario1.mostrarPuntaje());

    }
}