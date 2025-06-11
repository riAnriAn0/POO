public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont;

    public Agenda(String proprietario, int max) {
        this.proprietario = proprietario;
        this.max = max;
        cont = 0;
        pessoas = new Pessoa[max];
    }

    public void adicionaPessoa(Pessoa p) {
        if (cont < max) {
            pessoas[cont] = p;
            cont++;
        } else {
            System.out.println("Agenta esta cheia");
        }
    }

    public Pessoa buscaPessoa(String nome) {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return pessoas[i];
            }
        }
        return null;
    }

    public void addContato(Contato c, String nome) {
        Pessoa p = buscaPessoa(nome);
        if (p != null) {
            p.addContato(c);
        }
    }

    public void exibirTodasPessoas() {
        for (int i = 0; i < cont; i++) {
            pessoas[i].exibirContatos();
        }
    }

    public void exibirContatosPessoas(String nome) {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].getClass().getSimpleName().equals(nome)) {
                pessoas[i].exibirContatos();
            }
        }
    }

    public void exbirPessoasEmail() {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].possuiEmail()) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }

    public void recuperarPessoaPorEmail(String email) {
    for (int i = 0; i < cont; i++) {
        Contato[] emails = pessoas[i].getContatosTipo("Email");
        for (Contato contato : emails) {
            if (contato != null && contato.getEmail().equals(email)) {
                System.out.println(pessoas[i].getNome());
                break;
            }
        }
    }
}

public void recuperarPessoaPorTelefone(String telefone) {
    for (int i = 0; i < cont; i++) {
        Contato[] telefones = pessoas[i].getContatosTipo("Telefone");
        for (Contato contato : telefones) {
            if (contato != null && contato.getTelefone().equals(telefone)) {
                System.out.println(pessoas[i].getNome());
                break;
            }
        }
    }
}

}
