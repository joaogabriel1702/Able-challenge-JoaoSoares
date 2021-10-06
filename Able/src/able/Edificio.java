package able;

public class Edificio {
    
    private Andar andares[];
    private int valorVaga;

    public Edificio(Andar[] array_andares, int valor) {
        this.andares = array_andares;
        this.valorVaga = valor;
    }
    
    public Andar AndarLivre(){
        Andar aux = andares[0];
        for(Andar a : andares){
            if(aux.VagasLivres() > a.VagasLivres()){
                aux = a;
            }
        }
        return aux;
    }
    
       public Andar[] AndarOrdenado(){
               boolean troca = true;
               Andar [] array_ordenado = this.andares;
               Andar aux;
               while (troca) {
                   troca = false;
                   for (int i = 0; i < array_ordenado.length - 1; i++) {
                       if (array_ordenado[i].VagasLivres() > array_ordenado[i + 1].VagasLivres()) {
                           aux = array_ordenado[i];
                           array_ordenado[i] = array_ordenado[i + 1];
                           array_ordenado[i + 1] = aux;
                           troca = true;
                       }
                   }
               }
                return array_ordenado;
       }
       
    public int ValorArrecadado(){
        int aux = 0;
        for(Andar a : andares){
            aux += a.VagasOcupadas();
        }
        return aux * valorVaga;
    }    
    
}
