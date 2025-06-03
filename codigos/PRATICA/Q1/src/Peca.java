public class Peca {
    String nome;
    float custo;
    float lucro;

    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float calculaPreco(){
        return custo + lucro;
    }

    public void Exibir(){
        String dados = "Nome: "+nome+"\nCusto: "+custo+"\nLucro: "+lucro;
        System.out.print(dados);
    }

}

