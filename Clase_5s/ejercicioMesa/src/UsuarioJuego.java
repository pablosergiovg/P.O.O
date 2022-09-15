public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    public void aumentarPuntaje(){
        this.puntaje = this.puntaje + 1;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void bonus(Double valor){
        this.puntaje += valor;
    }

    public Double mostrarPuntaje(){
        return puntaje;
    }
}
