upackage view;

import java.util.Scanner;
import model.Cliente;

public class EntradaDados {
    public static Cliente criarCliente(Scanner input) {

        System.out.println("Digite o nome do Cliente: ");
        String nome = input.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = input.nextDouble();

        input.nextLine();
        
        return new Cliente(nome, saldo);
    }
}
