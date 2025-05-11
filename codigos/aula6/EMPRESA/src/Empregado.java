/* 
 * Crie uma classe Empregado com os atributos nome (String), sobrenome (String) e salário mensal (double). Implemente métodos get e set, além de um construtor apropriado. Escreva uma classe de teste chamada EmpregadoTeste que crie dois objetos da classe, exiba o salário anual de cada um, aplique um aumento de 10% e exiba os novos salários.
 */

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() { return this.nome; }
    public String getSobrenome() { return this.sobrenome; }
    public double getSalario() { return this.salario; }

    public void setNome(String nome){ this.nome = nome; }
    public void setSobrenome(String sobrenome){ this.sobrenome = sobrenome; }
    public void setSalario(double salario ){ this.salario = salario; }

    public double aumento(){
        return this.salario = salario + (salario * 0.1);
    }

}
