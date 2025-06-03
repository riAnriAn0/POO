public class ListaOrdenada extends Lista {
    public ListaOrdenada(int tamanho) {
        super(tamanho);
    }

    @Override
    public void add(int elemento){
        if (qntElemento >= tamanho) {
            System.out.println("Lista cheia!");
            return;
        }

        int posicao = 0;
        while (posicao < qntElemento && lista[posicao] < elemento) {
            posicao++;
        }

        for (int i = qntElemento; i > posicao; i--) {
            lista[i] = lista[i - 1];
        }

        lista[posicao] = elemento;
        qntElemento++;
    }
}
