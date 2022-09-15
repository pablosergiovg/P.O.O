public class Nave extends ObjetoGrafico{

    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, String direccion, Double velocidad, Integer vida){
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 20;
    }

    @Override
    public void irA(Integer posx, Integer posy, String direccion){
        if (super.getDireccion() != direccion){
            girar(direccion);
        }
        super.irA(posx, posy, direccion);
    }

    public void girar(String direccion){
        super.setDireccion(direccion);
    }

    public void restarVida(Integer lesion){
        this.vida -= lesion;
    }


}
