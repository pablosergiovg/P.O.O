import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {

    private Double descuento;
    private List<OfertaAcademica> ofertaAcademicaList;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        ofertaAcademicaList = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica ofertaAcademica){
        ofertaAcademicaList.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecio = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
            sumaPrecio += ofertaAcademica.calcularPrecio();
        }
        return sumaPrecio - (sumaPrecio * descuento);
    }
}
