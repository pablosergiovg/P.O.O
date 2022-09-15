public class string_Integer {

    public static void main(String[] args) {

        String nombre = "Pablo";
        int cantidad;
        char inicial;

        cantidad = nombre.length();
        nombre = nombre.toUpperCase();

        if(nombre.equals("PABLO")){
            System.out.println("Se pasó a mayúscula");
        }
        inicial = nombre.charAt(0);
        System.out.println(inicial);

    }

}