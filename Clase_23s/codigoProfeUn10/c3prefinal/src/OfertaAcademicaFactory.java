public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo){
        switch (codigo){
            case "FRONTEND" :
                return new Curso("FRONT END","casi que es programar",16.0,2.0,1000.0);
            case "BACKEND" :
                return new Curso("BACK END","aguante java",20.0,2.0,900.0);
            case "FULLSTACK" :
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("FULL STACK","algo",0.20);
                programaIntensivo.agregarOferta(generarOfertaAcademica("FRONTEND"));
                programaIntensivo.agregarOferta(generarOfertaAcademica("BACKEND"));
                return programaIntensivo;
        }
        return null;
    }
}
