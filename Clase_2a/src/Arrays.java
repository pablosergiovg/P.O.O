public class Arrays {

    public static void main(String[] args) {

        String[] nombres = new String[3];
        nombres[0] = "Pablo";
        nombres[1] = "Pablito";
        nombres[2] = "Sergio";

        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " recorrido for");
        }

        for(String nombre : nombres){
            System.out.println(nombre + " recorrido for each");
        }

        int i = 0;
        while(i < nombres.length){
            System.out.println(nombres[i] + "recorrido while");
            i++;
        }

    }

}
