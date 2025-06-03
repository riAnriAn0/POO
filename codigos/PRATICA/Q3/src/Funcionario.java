public class Funcionario {
    protected String nome;
    protected String codigo;
    protected double salario;

    public Funcionario(String nome, String codigo, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
