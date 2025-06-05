import java.util.Scanner;

public class B1_2Teste{
    public static void main(String[] args){
        Scanner palavraDigitada = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String entrada = palavraDigitada.next(); // Lê só uma palavra
        System.out.println("Você digitou: " + entrada);

        palavraDigitada.close();
    }

}