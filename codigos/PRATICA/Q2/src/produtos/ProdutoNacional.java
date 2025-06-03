package produtos;

public class ProdutoNacional extends Produto {
    protected double taxa = super.valor * 0.05;

    public ProdutoNacional(String nome, String descricao, double valor) {
        super(nome, descricao, valor);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double valorTotal(){
        return super.valorTotal() + taxa;
    }

    @Override
    public void relatorio(){
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Taxa: " + taxa);
        System.out.println("Valor final: " + valorTotal());
        System.out.println("===============================");
    }

}
