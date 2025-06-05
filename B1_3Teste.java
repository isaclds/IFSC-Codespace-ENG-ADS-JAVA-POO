import java.util.Scanner;

public class B1_3Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numeroInt = entrada.nextInt(); //Numero inteiro
        System.out.println("Você digitou o número inteiro: " + numeroInt);

        System.out.println("Digite um número decimal");
        double numeroDoub = entrada.nextDouble();
        System.out.println("Você digitou o número decimal: " + numeroDoub);

        entrada.close();
    }
}
