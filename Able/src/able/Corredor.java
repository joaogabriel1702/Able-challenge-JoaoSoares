package able;

import java.util.Random;

public class Corredor {
    
    private int corredorVaga[];

    public Corredor(int qtd) {
        this.corredorVaga = new int[qtd];
        Ocupacao();
    }
     
    public int VagaOcupada(){
        int i, vaga_ocupada = 0;
        for(i = 0; i < this.corredorVaga.length; i++){
            if(this.corredorVaga[i] == 1){
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
    
    public void Ocupacao(){
        Random gerador = new Random();
            for(int i = 0; i < this.corredorVaga.length; i++){
                corredorVaga[i] = gerador.nextInt(2);
            }
    }
    
}
