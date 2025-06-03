public class Departamento {
    protected String nome;
    protected String codigo;
    protected int numMaxFuncionarios;
    protected int qntFuncionarios;
    protected Funcionario[] funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumMaxFuncionarios() {
        return numMaxFuncionarios;
    }

    public void setNumMaxFuncionarios(int numMaxFuncionarios) {
        this.numMaxFuncionarios = numMaxFuncionarios;
    }

    public int getQntFuncionarios() {
        return qntFuncionarios;
    }

    public void setQntFuncionarios(int qntFuncionarios) {
        this.qntFuncionarios = qntFuncionarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento(String nome, String codigo, int numMaxFuncionarios) {
        this.nome = nome;
        this.codigo = codigo;
        this.numMaxFuncionarios = numMaxFuncionarios;
        this.qntFuncionarios = 0;
        this.funcionarios = new Funcionario[numMaxFuncionarios];
    }

    public void addFuncionario(Funcionario funcionario) {
        if (this.qntFuncionarios == this.numMaxFuncionarios) {
            System.out.println("Maximo de funcionarios cadastrado!!!");
            return;
        }

        funcionarios[this.qntFuncionarios] = funcionario;
        this.qntFuncionarios++;
    }

    public void criarFuncionario(String nome, String codigo, double salario, int tipo, String especifico) {
        if (tipo == 1) {
            FuncionarioTecnico ftc = new FuncionarioTecnico(nome, codigo, salario, especifico);
            addFuncionario(ftc);
        }
        if (tipo == 2) {
            FuncionarioDocente fdc = new FuncionarioDocente(nome, codigo, salario, especifico);
            addFuncionario(fdc);
        } else {
            System.out.print("Tipo invalido");
        }
    }

    public Funcionario buscarFuncionario(String nome) {
        for (int i = 0; i < this.qntFuncionarios; i++) {
            if (nome.equals(funcionarios[i].getNome())) {
                return funcionarios[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome +
                "\nCodigo: " + this.codigo +
                "\nQnt funcionario: " + this.qntFuncionarios+"\n";
    }
}


