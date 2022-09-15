public class Main {
    public static void main(String[] args) {


        try{
            Estacion estacion = new Estacion();
            Empresa empresa = new Empresa();


            Recorrido recorrido1 = new Recorrido("Buenos Aires","Mercedes",estacion);
            Recorrido recorrido2 = new Recorrido("Luján","Bragado",estacion);
            Recorrido recorrido3 = new Recorrido("Buenos Aires","Bragado",estacion);



            Reserva reserva1 = new Reserva(1,recorrido1,1);
            Reserva reserva2 = new Reserva(2,recorrido2,1);
            Reserva reserva3 = new Reserva(3,recorrido3,1);


            empresa.agregarReserva(reserva1);
            empresa.agregarReserva(reserva2);
            empresa.agregarReserva(reserva3);


            System.out.println(reserva1.precioReserva());
            System.out.println(reserva2.precioReserva());
            System.out.println(reserva3.precioReserva());


            System.out.println("TOTAL:");
            System.out.println(empresa.recaudacionTotal());
            System.out.println("///////////////////////////");

//            System.out.println(estacion.getEstaciones());
            System.out.println("VECES RECORRIDA:");
            System.out.println(empresa.cantVecesRecorrida("Buenos Aires"));
            System.out.println("///////////////////////////");

            System.out.println("ANTES DE GREGAR 2 CIUDADES");
            System.out.println(empresa.recaudacionTotal());
            System.out.println("///////////////////////////");

            estacion.agregarEstacion("Montevideo", 0);
            estacion.agregarEstacion("Salto", 0);
//            System.out.println(estacion.getEstaciones());

            System.out.println("DESPUES DE AGREGAR 2 CIUDADES");
            System.out.println(empresa.recaudacionTotal());
            System.out.println("///////////////////////////");

            Recorrido recorrido5 = new Recorrido("Salto", "Buenos Aires",estacion);
            Reserva reserva5 = new Reserva(6,recorrido5,1);
            empresa.agregarReserva(reserva5);
            System.out.println(reserva5.precioReserva());


//            System.out.println(estacion.getEstaciones());

            System.out.println(empresa.recaudacionTotal());

        }catch (RecorridoException e){
            e.printStackTrace();
        }catch (EmpresaException e){
            e.printStackTrace();
        }



    }
}