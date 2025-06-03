import java.util.Objects;

public class Universidade {
    protected String nome;
    protected int numeroDepartamentosMaxima;
    protected Departamento[] departamentos;
    protected int qntDepartamentos;

    public Universidade(String nome, int numeroDepartamentosMaxima) {
        this.nome = nome;
        this.numeroDepartamentosMaxima = numeroDepartamentosMaxima;
        this.departamentos = new Departamento[numeroDepartamentosMaxima];
        this.qntDepartamentos = 0;
    }

    // adiciona um novo departamento a universidade
    public void addDepartamento(Departamento novoDepartamento) {
        if(this.qntDepartamentos == this.numeroDepartamentosMaxima) {
            System.out.println("Maximo de departamentos atingido!");
            return;
        }
        this.departamentos[this.qntDepartamentos] = novoDepartamento;
        this.qntDepartamentos++;
    }

    // cria um novo departamento
    public void criarDepartamento(String nome, String codigo, int numMaxFuncionarios) {
        Departamento novoDepartamento = new Departamento(nome, codigo, numMaxFuncionarios);
        addDepartamento(novoDepartamento);
    }

    // verificar departamento
    public boolean verificarDepartamento(String nome) {
        for(int i = 0; i < this.qntDepartamentos; i++) {
            if (departamentos[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    // buscar departamento
    public Departamento buscarDepartamento(String nome) {
        for(int i = 0; i < this.qntDepartamentos; i++) {
            if (departamentos[i].getNome().equals(nome)) {
                return departamentos[i];
            }
        }
        return null;
    }

}
