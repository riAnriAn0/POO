import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("======= Dados Emprecado ====");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("Salario: ");
        double salario = input.nextDouble();
        input.nextLine();

        Empregado em1 = new Empregado(nome, sobrenome, salario);
        
        System.out.println("======= Dados Emprecado ====");
        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = input.nextLine();
        System.out.print("Salario: ");
        salario = input.nextDouble();

        Empregado em2 = new Empregado(nome, sobrenome, salario);

        System.out.println(" === Listas === ");
        System.out.println("Nome: "+ em1.getNome()+" "+ em1.getSobrenome());
        System.out.println("Salario: "+em1.getSalario());
        System.out.println("Nome: "+ em2.getNome()+" "+ em2.getSobrenome());
        System.out.println("Salario: "+em2.getSalario());

    }
}
