package able;

public class Andar {
    
    private Corredor corredores[];
    
    public Andar(Corredor[] array_corredores) {
        this.corredores = array_corredores;
    }
    
    public int VagasLivres(){
        int vagas_livres = 0;
            for(Corredor c : corredores){
                vagas_livres += c.VagaDisponivel();
            }
        return vagas_livres;
    }
    
        public int VagasOcupadas(){
        int vagas_ocupadas = 0;
            for(Corredor c : corredores){
                vagas_ocupadas += c.VagaOcupada();
            }
        return vagas_ocupadas;
    }
    
}
