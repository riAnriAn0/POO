import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("ADM", 20);
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa("rian", 5);
        Pessoa p2 = new Pessoa("robert", 6);
        Pessoa p3 = new Pessoa("maria", 7);
        Pessoa p4 = new Pessoa("carla", 8);

        agenda.adicionaPessoa(p1);
        agenda.adicionaPessoa(p2);
        agenda.adicionaPessoa(p3);
        agenda.adicionaPessoa(p4);

        System.out.println("Buscar robert: "+ agenda.buscaPessoa("robert"));

        Contato c1 = new Telefone("Telefone", "9988776655");
        Contato c2 = new Email("Email", "teste@teste.com");

        agenda.addContato(c1, "robert");
        agenda.addContato(c2, "maria");

        agenda.exibirTodasPessoas();

        agenda.exibirContatosPessoas("robert");

        agenda.exbirPessoasEmail();

        agenda.recuperarPessoaPorEmail("teste@teste.com");
        agenda.recuperarPessoaPorTelefone("9988776655");

    }
}