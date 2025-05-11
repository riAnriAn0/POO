import java.util.Scanner;

public class Sistema {
    private int MAX = 100;
    private Aluno alunos[];
    private int cont;

    public int menu() {
        String menu = "MENU \n" +
                "[1] - Cadastrar\n" +
                "[2] - Listar\n" +
                "[3] - Buscar\n" +
                "[0] - Sair\n";

        Scanner sc = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("Escolha uma opição");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public void executar() {
        int op = 0;
        String nome;
        String matricula;
        float t1;
        float t2;
        alunos = new Aluno[MAX];
        cont = 0;

        Scanner sc = new Scanner(System.in);

        do {
            op = menu();
            switch (op) {
                case 1:
                    if (cont < MAX) {

                        System.out.print("Nome: ");
                        nome = sc.nextLine();

                        System.out.print("Matricula: ");
                        matricula = sc.nextLine();

                        System.out.print("T1: ");
                        t1 = Float.parseFloat(sc.nextLine());

                        System.out.print("T2: ");
                        t2 = Float.parseFloat(sc.nextLine());

                        alunos[cont] = new Aluno(nome, matricula);
                        cont++;
                    } else {
                        System.out.print("A lista esta cheia!!!");
                    }
                    break;
                case 2:
                    System.out.println("===== LISTA =====");
                    for (int i = 0; i < cont; i++) {
                        System.out.println(" - " + alunos[i].getNome());
                    }
                    break;
                case 3:
                    System.out.print("Buscar por nome: ");
                    nome = sc.nextLine();
                    for (int i = 0; i < cont; i++) {
                        if (nome == alunos[i].getNome() && alunos[i] != null) {
                            System.out.println(" - " + alunos[i].getNome() + " - " + alunos[i].getMatricula());
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (op != 0);
    }

}
