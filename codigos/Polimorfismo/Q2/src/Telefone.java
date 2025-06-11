public class Telefone extends Contato {
    private String telefone;

    public Telefone(String tipo, String telefone) {
        super(tipo);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void exibir() {
        System.out.println("Telefone: " + telefone);
    }

}
