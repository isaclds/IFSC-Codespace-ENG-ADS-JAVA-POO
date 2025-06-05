import java.util.Scanner;

public class B1_1Teste {
    public static void main(String[] args){
        Scanner linhaDigitada = new Scanner(System.in);

        System.out.println("Digite algo:");
        
        String entrada = linhaDigitada.nextLine(); //Next line é um metódo que lê toda a próxima linha

        System.out.println("Você escreveu: " + entrada);

        linhaDigitada.close();
    }
}
