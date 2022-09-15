public class funciones {

    public static void main(String[] args) {

        Integer numero1 = 10;
        Integer numero2 = 5;

        Integer resultadosuma = suma(numero1, numero2);
        Integer resultadoresta = resta(numero1, numero2);

        System.out.printf(resultadosuma.toString()); //printf NO SALTA LINEA y necesita el .toString()
        System.out.println(resultadoresta);; //SIN SALTEAR LINEA y no hace falta el toString().

    }

    public static Integer suma(Integer num1, Integer num2){

        return num1 + num2;

    }

    public static Integer resta(Integer num1, Integer num2){

        return num1 - num2;

    }

}


