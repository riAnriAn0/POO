public class App {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("909-434-4344-43", "Senhor dos aneis", 5);
        
        livro.adicionarCapitulo(new Capitulo("CAP 1", 55));
        livro.adicionarCapitulo(new Capitulo("CAP 2", 13));
        livro.adicionarCapitulo(new Capitulo("CAP 3", 14));
        
        livro.exibirRelatorio();
    }
}
