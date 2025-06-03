public class PecaImportada extends Peca{
    private float taxaImportacao;
    private float taxaFrete;
    
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calculaPreco(){
        return super.calculaPreco() + taxaFrete + taxaImportacao;
    }

    @Override
    public void Exibir(){
         String dados = 
        "\n=================================\nNome: "+nome+
        "\nCusto: "+custo+" R$"+
        "\nLucro: "+lucro+" R$"+
        "\nTaxa de Importacao: "+taxaImportacao+" R$"+
        "\nTaxa de Frete: "+taxaFrete+" R$"+"\n==================================";
        System.out.print(dados);
    }

}
