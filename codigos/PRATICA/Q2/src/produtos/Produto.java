package produtos;

public class Produto {
    protected String nome;
    protected String descricao;
    protected double valor;
    protected double imposto = this.valor * 0.1;

    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public void relatorio() {
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor final: " + valorTotal());
        System.out.println("===============================");
    }

    public double valorTotal() {
        return valor + (valor * imposto);
    }
}
