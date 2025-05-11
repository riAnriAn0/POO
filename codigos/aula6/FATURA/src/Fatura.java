/* 
 * Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve conter quatro variáveis de instância: número (String), descrição (String), quantidade comprada (int) e preço por item (double). Implemente um construtor e métodos get e set para cada variável. Adicionalmente, implemente o método getTotalFatura que calcula e retorna o valor total da fatura (quantidade × preço), considerando que valores negativos devem ser tratados como zero. Escreva um programa FaturaTeste para testar essa classe.


 */

public class Fatura {
    private String numero;
    private String descricao;
    private int qntCompra;
    private double valor;

    public Fatura(String numero, String descricao, int qntCompra, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.qntCompra = qntCompra;
        this.valor = valor > 0 ? valor : 0;
    }

    public double getTotalFatura(){
        return valor * qntCompra;    
    }

    public void printf() {
        System.out.println("========= FATURA =========");
        System.out.println("Numero: ------------ " + numero);
        System.out.println("Qnt: --------------- " + qntCompra);
        System.out.println("Valor Unitario: ---- R$" + valor);
        System.out.println("Total da Fatura: --- R$" + getTotalFatura());
        System.out.println("========= DESCRIÇÃO ========");
        System.out.println(descricao);
    }


    public String getNumero() {
        return this.numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getQntCompra() {
        return this.qntCompra;
    }

    public double getValor() {
        return this.valor;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQntCompra(int qntComrpra) {
        this.qntCompra = qntComrpra;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
