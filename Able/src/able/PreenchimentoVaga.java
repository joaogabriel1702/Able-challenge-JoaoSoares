package able;

import java.util.Random;

public class PreenchimentoVaga {
    
    public static int ocupacao(){
        Random gerador = new Random(1);
        int valor = gerador.nextInt();
        return valor;
    }
    
}
