package able;

import java.util.Scanner;

public class Able {
    
    public static void main(String[] args) {
        Menu();
    }
    
    public static void Menu(){
        Scanner Scan = new Scanner(System.in);
        int option;
        //valores
        Corredor corredor1 = new Corredor(6);
        Corredor corredor2 = new Corredor(6);
        Corredor corredor3 = new Corredor(6);
        Corredor corredor4 = new Corredor(6);
        Corredor corredor5 = new Corredor(6);
        Corredor corredor6 = new Corredor(6);
        Corredor corredor7 = new Corredor(6);
        Corredor corredor8 = new Corredor(6);
        Corredor [] corredores_andar1 = {corredor1, corredor2};
        Corredor [] corredores_andar2 = {corredor3, corredor4};
        Corredor [] corredores_andar3 = {corredor5, corredor6};
        Corredor [] corredores_andar4 = {corredor7, corredor8};
        Andar andar1 = new Andar(corredores_andar1);
        Andar andar2 = new Andar(corredores_andar2);
        Andar andar3 = new Andar(corredores_andar3);
        Andar andar4 = new Andar(corredores_andar4);
        Andar [] andar_edificio1 = {andar1, andar2};
        Andar [] andar_edificio2 = {andar3, andar4};
        //fim de inicialização
        Edificio edificio1 = new Edificio(andar_edificio1, 10);
        Edificio edificio2 = new Edificio(andar_edificio2, 10);
        Corredor [] corredores_total = {corredor1, corredor2, corredor3, corredor4, corredor5, corredor6, corredor7, corredor8};
        Andar [] andar_total = {andar1, andar2, andar3, andar4};
        Edificio [] edificio_total = {edificio1, edificio2};
        
        do{
        System.out.println("Digite a opção que deseja realizar:");
        System.out.println("1 - Informe o corredor, para receber o total de vagas ocupadas");
        System.out.println("2 - Informe o andar, para receber o total de vagas livres");
        System.out.println("3 - Informe o edificio garagem (Andar mais livre)");
        System.out.println("4 - Informe o edificio garagem (Andar ordenado por vagas livres)");
        System.out.println("5 - Informe o edificio garagem (total arrecado em reais)");
        System.out.println("0 - sair");
        option = Scan.nextInt();
        switch(option){
            case 0:
                System.out.println("Volte Sempre");
                break;
            case 1:
                VagasOcupadasCorredor(corredores_total);
                break;
            case 2:
                VagasLivresAndar(andar_total);
                break;
            case 3:
                GaragemAndarMaisLivre(edificio_total);
                break;
            case 4:
                GaragemOrdenada(edificio_total);
                break;
            case 5:
                GaragemValorArrecadado(edificio_total);
                break;
            default:
                System.out.println("Opção Invalida, digite novamente");
                break;
            }
        }while(option != 0);
        
    }
    
    public static void VagasOcupadasCorredor(Corredor [] corredores_total){
        Scanner Scan = new Scanner (System.in);
        System.out.println("Corredores: ");
        for(int i = 0; i < corredores_total.length;i++){
            System.out.println("Corredor " + (i + 1));
        }
        System.out.println("Digite o corredor desejado: ");
        int corredor_desejado = Scan.nextInt() - 1;
        corredores_total[corredor_desejado].printcorredor();
        System.out.println("Total de vagas ocupadas no corredor: " + corredores_total[corredor_desejado].VagaOcupada());
    }
    
        public static void VagasLivresAndar(Andar [] andar_total){
        Scanner Scan = new Scanner (System.in);
        System.out.println("Andares: ");
        for(int i = 0; i < andar_total.length;i++){
            System.out.println("Andar " + (i + 1));
        }
        System.out.println("Digite o andar desejado: ");
        int andar_desejado = Scan.nextInt() - 1;
        System.out.println("Total de vagas livres no andar: " + andar_total[andar_desejado].VagasLivres());
    }
        
        public static void GaragemAndarMaisLivre(Edificio [] edificio_total){
            Scanner Scan = new Scanner (System.in);
            System.out.println("Edificio garagem: ");
            for(int i = 0; i < edificio_total.length; i++){
                System.out.println("Edificio garagem " + (i + 1));
            }
            System.out.println("Digite o Edificio garagem desejado: ");
            int edificio_desejado = Scan.nextInt() - 1;
            System.out.println("Andares mais livre: " + edificio_total[edificio_desejado].AndarLivre());
        }
        
        public static void GaragemOrdenada(Edificio [] edificio_total){
            Scanner Scan = new Scanner (System.in);
            System.out.println("Edificio garagem: ");
            for(int i = 0; i < edificio_total.length; i++){
                System.out.println("Edificio garagem " + (i + 1));
            }
            System.out.println("Digite o Edificio garagem desejado: ");
            int edificio_desejado = Scan.nextInt() - 1;
            System.out.println("Andares ordenado por andar mais livre: " + edificio_total[edificio_desejado].AndarOrdenado());
        }
    
        public static void GaragemValorArrecadado(Edificio [] edificio_total){
            Scanner Scan = new Scanner (System.in);
            System.out.println("Edificio garagem: ");
            for(int i = 0; i < edificio_total.length; i++){
                System.out.println("Edificio garagem " + (i + 1));
            }
            System.out.println("Digite o Edificio garagem desejado: ");
            int edificio_desejado = Scan.nextInt() - 1;
            System.out.println("O valor arrecadado é de: " + edificio_total[edificio_desejado].ValorArrecadado() + "R$");
        }
        
}