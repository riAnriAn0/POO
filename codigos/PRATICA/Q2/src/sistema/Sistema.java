package sistema;

import produtos.ProdutoEstadual;
import produtos.ProdutoInternacional;
import produtos.ProdutoNacional;

import java.util.Scanner;

public class Sistema {
    Scanner sc = new Scanner(System.in);
    ProdutoEstadual[] produtosEstaduais = new ProdutoEstadual[10];
    ProdutoNacional[] produtosNacional = new ProdutoNacional[10];
    ProdutoInternacional[] produtosInternacional = new ProdutoInternacional[10];

    int qntEstadual = 0, qntNacional = 0, qntInternacional = 0;
    String nome, descricao;
    double valor;

    public void entradaDados() {
        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.println("Descrição do produto:");
        descricao = sc.nextLine();
        System.out.println("Valor do produto:");
        valor = Double.parseDouble(sc.nextLine());
    }

    String menu = "      Menu     \n"
            + "[1] - CADASTRAR PRODUTO ESTADUAL\n"
            + "[2] - CADASTRAR PRODUTO NACIONAL\n"
            + "[3] - CADASTRAR PRODUTO INTERNACIONAL\n"
            + "[4] - EXIBIR PRODUTOS ESTADUAIS\n"
            + "[5] - EXIBIR PRODUTOS NACIONAL\n"
            + "[6] - EXIBIR PRODUTOS INTERNACIONAL\n"
            + "[7] - EXIBIR PRODUTOS \n"
            + "[9] - SAIR\n";

    public void sistema(){
        int opc = 0;
        while (opc != 9) {
            System.out.println(menu);
            System.out.print("Digite a opicao: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:

                    if (qntEstadual == 10) {
                        System.out.println("Lista cheia!");
                        return;
                    }

                    entradaDados();

                    produtosEstaduais[qntEstadual] = new ProdutoEstadual(nome, descricao, valor);
                    qntEstadual = qntEstadual + 1;

                    break;
                case 2:
                    if (qntNacional == 10) {
                        System.out.println("Lista cheia!");
                        return;
                    }

                    entradaDados();

                    produtosNacional[qntNacional] = new ProdutoNacional(nome, descricao, valor);
                    qntNacional = qntNacional + 1;
                    break;
                case 3:
                    if (qntInternacional == 10) {
                        System.out.println("Lista cheia!");
                        return;
                    }

                    entradaDados();

                    produtosInternacional[qntInternacional] = new ProdutoInternacional(nome, descricao, valor);
                    qntInternacional = qntInternacional + 1;
                    break;
                case 4:

                    if (qntEstadual == 0) {
                        System.out.println("Lista vazio!");
                        return;
                    }

                    System.out.println("\n LISTA PRODUTOS ESTADUAL");
                    for (int i = 0; i < qntEstadual; i++) {
                        System.out.println(produtosEstaduais[i].getNome());
                    }
                    break;
                case 5:

                    if (qntNacional == 0) {
                        System.out.println("Lista vazio!");
                        return;
                    }

                    System.out.println("\n LISTA PRODUTOS NACIONAL");
                    for (int i = 0; i < qntNacional; i++) {
                        System.out.println(produtosNacional[i].getNome());
                    }
                    break;
                case 6:

                    if (qntInternacional == 0) {
                        System.out.println("Lista vazio!");
                        return;
                    }

                    System.out.println("\n LISTA PRODUTOS INTERNACIONAL");
                    for (int i = 0; i < qntInternacional; i++) {
                        System.out.println(produtosInternacional[i].getNome());
                    }
                    break;
                case 7:
                    System.out.println("\n TODOS OS PRODUTOS");
                    for (int i = 0; i < qntEstadual; i++) {
                        System.out.println(produtosEstaduais[i].getNome());
                    }
                    for (int i = 0; i < qntNacional; i++) {
                        System.out.println(produtosNacional[i].getNome());
                    }
                    for (int i = 0; i < qntInternacional; i++) {
                        System.out.println(produtosInternacional[i].getNome());
                    }
                    break;
                case 9:
                    System.out.println("Saindo do sistema ......");
                    break;
            default:
                System.out.println("Opção inválida !!!");
            }
        }

    }
}
