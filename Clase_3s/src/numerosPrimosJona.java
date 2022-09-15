import java.util.Scanner;

public class numerosPrimosJona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros primos que desea ver");
        Integer cantidadDePrimos = scanner.nextInt();
        cantidadDePrimos(cantidadDePrimos);
    }

    public static Boolean esPrimo(Integer numero) {
        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void cantidadDePrimos(Integer numero) {
        Integer acumulador = 0;
        Integer posiblePrimo = 1;
        while (acumulador < numero) {
            posiblePrimo++;
            if (esPrimo(posiblePrimo)) {
                acumulador++;
                System.out.println(posiblePrimo);
            }
        }
    }
}