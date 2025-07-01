import java.util.Scanner;

public class F1_3Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = new int[5];

        System.out.println("Insira 5 números: ");
        for(int i = 0; i < 5; i++){
            System.out.println((i+1) + "° número:");
            n[i] = scan.nextInt();
        }

        System.out.println("Os números inseridos foram: ");
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }

        scan.close();

    }
}