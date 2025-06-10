import java.util.Scanner;

public class Fluxograma35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor de a: ");
        double a = scan.nextDouble();

        System.out.println("Insira o valor de b: ");       
        double b = scan.nextDouble();

        System.out.println("Insira o valor de c: ");        
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - (4*a*c);
        double raizDDelta = Math.sqrt(delta);

        double x1 = (-b + raizDDelta) / (2*a);
        double x2 = (-b - raizDDelta) / (2*a);

        System.out.println("X1 é: " + x1 + " e X2 é: " + x2);

        scan.close();
    }
}
