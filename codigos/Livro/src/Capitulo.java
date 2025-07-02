public class Capitulo {
    private static int contadorCapitulos = 0;
    private int numero;
    private String titulo;
    private int qntPaginas;

    public Capitulo(String titulo, int qntPaginas) {
        contadorCapitulos++;
        this.numero = contadorCapitulos;
        this.titulo = titulo;
        this.qntPaginas = qntPaginas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

}
