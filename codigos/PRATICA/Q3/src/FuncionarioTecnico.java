public class FuncionarioTecnico extends Funcionario {
    protected String nivel;

    public FuncionarioTecnico(String nome, String codigo, double salario, String nivel) {
        super(nome, codigo, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "\n============================\nNome: " + this.nome +
        "\nCodigo: " + this.codigo +
        "\nSalario: " + this.salario +
        "\nNivel: " + this.nivel+"\n============================\n";
    }
}

