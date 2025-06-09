import java.util.Scanner;

public class B1_4Teste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        double notaUm = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaDois = entrada.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.printf("Olá, %s! Sua média é: %.2f", nome, media);

        System.out.println("Olá, " + nome + "! Sua média é: " + media);

        entrada.close();
    }
}
