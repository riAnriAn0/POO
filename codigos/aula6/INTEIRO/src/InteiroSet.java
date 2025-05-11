/* Implemente a classe InteiroSet, capaz de armazenar inteiros no intervalo de 0 a 100, utilizando um array de boolean. O valor true indica a presença do número no conjunto. Implemente os métodos:
- union: retorna a união entre dois conjuntos (OU lógico).
- interseccao: retorna a interseção entre dois conjuntos (E lógico).
- insereElemento(int k): adiciona o elemento k ao conjunto.
- deleteElemento(int m): remove o elemento m do conjunto.
- toSetString(): retorna os elementos presentes como string separada por espaços, ou “–” se o conjunto for vazio.
- ehIgualA(InteiroSet outroSet): verifica se dois conjuntos são iguais. */

public class InteiroSet{
    private boolean[] conjunto = new boolean[101];

    public void init(){
        this.conjunto = {false};
    }

    public boolean[] union(InteiroSet conj1, InteiroSet conj2){
        boolean un[] = {};
        for (int i = 0; i < conj1.conjunto.length; i++) {
            if (conj1.conjunto[i] || conj2.conjunto[i]) {
                un[i] = true;
            }else{
                un[i] = false;
            }
        }
        return un;
    }

    public boolean[] interseccao(InteiroSet conj1, InteiroSet conj2){
        boolean inter[] = {};
        for (int i = 0; i < conj1.conjunto.length; i++) {
            if (conj1.conjunto[i] && conj2.conjunto[i]) {
                inter[i] = true;
            }else{
                inter[i] = false;
            }
        }

        return inter;
    }

    public void insereElemento(int k) {
        if (k < 0 || k > 100) {
            System.out.print("Numero fora do intervalo permititdo!!!");
            return;
        }
        this.conjunto[k] = true;
    }
    
    public void deleteElemento(int m) {
        if (m < 0 || m > 100) {
            System.out.print("Numero fora do intervalo permititdo!!!");
            return;
        }
        this.conjunto[m] = false;
    }

    public void toSetString() {

        System.out.println("==== Lista ====");
        for (int i = 0; 0 < conjunto.length; i++) {
            if (conjunto[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public boolean ehIgualA(InteiroSet conj1, InteiroSet conj2) {
        for (int i = 0; i < conj1.conjunto.length; i++) {
            if (conj1.conjunto[i] != conj2.conjunto[i]) {
                System.out.println("Os conjuntos sao diferentes!!!");
                return false;
            }

        }
        return true;

    }

}
