import java.util.Scanner;

public class QuestãoAtividade2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();

    System.out.println("Digite sua peso: ");
    double peso = scan.nextDouble();

    System.out.println("Digite sua altura: ");
    double altura = scan.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("Nome: " + nome);
    System.out.println("Peso: " + peso + " Kg");
    System.out.println("Altura: " + altura + " m");
    System.out.printf("Seu IMC é: %.2f%n", imc);

    scan.close();
    }
}
