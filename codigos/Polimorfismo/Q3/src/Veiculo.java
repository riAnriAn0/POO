public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String placa;
    protected boolean alugavel;
    protected boolean alugado;

    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.alugado = false;
    }

    public abstract void exibir();


}
