public class FuncionarioDocente extends Funcionario{
    protected String titulacao;

    public FuncionarioDocente(String nome, String codigo, double salario, String titulacao) {
        super(nome, codigo, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "\n============================\nNome: "+ this.nome+
        "\nCodigo: "+ this.codigo+
        "\nSalario: "+ this.salario+
        "\nTitulacao: "+ this.titulacao+"\n============================\n";
    }
}
