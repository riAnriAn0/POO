public class App {
    public static void main(String[] args) throws Exception {
        ListaOrdenada lista = new ListaOrdenada(10);
        Lista lista2 = new Lista(10);

        for (int i = 10; i > 0; i--) {
            lista.add(i);
            lista2.add(i);
        }

        lista.imprimir();
        lista.remove(5);
        lista.imprimir();

        lista2.imprimir();

        System.out.println("Tamanho :"+lista.getQntElemento());
        System.out.println("Buscar :"+lista.buscar(8));
    }
}
