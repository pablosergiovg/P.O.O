public class SocioPileta extends Socio {

    private Double costoPileta;
    private Boolean estaHabilitado;


    public SocioPileta(String numeroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = true;
    }

    @Override
    public Double calcularCostoMensual() {
        if(estaHabilitado){
            return super.calcularCostoMensual() + costoPileta;
        }
        return super.calcularCostoMensual();
    }
}
