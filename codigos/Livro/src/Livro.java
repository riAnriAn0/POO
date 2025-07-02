public class Livro {
    private String isbn;
    private String titulo;
    private int qntCapitulos;
    private Capitulo[] capitulos;

    public Livro(String isbn, String titulo, int qntCapitulos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.qntCapitulos = qntCapitulos;
        this.capitulos = new Capitulo[qntCapitulos];
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntCapitulos() {
        return qntCapitulos;
    }

    public void setQntCapitulos(int qntCapitulos) {
        this.qntCapitulos = qntCapitulos;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public void exibirRelatorio() {
        System.out.println("==== RELAT RIO DO LIVRO ====");
        System.out.println("Editora: " + Constantes.EDITRA);
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Quantidade de Capítulos: " + qntCapitulos);
        System.out.println("    Capítulos  ");
        System.out.println("==============================");
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] != null) {
                System.out.println("Capítulo " + (i + 1) + ": " + capitulos[i].getTitulo() + "("
                        + capitulos[i].getQntPaginas() + " páginas)");
            }
        }
        System.out.println("==============================");
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] == null) {
                capitulos[i] = capitulo;
                return;
            }
        }
        System.out.println("Não é possível adicionar mais capítulos, limite atingido.");
    }
}