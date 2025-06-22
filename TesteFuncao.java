import java.util.Scanner;

public class TesteFuncao {

    public static int soma2(int a, int b){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Insira o segundo valor:");
        b = scan.nextInt();

        scan.close();

        return a + b;   
    }
    
    public static void main(String[] args){
        int resultado = soma2(0, 0);
        System.out.println("Resultado é: " + resultado);
    }
}