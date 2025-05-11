/* 
 * Crie uma classe Data com os atributos mês (int), dia (int) e ano (int). Implemente métodos get e set, e um construtor para inicializar os valores. Implemente também um método displayData() que mostre a data no formato dd/mm/aaaa. Crie a classe DataTeste para demonstrar sua funcionalidade.
 */
import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        

        System.out.println("======== Cofig Data ========");
        System.out.print("Dia: ");
        int dia =  Integer.parseInt(input.nextLine());
        System.out.print("Mes: ");
        int mes =  Integer.parseInt(input.nextLine());
        System.out.print("Ano: ");
        int ano =  Integer.parseInt(input.nextLine());

        Data dt = new Data(dia, mes, ano);

        dt.displayData();
        
        input.close();
    }
}
