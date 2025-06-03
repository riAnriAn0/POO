public class Lista {
    protected int tamanho;
    protected int qntElemento = 0;
    protected int[] lista;

    public Lista(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void add(int elemento){
        lista[qntElemento] = elemento;
        qntElemento++;
    }

    public void remove(int elemento){
        int posicao = -1;
        for (int i = 0; i < qntElemento; i++) {
            if (lista[i] == elemento) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            for (int i = posicao; i < qntElemento - 1; i++) {
                lista[i] = lista[i + 1];
            }
            lista[qntElemento - 1] = 0;
            qntElemento--;
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public int getQntElemento(){
        return qntElemento;
    }

    public int buscar(int posicao){
        if (posicao < 0 && posicao > qntElemento){
            System.out.println("Posicao invalida!");
            return 0;
        }
        return lista[posicao];
    }

    public void imprimir(){
        System.out.println("Lista: ");
        System.out.print("[");
        for(int i = 0; i < qntElemento; i++){
            System.out.print(lista[i] + " - ");
        }
        System.out.println("]");
    }
}
