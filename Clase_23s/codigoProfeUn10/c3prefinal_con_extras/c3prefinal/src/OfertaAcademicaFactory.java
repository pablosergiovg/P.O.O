public class OfertaAcademicaFactory {


    public static final String CODIGO_FULLSTACK = "FULLSTACK";
    public static final String CODIGO_BACKEND = "BACKEND";
    public static final String CODIGO_FRONTEND = "FRONTEND";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException{
        switch (codigo){
            case CODIGO_FRONTEND:
                return new Curso("FRONT END","casi que es programar",16.0,2.0,1000.0);
            case CODIGO_BACKEND:
                return new Curso("BACK END","aguante java",20.0,2.0,900.0);
            case CODIGO_FULLSTACK :
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("FULL STACK","algo",0.20);
                programaIntensivo.agregarOferta(generarOfertaAcademica(CODIGO_FRONTEND));
                programaIntensivo.agregarOferta(generarOfertaAcademica(CODIGO_BACKEND));
                return programaIntensivo;
        }
        throw new OfertaAcademicaFactoryException(codigo + " no es un codigo valido");
    }
}
