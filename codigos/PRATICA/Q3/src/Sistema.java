import java.util.Scanner;

public class Sistema {
    public static void iniciar() {

        Scanner sc = new Scanner(System.in);
        Universidade universidade = new Universidade("IFMA", 3);

        String menu = "      Menu     \n"
                + "[1] – Cadastrar Departamento\n"
                + "[2] – Cadastrar Funcionário Técnico\n"
                + "[3] – Cadastrar Funcionário Docente\n"
                + "[4] – Buscar Departamento por Nome\n"
                + "[5] – Buscar Funcionário por Nome\n"
               +  "[6] - Listar Departamentos com Funcionários com Faixa Salarial Específica\n"
                + "[7] – Listar Funcionários com Faixa Salarial Específica\n"
                + "[8] – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica\n"
                + "[9] – Listar todos Funcionários da Universidade\n"
                + "[10] – Listar todos Departamentos da Universidade\n"
                + "[11] – Listar todos Departamentos da Universidade e seus Respectivos Funcionários\n"
                + "[12] – Listar todos Funcionários Docente\n"
                + "[13] – Listar todos Funcionários Técnico\n"
                + "[0] –  Sair\n";

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

                    universidade.criarDepartamento(nome, codigo, numMaxFuncionarios);
                    break;
                case 2:
                    System.out.println("== Cadastrar Funcionario Técnico ==");
                    System.out.print("Nome do departamento: ");
                    String nomeDepartamento = sc.nextLine();
                    if (universidade.verificarDepartamento(nomeDepartamento) ) {
                        Departamento departamento = universidade.buscarDepartamento(nomeDepartamento);
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
                    if (universidade.verificarDepartamento(nomeDepartamento) ) {
                        Departamento departamento = universidade.buscarDepartamento(nomeDepartamento);
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
                    Departamento departamento = universidade.buscarDepartamento(nome);
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

                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        departamento = universidade.departamentos[i];
                        if(departamento.buscarFuncionario(nome)!= null){
                            System.out.print(departamento.buscarFuncionario(nome).toString());
                        }
                        else{
                            System.out.println("Funcionario nao encontrado");
                        }
                    }
                    break;
                case 6:
                    System.out.println(" ==== Faixa Salarial ====");
                    System.out.print("Salario De: ");
                    Double de = Double.parseDouble(sc.nextLine());
                    System.out.print("Até: ");
                    Double ate = Double.parseDouble(sc.nextLine());

                    System.out.println(" ==== Departamentos com Faixa Salarial de "+de+" ate "+ate );
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        if ( d.calcularGastosFuncionarios() >= de && d.calcularGastosFuncionarios() <= ate ){
                            System.out.println(d.getNome());
                        }
                    }
                    System.out.println("");
                    break;
                case 7:
                    System.out.println(" ==== Faixa Salarial ====");
                    System.out.print("Salario De: ");
                    de = Double.parseDouble(sc.nextLine());
                    System.out.print("Até: ");
                    ate = Double.parseDouble(sc.nextLine());

                    System.out.println(" ==== Funcionarios com Faixa Salarial de "+de+" ate "+ate );
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        for (int j = 0; j < d.qntFuncionarios; j++) {
                            Funcionario f = d.funcionarios[j];
                            if(f.getSalario() >= de && f.getSalario() <= ate ){
                                System.out.println("Nome: "+f.getNome()+" -- "+d.getNome());
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 8:
                    System.out.println(" ==== Faixa Salarial ====");
                    System.out.print("Salario De: ");
                    de = Double.parseDouble(sc.nextLine());
                    System.out.print("Até: ");
                    ate = Double.parseDouble(sc.nextLine());

                    System.out.println(" ==== Departamentos com Faixa Salarial de "+de+" ate "+ate );
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        if ( d.calcularGastosFuncionarios() >= de && d.calcularGastosFuncionarios() <= ate ){
                            System.out.println(d.getNome());
                        }
                    }
                    System.out.println("");
                    break;
                case 9:
                    System.out.println(" ==== Universidade "+ universidade.getNome() +" ====" );
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        for (int j = 0; j < d.qntFuncionarios; j++) {
                            Funcionario f = d.funcionarios[j];
                            System.out.println(" - "+ f.getNome());
                        }
                    }
                    break;
                case 10:
                    System.out.println(" ==== Departamentos ====");
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        System.out.println(" - "+ d.getNome());
                    }
                    break;
                case 11:
                    System.out.println(" ==== Funcionarios por Departamentos ====");
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        System.out.println(" + "+ d.getNome());
                        for (int j = 0; j < d.qntFuncionarios; j++) {
                            Funcionario f = d.funcionarios[j];
                            System.out.println("    - "+ f.getNome());
                        }
                    }
                    break;
                case 12:
                    System.out.println(" ==== Funcionarios Docentes ====");
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        for (int j = 0; j < d.qntFuncionarios; j++) {
                            Funcionario f = d.funcionarios[j];
                            if(f.getClass().getSimpleName().equals("FuncionarioDocente")){
                                System.out.println("- " + f.getNome());
                            }
                        }
                    }
                    break;
                case 13:
                    System.out.println(" ==== Funcionarios Tecnico ====");
                    for(int i=0; i< universidade.qntDepartamentos; i++){
                        Departamento d = universidade.departamentos[i];
                        for (int j = 0; j < d.qntFuncionarios; j++) {
                            Funcionario f = d.funcionarios[j];
                            if(f.getClass().getSimpleName().equals("FuncionarioTecnico")){
                                System.out.println("- " + f.getNome());
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo .......");
                    opc = 0;
                    break;
                default:
                    System.out.println("Opcao invalida!!!!");
            }
        }
    }
}
