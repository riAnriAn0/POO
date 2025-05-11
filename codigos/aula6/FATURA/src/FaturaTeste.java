import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("    FATURA  ");
        System.out.print("Numero: ");
        String numero = input.nextLine();
        System.out.print("Descricao: ");
        String descricao = input.nextLine();
        System.out.print("Qnt: ");
        int qnt = input.nextInt();
        System.out.print("Valor: ");
        double valor = input.nextDouble();

        Fatura f1 = new Fatura(numero, descricao, qnt, valor);
        f1.printf();

        input.close();
        
    }

}
