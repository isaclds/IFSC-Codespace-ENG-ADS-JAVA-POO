import java.util.Scanner;

public class Fluxograma31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Escreva a nota 2: ");
        double nota2 = scan.nextDouble();
        
        System.out.println("Escreva a nota 3: ");
        double nota3 = scan.nextDouble();
        
        System.out.println("Escreva a nota 4: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi: " + media);

        scan.close();
    }
}
