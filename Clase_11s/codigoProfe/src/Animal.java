public abstract class Animal {

    private String nombre;
    private String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;

    }

    public abstract void hacerRuido();


}
