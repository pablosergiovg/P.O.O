public class Main {

    public static void main(String[] args) {


        //creando un auto:
        Auto auto1 = new Auto("SHN-325", "Honda", "Civic");

        //creando un chofer:
        Chofer chofer1 = new Chofer("Pablo", "Viera", new Auto("SKZ-871", "Renault", "19"));

        //creando otro chofer con un auto ya creado:
        Chofer chofer2 = new Chofer("Daniela", "Mejias", auto1);


        System.out.println("El numero de patente de " + chofer1.verNombreApellidoDelChofer() + " es " + chofer1.verPatente());
        System.out.println(chofer1.verChoferConPatente());
        System.out.println(chofer2.verChoferConPatente());

    }

}
