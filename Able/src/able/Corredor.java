package able;

public class Corredor {
    
    private int corredorVaga[];
    private int qtdVagas;

    public Corredor(int qtd) {
        this.corredorVaga = PreencherVaga();
        this.qtdVagas = qtd;
    }
    
    public void printcorredor(){
        for(int i : corredorVaga){
            System.out.println(i);
        }
    }
    
    public int[] PreencherVaga(){
        int i;
        int vaga[] = new int [qtdVagas];
        for(i = 0; i < qtdVagas; i++){
            vaga[i] = PreenchimentoVaga.ocupacao();
        }
        return vaga;
    }
    
    public int VagaOcupada(){
        int i, vaga_ocupada = 0;
        for(i = 0; i < corredorVaga.length; i++){
            if(corredorVaga[i] == 1){
                vaga_ocupada += 1;
            }
        }
        return vaga_ocupada;
    }
    
    public int VagaDisponivel(){
        int vaga_disponivel;
        vaga_disponivel = this.corredorVaga.length - VagaOcupada();
        return vaga_disponivel;
    }
    
}
