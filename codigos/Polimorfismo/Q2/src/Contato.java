public abstract class Contato {
    protected String tipo;

    public Contato(String tipo) {
        this.tipo = tipo;
    }

    public void exibir() {
    }

    protected abstract Object getEmail();

    protected abstract Object getTelefone();

}
