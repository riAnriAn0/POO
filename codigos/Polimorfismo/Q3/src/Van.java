public class Van extends Veiculo implements Alugavel {
    private int valorAluguel;
    private int capacidadeCarga;

    public Van(String marca, String modelo, int ano, String placa,boolean alugavel ,int capacidadeCarga) {
        super(marca, modelo, ano, placa);
        this.capacidadeCarga = capacidadeCarga;
        this.valorAluguel = 180;
        super.alugavel = true;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorAluguel * dias;
    }

    @Override
    public void exibir() {
        System.out.println("Van :");
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Ano: " + super.ano);
        System.out.println("Placa: " + super.placa);
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }

}
