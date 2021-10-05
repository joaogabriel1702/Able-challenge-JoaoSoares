package able;

import java.util.Random;

public class PreenchimentoVaga {
    
    public static int ocupacao(){
        Random gerador = new Random();
        return gerador.nextInt(1);
    }
    
}
