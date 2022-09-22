public class Main {

    public static void main(String[] args) {

        OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstance();

        Instituto instituto = new Instituto();

        instituto.agregarOferta(ofertaAcademicaFactory.generarOfertaAcademica("FRONTEND"));
        instituto.agregarOferta(ofertaAcademicaFactory.generarOfertaAcademica("BACKEND"));
        instituto.agregarOferta(ofertaAcademicaFactory.generarOfertaAcademica("FULLSTACK"));

        instituto.generarInforme();

    }
}