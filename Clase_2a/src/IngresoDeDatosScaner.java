import java.util.Scanner;

public class IngresoDeDatosScaner {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        //SIN GUARDAR EN VARIABLE
        System.out.println("Ingrese su nombre");
        scanner.nextLine();


        //GUARDAR EN VARIABLE
        String nombre;
        Integer edad;
        Float NumeroPi;
        char letraInicial;

        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        System.out.println("Ingrese el numero PI");
        NumeroPi = scanner.nextFloat();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(NumeroPi);

        letraInicial = nombre.charAt(0);
        System.out.println(letraInicial);


    }


}
