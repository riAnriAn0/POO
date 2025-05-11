import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Lista l = new Lista();
       
        System.out.println("===== LITAS =====");
        System.out.print("Defina o tamanho da lista: ");
        
        int tam = input.nextInt();
        l.inicializar(tam);

        int item = 0;

        for(int i = 0; i < tam; i++){
            System.out.print((i+1)+"º item: ");
            item = input.nextInt();
            l.add(item);
        }
        l.exibir();
    }
}
