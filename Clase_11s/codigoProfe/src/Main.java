public class Main {
    public static void main(String[] args) {

        Animal animal = new Leon("Scar","Marron",30.0);

        animal = new Delfin("Delfina");

        Delfin delfin = (Delfin) animal;

        delfin.hacerRuido();
        delfin.nadar();




    }
}