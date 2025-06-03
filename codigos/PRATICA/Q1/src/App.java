public class App {
    public static void main(String[] args) throws Exception {
        Peca p1 = new Peca("Martelo", 10, 3);
        PecaImportada pI1 = new PecaImportada("Chave", 10,3, 5, 20);

        p1.Exibir();
        pI1.Exibir();
    }
}
