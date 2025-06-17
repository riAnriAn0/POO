public class App {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de veículos!");

        Frota frota = new Frota(10);

        Carro carro = new Carro("Fiat", "Uno", 2019, "ABC1234", true, 4);
        frota.cadastrarVeiculo(carro);

        Carro carro2 = new Carro("Chevrolet", "Onix", 2022, "DEF7890", true, 4);
        frota.cadastrarVeiculo(carro2);

        Van van = new Van("Mercedes", "Sprinter", 2021, "XYZ5678", true, 1500);
        frota.cadastrarVeiculo(van);

        Van van2 = new Van("Volkswagen", "Transporter", 2020, "LMN3456", true, 1200);
        frota.cadastrarVeiculo(van2);

        Caminhão caminhao = new Caminhão("Scania", "R450", 2018, "GHI2345", true, 30000, 4);
        frota.cadastrarVeiculo(caminhao);

        Caminhão caminhao2 = new Caminhão("Volvo", "FH", 2020, "ABC1235", false, 20000, 3);
        frota.cadastrarVeiculo(caminhao2);

        frota.exibirVeiculos();
        frota.alugarVeiculo("ABC1234", 3);
        frota.exibirVeiculosAlugados();
        frota.exibirVeiculosAlugaveis();
    }
}