public class Lista {
    private int vetor[];
    private int cont;
    private int max;

    public void inicializar(int tam) {
        cont = 0;
        vetor = new int[tam];
        max = tam;
    }

    public boolean estaCheia() {
        if (cont == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaVazia() {
        if (cont == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int elemento) {
        if (!estaCheia()) {
            vetor[cont] = elemento;
            cont++;
        } else {
            System.out.println("A lista esta cheia!!!!");
        }
    }

    public int buscar(int elemento) {
        for (int i = 0; i < cont; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }

        return -1;
    }

    public void remover(int elemento) {
        int pos = buscar(elemento);
        if (pos != -1) {
            vetor[pos] = vetor[cont - 1];
            cont--;
        }
    }

    public void exibir() {
        if (!estaVazia()) {
            System.out.print("\n| ");
            for (int i = 0; i < cont; i++) {
                System.out.print(vetor[i] + " | ");
            }
        } else {
            System.out.println("\n A lista esta vazia!!!");
        }
    }

}