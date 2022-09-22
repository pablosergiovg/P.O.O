public class Main {

    public static void main(String[] args) {


        Instituto instituto = new Instituto();

        instituto.agregarOferta(OfertaAcademicaFactory.CODIGO_FRONTEND);
        instituto.agregarOferta(OfertaAcademicaFactory.CODIGO_BACKEND);
        instituto.agregarOferta(OfertaAcademicaFactory.CODIGO_FULLSTACK);

        instituto.generarInforme();

    }
}