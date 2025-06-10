import java.util.Scanner;

public class Fluxograma33 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de anos: ");
        double ano = scan.nextDouble();

        double dias = ano * 365;

        System.out.println(ano + "anos são " + dias + " dias");

        scan.close();
    }
}
