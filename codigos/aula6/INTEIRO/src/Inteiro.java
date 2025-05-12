/* Implemente a classe InteiroSet, capaz de armazenar inteiros no intervalo de 0 a 100, utilizando um array de boolean. O valor true indica a presença do número no conjunto. Implemente os métodos:
- union: retorna a união entre dois conjuntos (OU lógico).
- interseccao: retorna a interseção entre dois conjuntos (E lógico).
- insereElemento(int k): adiciona o elemento k ao conjunto.
- deleteElemento(int m): remove o elemento m do conjunto.
- toSetString(): retorna os elementos presentes como string separada por espaços, ou “–” se o conjunto for vazio.
- ehIgualA(InteiroSet outroSet): verifica se dois conjuntos são iguais. */

import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        InteiroSet lista = new InteiroSet();

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numerode 0 a 100 a lista: ");
            lista.insereElemento(input.nextInt());
            // input.nextLine();
        }

        System.out.println(lista.toSetString());


        input.close();
    }
}
