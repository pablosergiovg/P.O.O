
/*Ejercicio 1:
    Definir dos números enteros. Asignarles un valor a cada uno.
    Comprobar si un número es divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
    NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin decimales.*/

public class Estructura {

    public static void main(String[] args) {

        int entero1 = 20;
        int entero2 = 10;

        if(entero1 % entero2 == 0) {
            System.out.println("El resultado es un numero entero: " + entero1/entero2);
        }else {
            System.out.println("el resultado no es entero");
        }

    }

}
