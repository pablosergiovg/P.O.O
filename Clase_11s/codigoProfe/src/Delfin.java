public class Delfin extends Animal{

    public Delfin(String nombre) {
        super(nombre, "Celeste");
    }

    @Override
    public void hacerRuido() {
        System.out.println("glup glup");
    }

    public void nadar(){
        System.out.println("estoy nadando feliz");
    }


}
