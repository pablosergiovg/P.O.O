public abstract class SistemaArmas {
        private Integer energia;

        public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

        public void mostrar(){
            System.out.println("Mi energia es: " + energia);
        };

         public void quitarEnergia(Integer danio) {
         this.energia -= danio;
    };

    public Integer getEnergia() {
        return energia;
    }
}
