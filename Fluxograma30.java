import java.util.Scanner;

public class Fluxograma30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva os minutos: ");
        int min = scan.nextInt();

        double hora = min / 60;

        System.out.println(min + " é igual a " + hora + " hora");

        scan.close();
    }
}
