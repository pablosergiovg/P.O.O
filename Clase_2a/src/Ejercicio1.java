public class Ejercicio1 {

    public static void main(String[] args) {

        //Ejercicio 1
        //Definir dos cadenas de texto.

        String nombre1 = "Pablo";
        String nombre2 = "PABLO";
        Integer comparacion;

        comparacion = nombre1.compareTo(nombre2);

        if(nombre1.equals(nombre2)){
            System.out.println("Son iguales!");
        }else{
            System.out.println("Son distintos!");
        }

        //Ejercicio 2 Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.

        Integer numero1 = 29;
        Integer numero2 = 49;
        Integer comparar;
        comparar = numero1.compareTo(numero2);

        if(comparar > 0){
            System.out.println(numero1 + " es mayor que " + numero2);
        }else{
            System.out.println(numero2 + " es mayor que " + numero1);
        }

    }
}