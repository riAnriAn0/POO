public class Frota {
    private Veiculo[] veiculos;
    private int max;
    private int cont;

    public Frota(int max) {
        this.veiculos = new Veiculo[max];
        this.cont = 0;
        this.max = max;
    }

    public void cadastrarVeiculo(Veiculo veiculo){
        if (cont < max) {
            veiculos[cont] = veiculo;
            cont++;
        } else {
            System.out.println("Frota cheia, não é possível cadastrar mais veículos.");
        }
    }

    public void exibirVeiculos() {
        if (cont == 0) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        for (int i = 0; i < cont; i++) {
            veiculos[i].exibir();
            System.out.println("-------------------");
        }
    }

    public void exibirVeiculosAlugaveis() {
        boolean temAlugaveis = false;
        System.out.println("\n============ Veículos Alugáveis ============");
        for(int i = 0; i < cont; i++) {
            if (!(veiculos[i].alugado) && veiculos[i].alugavel) {
                System.out.println(veiculos[i].modelo + " (" + veiculos[i].ano+ ") - Valor para 3 dias de Aluguel: R$ " + ((Alugavel) veiculos[i]).calcularValorAluguel(3));
                temAlugaveis = true;
            }
        }
        if (!temAlugaveis) {
            System.out.println("Nenhum veículo disponível para aluguel no momento.");
        }
        System.out.println("============================================\n");
    }

    public void exibirVeiculosAlugados(){
        boolean temAlugados = false;
        System.out.println("\n============ Veículos Alugádos ============");
        for(int i = 0; i < cont; i++) {
            if (veiculos[i].alugado) {
                System.out.println("Veículo alugado: " + veiculos[i].modelo + " (" + veiculos[i].ano + ")");
                temAlugados = true;
            }
        }
        if (!temAlugados) {
            System.out.println("Nenhum veículo alugado no momento.");
        }
        System.out.println("============================================\n");

    }

    public void alugarVeiculo(String placa, int dias) {
        for (int i = 0; i < cont; i++) {
            if (veiculos[i].placa.equals(placa)) {
                if (!veiculos[i].alugado) {
                    veiculos[i].alugado = true;
                    System.out.println("Veículo alugado com sucesso! Valor total: R$ " + ((Alugavel) veiculos[i]).calcularValorAluguel(dias));
                } else {
                    System.out.println("Veículo já está alugado.");
                }
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

}
