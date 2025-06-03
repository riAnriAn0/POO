package produtos;

public class ProdutoInternacional extends ProdutoNacional {
    protected double taxaImportacao = (super.valor * 0.05);

    public ProdutoInternacional(String nome, String descricao, double valor) {
        super(nome, descricao, valor);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double valorTotal() {
        return super.valorTotal() + taxaImportacao;
    }

    @Override
    public void relatorio(){
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Taxa de importacao: " + taxaImportacao);
        System.out.println("Valor final: " + valorTotal());
        System.out.println("===============================");
    }
}
