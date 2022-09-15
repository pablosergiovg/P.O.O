public class Clase1S {

    public static void main(String[] args) {

        /*String animal = "gata";
        String nombre = "Liha";
        Integer edad = 8;
        Double porcionDiariaAlimento = 0.9;
        String onomatopeya = "rrrrraaawwww";

        System.out.println(nombre + " es una " + animal + ", tiene " + edad +
                " años, come " + porcionDiariaAlimento + "kg. de wiskas al día y maulla " + onomatopeya + "!!");*/



        String[] especie = {"perro", "pez", "gato", "tortuga", "pajarito"};
        String[] nombre = {"manchitas", "nemo", "silvestre", "manuelita", "gardel"};
        Integer[] edad = {2, 1, 3, 12, 1};
        Double[] cuantoCome = {1.500, 0.140, 0.500, 0.300, 0.350};
        String[] speach = {"guau guau", "glu glu", "miau", "peguajo", "pio pio"};


        for (Integer i = 0 ; i < nombre.length; i++) {
            System.out.printf("%s tiene %d anios, come %f kilos, y hace: %s \n ", nombre[i], edad[i], cuantoCome[i], speach[i] );
        }


    }



}