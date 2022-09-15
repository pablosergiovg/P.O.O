import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Estacion estacion = new Estacion();
            List<Reserva> listReserva1 = new ArrayList<>();
            Empresa empresa1 = new Empresa(listReserva1);

            Recorrido recorrido1 = new Recorrido("Buenos Aires", "Bragado", estacion);
            Recorrido recorrido2 = new Recorrido("Luján", "Bragado", estacion);
            Recorrido recorrido3 = new Recorrido("Bragado", "Luján", estacion);
            Reserva reserva1 = new Reserva("Probando", recorrido1, 1 );
            Reserva reserva2 = new Reserva("Probando", recorrido2, 1 );
            Reserva reserva3 = new Reserva("Probando", recorrido3, 1 );

            listReserva1.add(reserva1);
            listReserva1.add(reserva2);
            listReserva1.add(reserva3);

            System.out.println(reserva1.calcularPrecio());
            System.out.println(reserva2.calcularPrecio());
            System.out.println(reserva3.calcularPrecio());

            System.out.println(empresa1.recaudacionTotal());

            estacion.agregarEstacion("Solis", 0);

            System.out.println(empresa1.recaudacionTotal());



        }
        catch (RecorridoException e){
            e.printStackTrace();
        }















//
//        Recorrido recorrido4 = new Recorrido("Buenos Aires", "Suipacha");
//        Recorrido recorrido5 = new Recorrido("Bragado", "Buenos Aires");
//        Recorrido recorrido6 = new Recorrido("Alberti", "Luján");
//
//        Recorrido recorrido7 = new Recorrido("Mercedes", "Suipacha");
//        Recorrido recorrido8 = new Recorrido("Montevideo", "Chivilcoy");
//        Recorrido recorrido9 = new Recorrido("Bragado", "Luján");
//
//
//
//
//        Reserva reserva4 = new Reserva("Probando", recorrido4, 10 );
//        Reserva reserva5 = new Reserva("Probando", recorrido5, 11 );
//        Reserva reserva6 = new Reserva("Probando", recorrido6, 5 );
//
//        Reserva reserva7 = new Reserva("Probando", recorrido7, 10 );
//        Reserva reserva8 = new Reserva("Probando", recorrido8, 11 );
//        Reserva reserva9 = new Reserva("Probando", recorrido9, 5 );
//
//
//        List<Reserva> listReserva2 = new ArrayList<>();
//        listReserva2.add(reserva4);
//        listReserva2.add(reserva5);
//        listReserva2.add(reserva6);
//        List<Reserva> listReserva3 = new ArrayList<>();
//        listReserva3.add(reserva7);
//        listReserva3.add(reserva8);
//        listReserva3.add(reserva9);
//
//
//        Empresa empresa2 = new Empresa(listReserva2);
//        Empresa empresa3 = new Empresa(listReserva3);





    }
}