import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertaAcademicaList;

    public Instituto() {
        ofertaAcademicaList = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica ofertaAcademica){
        ofertaAcademicaList.add(ofertaAcademica);
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
       //   System.out.println("nombre: " + ofertaAcademica.getNombre() + " precio: " + ofertaAcademica.calcularPrecio());
            System.out.println(ofertaAcademica);
        }
    }
}
