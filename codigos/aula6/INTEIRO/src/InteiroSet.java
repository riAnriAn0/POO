public class InteiroSet {
    private boolean[] conjunto = new boolean[101];

    // União entre dois conjuntos
    public static InteiroSet union(InteiroSet conj1, InteiroSet conj2) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = conj1.conjunto[i] || conj2.conjunto[i];
        }
        return resultado;
    }

    // Interseção entre dois conjuntos
    public static InteiroSet interseccao(InteiroSet conj1, InteiroSet conj2) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = conj1.conjunto[i] && conj2.conjunto[i];
        }
        return resultado;
    }

    // Inserir elemento no conjunto
    public void insereElemento(int k) {
        if (k < 0 || k > 100) {
            System.out.println("Número fora do intervalo permitido!");
            return;
        }
        conjunto[k] = true;
    }

    // Remover elemento do conjunto
    public void deleteElemento(int m) {
        if (m < 0 || m > 100) {
            System.out.println("Número fora do intervalo permitido!");
            return;
        }
        conjunto[m] = false;
    }

    // Retornar o conjunto como string
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
            }
        }
        return sb.length() > 0 ? sb.toString().trim() : "-";

    }

    // Verifica se dois conjuntos são iguais
    public boolean ehIgualA(InteiroSet outroSet) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != outroSet.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}
