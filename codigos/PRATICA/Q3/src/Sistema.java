import java.util.Scanner;

public class Sistema {
    public static void iniciar() {

        Scanner sc = new Scanner(System.in);
        Universidade universidades = new Universidade("IFMA", 3);

        String menu = "      Menu     \n"
                + "[1] – Cadastrar Departamento\n"
                + "[2] – Cadastrar Funcionário Técnico\n"
                + "[3] – Cadastrar Funcionário Docente\n"
                + "[4] – Buscar Departamento por Nome\n"
                + "[5] – Buscar Funcionário por Nome\n"
                + "[6] – Listar Departamentos com Funcionários com Faixa Salarial Específica\n"
                + "[7] – Listar Funcionários com Faixa Salarial Específica\n"
                + "[8] – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica\n"
                + "[9] – Listar todos Funcionários da Universidade\n"
                + "[10] – Listar todos Departamentos da Universidade\n"
                + "[11] – Listar todos Departamentos da Universidade e seus Respectivos Funcionários\n"
                + "[12] – Listar todos Funcionários Docente\n"
                + "[13] – Listar todos Funcionários Técnico\n"
                + "[0] – Sair\n";

        String nome, codigo, especifico;
        double salario;

        int opc = 14;
        while (opc != 0) {
            System.out.print(menu);
            System.out.print("opcao: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("== Cadastrar novo departamento ==");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Codigo: ");
                    codigo = sc.nextLine();
                    System.out.print("Max de funcionarios: ");
                    int numMaxFuncionarios = Integer.parseInt(sc.nextLine());

                    universidades.criarDepartamento(nome, codigo, numMaxFuncionarios);
                    break;
                case 2:
                    System.out.println("== Cadastrar Funcionario Técnico ==");
                    System.out.print("Nome do departamento: ");
                    String nomeDepartamento = sc.nextLine();
                    if (universidades.verificarDepartamento(nomeDepartamento) ) {
                        Departamento departamento = universidades.buscarDepartamento(nomeDepartamento);
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        System.out.print("Codigo: ");
                        codigo = sc.nextLine();
                        System.out.print("Salario: ");
                        salario = Double.parseDouble(sc.nextLine());
                        System.out.print("Nivel: ");
                        especifico = sc.nextLine();

                        departamento.criarFuncionario(nome, codigo,salario,1,especifico);

                    }else{
                        System.out.println("Departamento nao encontrado");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("== Cadastrar Funcionario Docente ==");
                    System.out.print("Nome do departamento: ");
                    nomeDepartamento = sc.nextLine();
                    if (universidades.verificarDepartamento(nomeDepartamento) ) {
                        Departamento departamento = universidades.buscarDepartamento(nomeDepartamento);
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        System.out.print("Codigo: ");
                        codigo = sc.nextLine();
                        System.out.print("Salario: ");
                        salario = Double.parseDouble(sc.nextLine());
                        System.out.print("Titulacao: ");
                        especifico = sc.nextLine();

                        departamento.criarFuncionario(nome, codigo,salario,2,especifico);

                    }else{
                        System.out.println("Departamento nao encontrado");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("== Buscar Departamento por Nome==");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    Departamento departamento = universidades.buscarDepartamento(nome);
                    if(departamento != null){
                        System.out.print(departamento.toString());
                    }else{
                        System.out.println("Departamento nao encontrado");
                    };
                    break;
                case 5:
                    System.out.println("== Buscar Funcionario por Nome==");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    for(int i=0; i< universidades.qntDepartamentos; i++){
                        departamento = universidades.departamentos[i];
                        if(departamento.buscarFuncionario(nome)!= null){
                            System.out.print(departamento.buscarFuncionario(nome).toString());
                        }
                        else{
                            System.out.println("Funcionario nao encontrado");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!!!!");
            }
        }
    }
}
