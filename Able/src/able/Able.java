package able;

import java.util.Scanner;

public class Able {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner Scan = new Scanner(System.in);
        int option;
        System.out.println("Digite a opção que deseja realizar:");
        System.out.println("1 - Informe o corredor");
        System.out.println("2 - Informe o andar");
        System.out.println("3 - Informe o edificio garagem (Andar mais livre)");
        System.out.println("4 - Informe o edificio garagem (Andar ordenado por vagas livres)");
        System.out.println("5 - Informe o edificio garagem (total arrecado em reais)");
        System.out.println("0 - sair");
        option = Scan.nextInt();
        do{
        switch(option){
            case 0:
                System.out.println("Volte Sempre");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Opção Invalida, digite novamente");
            }
        }while(option != 0);
    }
    
}
