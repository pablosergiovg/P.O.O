public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Sacachispas");

        

        equipo.agregarJugador(new Jugador(10,"Pablo Viera",true,false));
        equipo.agregarJugador(new Jugador(2,"Rodri Brause",true,true));
        equipo.agregarJugador(new Jugador(1,"Agustin Ferres",true,false));
        equipo.agregarJugador(new Jugador(9,"Camila Agostini",false,true));
        equipo.agregarJugador(new Jugador(5,"Rodri Benitez",true,false));

        System.out.println(equipo.cantidadTitularesLesionados());

        equipo.mostrarJugadoresTitulares();



    }
}