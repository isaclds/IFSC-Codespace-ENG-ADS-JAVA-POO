import java.util.Scanner;

public class QuestãoAtividade1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o nome do produto: ");
        String produto = scan.nextLine();

        System.out.println("Insira o código do produto: ");
        int codigoProd = scan.nextInt();

        System.out.println("Insira o preço unitário do produto: ");
        double preco = scan.nextDouble();

        System.out.println("Insira a quantidade de produtos em estoque: ");
        int qntd = scan.nextInt();

        System.out.println("O produto está ativo? ");
        boolean ativo = scan.nextBoolean();

        double valorEstoque = preco * qntd;

        System.out.println("O nome do produto é: " +produto);        
        System.out.println("O código do produto é: " + codigoProd);
        System.out.printf("O preço do produto é: %.2f%n", preco);
        System.out.println("A quantidade do produto é: " + qntd);
        System.out.println("O valor do estoque é: " + valorEstoque);
        System.out.println("O produto está ativo? " + ativo);

        scan.close();
    }
}