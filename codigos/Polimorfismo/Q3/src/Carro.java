public class Carro extends Veiculo implements Alugavel {
    private int valorAluguel;
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, String placa,boolean alugavel, int numeroPortas) {
        super(marca, modelo, ano, placa);
        this.numeroPortas = numeroPortas;
        this.valorAluguel = 120;
        super.alugavel = true;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorAluguel * dias;
    }

    @Override
    public void exibir() {
        System.out.println("Carro:");
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Ano: " + super.ano);
        System.out.println("Placa: " + super.placa);
        System.out.println("Número de Portas: " + numeroPortas);
    }

}
