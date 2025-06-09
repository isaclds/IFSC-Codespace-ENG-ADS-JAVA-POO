import java.util.Scanner;

public class B1_5Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("Valor em decimal: " + numero);
        System.out.println("Valor em octal: " + Integer.toOctalString(numero));
        System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero));
        System.out.println("Valor em binario: " + Integer.toBinaryString(numero));

scanner.close();
    }
}
