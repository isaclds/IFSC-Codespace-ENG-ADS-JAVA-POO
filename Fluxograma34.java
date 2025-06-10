import java.util.Scanner;

public class Fluxograma34 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de doláres: ");
        double dolar = scan.nextDouble();

        double real = dolar * 5.64;

        System.out.println(dolar + " dólares são " + real + " reais");

        scan.close();
    }
}
