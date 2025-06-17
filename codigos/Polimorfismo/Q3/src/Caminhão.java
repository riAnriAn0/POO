public class Caminhão extends Veiculo {
    private int capacidadeCarga;
    private int numeroEixos;

    public Caminhão(String marca, String modelo, int ano, String placa,boolean alugavel, int capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, placa);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        super.alugavel = false;
    }

    @Override
    public void exibir() {
        System.out.println("Caminhão:");
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Ano: " + super.ano);
        System.out.println("Placa: " + super.placa);
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
        System.out.println("Número de Eixos: " + numeroEixos);
    }

}