import java.util.Scanner;

public class QuestãoAtividade3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da compra: ");
        double compra = scan.nextDouble();

        System.out.println("Valor pago pelo cliente: ");
        double vCliente = scan.nextDouble();

        double troco = vCliente - compra;

        if (troco > 0){
            System.out.println("O valor do troco é: R$ " + troco);
        } else if (troco < 0) {
            System.out.println("Falta ser pago: R$ " + (troco * -1));
        } else {
            System.out.println("Não é necessário ter troco");
        }

        scan.close();
    }
}
