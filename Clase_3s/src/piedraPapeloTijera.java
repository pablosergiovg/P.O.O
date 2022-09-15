import java.util.Objects;
import java.util.Scanner;

public class piedraPapeloTijera {

    /*Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    cuando el primero elije “*” como indicador de final.*/

    public static void main(String[] args) {

        //creando el scanner.
        Scanner scanner = new Scanner(System.in);

        //mensaje inicial.
        System.out.println("Juguemos piedra, papel ó tijera:");

        //pidiendo nombre al primer jugador.
        System.out.println("Nombre Jugador 1: ");
        String jugador1 = scanner.nextLine();

        //pidiendo nombre al segundo jugador.
        System.out.println("Nombre Jugador 2: ");
        String jugador2 = scanner.nextLine();
        
        //llamando al metodo cualGana().
        System.out.println(cualGana(jugador1, jugador2));

    }

    public static String cualGana(String jugadorUno, String jugadorDos){

        //creando scanner para metodo cualGana
        Scanner scanner = new Scanner(System.in);

        //contador de rondas
        int rondasJugadas = 1;

        //acumulador de puntaje de los jugadores
        int puntajeJugadorUno = 0;
        int puntajeJugadorDos = 0;

        //jugadas por turnos de los jugadores
        String jugadaJugadorUno = null;
        String jugadaJugadorDos = null;

        /*---------------------------- JUEGO ------------------------------------------------*/

        //bucle infinito hasta que el jugador coloque '*'
        while (!Objects.equals(jugadaJugadorUno, "*")) {

            //aviso de rondas.
            System.out.println("Ronda numero " + rondasJugadas + ":");

            //TURNO JUGADOR 1 mientras coloque lo que dice el while.
            do {

                System.out.println("Turno de: " + jugadorUno + ", si deseas finalizar el juego coloca '*'"); //avisando a quien le toca.
                System.out.println("elije: piedra, papel, tijera o spock"); //opciones a elegir.
                jugadaJugadorUno = scanner.nextLine(); //guardando texto ingresado en variable

                //EL JUGADOR 1 CUANDO COLOCA '*' SE TERMINA LA PARTIDA.
                if (jugadaJugadorUno.equals("*")) {
                    //llamando al metodo que define el ganador.
                    definiendoElGanador(jugadorUno, jugadorDos, puntajeJugadorUno, puntajeJugadorDos, rondasJugadas);
                    return "fin del juego";
                }

            }while(!jugadaJugadorUno.equals("piedra") &&
                    !jugadaJugadorUno.equals("papel") &&
                    !jugadaJugadorUno.equals("tijera") &&
                    !jugadaJugadorUno.equals("spock"));

            //TURNO JUGADOR 2 mientras coloque lo que dice el while.
            do {

                System.out.println("Turno de: " + jugadorDos); //avisando a quien le toca.
                System.out.println("elije: piedra, papel, tijera o spock"); //opciones a elegir.
                jugadaJugadorDos = scanner.nextLine(); //guardando texto ingresado en variable

            }while(!jugadaJugadorDos.equals("piedra") &&
                    !jugadaJugadorDos.equals("papel") &&
                    !jugadaJugadorDos.equals("tijera") &&
                    !jugadaJugadorDos.equals("spock"));


        /*---------------------COMPARA RONDAS-------------------------------------------------------------------------------*/


            //COMPARADOR DE CADA RONDA.
            if (jugadaJugadorUno.equals(jugadaJugadorDos)){
                System.out.println("0");
            }else if(jugadaJugadorUno.equals("piedra") && jugadaJugadorDos.equals("tijera") ||
                    jugadaJugadorUno.equals("papel") && jugadaJugadorDos.equals("piedra") ||
                    jugadaJugadorUno.equals("tijera") && jugadaJugadorDos.equals("papel") ||
                    jugadaJugadorUno.equals("papel") && jugadaJugadorDos.equals("spock") ||
                    jugadaJugadorUno.equals("spock") && jugadaJugadorDos.equals("tijera") ||
                    jugadaJugadorUno.equals("spock") && jugadaJugadorDos.equals("piedra")){
                System.out.println("1");
                puntajeJugadorUno ++; //adjudica 1 punto al jugador uno.
            }else{
                System.out.println("2");
                puntajeJugadorDos ++; //adjudica 1 punto al jugador dos.
            }
            rondasJugadas ++; //agregando una ronda antes reiniciar el while.

        }
        return "fin del juego";

    }


    //metodo para definir el ganador.
    public static void definiendoElGanador(String jugadorUno, String jugadorDos, Integer puntajeJugadorUno, Integer puntajeJugadorDos, Integer rondasJugadas){

        if(puntajeJugadorUno > puntajeJugadorDos) {
            rondasJugadas--;//elimino la ronda que el jugador 1 coloco '*'.
            System.out.println("Gano " + jugadorUno + "! " + puntajeJugadorUno +
                    " a " + puntajeJugadorDos + " puntos en " + rondasJugadas + " rondas.");
        } else if (puntajeJugadorUno < puntajeJugadorDos) {
            rondasJugadas--;
            System.out.println("Gano " + jugadorDos + "! " + puntajeJugadorDos +
                    " a " + puntajeJugadorUno + " puntos en " + rondasJugadas + " rondas.");
        }else{
            rondasJugadas--;
            System.out.println("Empataron! a " + puntajeJugadorUno + " puntos en " + rondasJugadas + " rondas.");
        }
    }

}