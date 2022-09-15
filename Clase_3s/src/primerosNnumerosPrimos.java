import java.util.Scanner;

public class primerosNnumerosPrimos {

    public static void main(String[] args) {

        //creo el Scanner
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de numeros primos que desea ver: ");

        //input para que ingresen el numero.
        Integer numeroIngresado = escaner.nextInt();

        //llamando al metodo.
        buscadorDeNumerosPrimos(numeroIngresado);

    }

    //unico metodo que busca primos, se siente solo (chiste).
    public static void buscadorDeNumerosPrimos(Integer numeroIngresado) {

        //variable del posible numero primo, va a ir incrementando en uno.
        int posibleNumeroPrimo = 3;

        //Me adelando a imprimir el primer numero primo.
        System.out.println(2 + " es primo");

        //este for va a irterar "numeroIngresado" veces, el "numeroIgresado" aumentará 1 cuando encuentre numeros que no son primos.
        for (int i = 2; i <= numeroIngresado; i++) {

            //este for va a estar iterando probando dividir todos los numeros menores a "posibleNumeroPrimo" entre "posibleNumeroPrimo".
            for (int j = 2; j < posibleNumeroPrimo; j++) {
                //si al dividir "posibleNumeroPrimo" entre "j" da 0, ingresa al if.
                if (posibleNumeroPrimo % j == 0) {

                    //System.out.println(posibleNumeroPrimo + " no es primo"); //lo utilicé para debugear.

                    //agrega 1 al "numeroIngresado" debido a que le robó un ciclo a un numero primo.
                    numeroIngresado++;

                    //corto el ciclo para evitar que me vuelva a dividir "posibleNumeroPrimo" entre un valor mas a "j" ya que se que no es primo "posibleNumeroPrimo".
                    break;

                //si al dividir "posibleNumeroPrimo" entre "j" no da 0, ingresa al else.
                } else {

                    //este if me va a comprobar si "j" es igual a "posibleNumeroPrimo" -1, de ser así entra.
                    // sino significa que no ha iterado con todas las posibilidades de "posibleNumeroPrimo", ejemplo: si "posibleNumeroPrimo" = 5:
                    //5 entre 2(j), 5 entre 3(j) y 5 entre 4(j).
                    if(j == posibleNumeroPrimo - 1) {

                        //imprime el numero primo
                        System.out.println(posibleNumeroPrimo + " es primo");

                    }
                }
            }

            //antes de terminar el ciclo de "numeroIngresado", le agrego 1 a posibleNumeroPrimo para que itere con el valor siguiente.
            posibleNumeroPrimo++;

        }

    }
}

