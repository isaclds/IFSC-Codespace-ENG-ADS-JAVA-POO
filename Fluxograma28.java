import java.util.Scanner;

public class Fluxograma28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva a base: ");
        double base = scanner.nextDouble();

        System.out.println("Escreva a altura: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A base é: " + base + ", a altura é: " + altura + ", logo a área é: " + area);

        scanner.close();
    }
}
