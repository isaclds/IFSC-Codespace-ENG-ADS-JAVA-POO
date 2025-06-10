import java.util.Scanner;

public class Fluxograma32 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do produto: ");
        double valor = scan.nextDouble();

        System.out.println("Insira o desconto do produto: ");
        double desconto = scan.nextDouble();

        double subtotal = valor - desconto;

        System.out.println("O subtotal foi: " + subtotal);

        scan.close();
    }
}
