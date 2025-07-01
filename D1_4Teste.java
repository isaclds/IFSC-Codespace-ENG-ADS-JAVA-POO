import java.util.Scanner;

public class D1_4Teste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lista;

        do{
            System.out.println("Menu: Digite o Item");
            System.out.println("1: Lista 1");
            System.out.println("2: Lista 2");
            System.out.println("3: Lista 3");
            System.out.println("4: Voltar ao menu");
            System.out.println("0: Sair");

            lista = scan.nextInt();
            
            switch(lista) {
                case 1:
                System.out.println("Você escolheu 1");
                break;
                case 2:
                System.out.println("Você escolheu 2");
                break;
                case 3:
                System.out.println("Você escolheu 3");
                break;
                case 4:
                System.out.println("Voltando ao menu...");
                break;
                case 0: 
                System.out.println("Saindo...");
                break;
                default: 
                System.out.println("Essa não é uma opção válida");
            }
        } while (lista !=0);
        scan.close();
    }
}
