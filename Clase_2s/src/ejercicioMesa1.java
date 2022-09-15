import java.util.Scanner;
import java.util.function.IntToLongFunction;

public class ejercicioMesa1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numeroIngresado = scanner.nextInt();

        System.out.println(esPrimo(numeroIngresado));

        System.out.println("Ingrese un numero entero A");
        int numeroIngresadoA = scanner.nextInt();

        System.out.println("Ingrese un numero entero B");
        int numeroIngresadoB = scanner.nextInt();

        System.out.println("Ingrese un numero entero C");
        int numeroIngresadoC = scanner.nextInt();

        System.out.println(maximoEntreTresNumeros(numeroIngresadoA, numeroIngresadoB,numeroIngresadoC));

        System.out.println("Ingrese texto 1");
        String parametro1 = scanner.nextLine();

        System.out.println("Ingrese texto 2");
        String parametro2 = scanner.nextLine();

        System.out.println(cadenasDeTextoDistintas(parametro1, parametro2));

    }

    public static Boolean esPrimo(Integer numero) {

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC){
        int max = unNumeroA;

        if(max < unNumeroB){
            max = unNumeroB;
        }
        if(max < unNumeroC){
            max = unNumeroC;
        }

        return max;
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return unTextoA.equals(unTextoB);
    }

}