import java.util.Scanner; //Tirando o java antes do import

public class QuestãoAtividade {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = scan.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = scan.nextDouble();

    System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos e você tem " + altura + " metros de altura");

    scan.close();
    }
}
