import java.util.Scanner;

public class Fluxograma29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a hora: ");
        double hora = scan.nextDouble();

        double min = hora * 60;
        System.out.println(hora + " é igual a " + min + " minutos");

        scan.close();
    }
}
