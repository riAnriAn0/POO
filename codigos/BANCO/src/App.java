import java.util.Scanner;
import model.Cliente;
import view.EntradaDados;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Criando Cliente 1");
        Cliente cliente1 = EntradaDados.criarCliente(input);

        System.out.println("Criando Cliente 2");
        Cliente cliente2 = EntradaDados.criarCliente(input);

        int opcao;

        do {
            System.out.println("\n===========================");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma das opções: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Depositar para o Cliente 1 ou 2");
                    int clienteDep = input.nextInt();
                    System.out.println("Valor a depositar");
                    double valorDep = input.nextDouble();
                    input.nextLine();
                    if (clienteDep == 1) {
                        cliente1.depositar(valorDep);
                    } else if (clienteDep == 2) {
                        cliente2.depositar(valorDep);
                    } else {
                        System.out.println("Cliente inválido!");
                    }
                    break;
                case 2:
                    System.out.println("Sacar para o Cliente 1 ou 2");
                    int clienteSac = input.nextInt();
                    System.out.println("Valor a sacar");
                    double valorSac = input.nextDouble();
                    input.nextLine();
                    if (clienteSac == 1) {
                        cliente1.sacar(valorSac);
                    } else if (clienteSac == 2) {
                        cliente2.sacar(valorSac);
                    } else {
                        System.out.println("Cliente inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Transferir de qual Cliente 1 ou 2:");
                    int de = input.nextInt();
                    System.out.println("Transferir para qual Cliente 1 ou 2:");
                    int para = input.nextInt();
                    System.out.println("Valor a ser tranferido:");
                    double valorTrans = input.nextDouble();
                    input.nextLine();

                    if (de == 1 && para == 2) {
                        cliente1.transferir(cliente2, valorTrans);
                    } else if (de == 2 && para == 1) {
                        cliente2.transferir(cliente1, valorTrans);
                    } else {
                        System.out.println("Trnasferência inválida!!");
                    }
                    break;
                case 4:
                    cliente1.mostraSaldo();
                    cliente2.mostraSaldo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema....");
                    break;
                default:
                    System.out.println("Opção invalida!!!");
                    break;
            }

        } while (opcao != 0);
    }
}
