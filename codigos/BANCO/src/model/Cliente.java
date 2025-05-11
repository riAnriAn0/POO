package model;

public class Cliente {
    
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldoTnicial) {
        this.nome = nome;
        this.saldo = saldoTnicial;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void transferir(Cliente destino, double valor){
        if ( valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia de R$" +valor+ "para" +destino.getNome()+ "realizado com sucesso!");
        } else {
            System.out.println("Transferencia não realizada!!!");
        }
    }

    public void mostraSaldo(){
        System.out.println(nome + " _ Saldo atual R$" + saldo);
    }

}
