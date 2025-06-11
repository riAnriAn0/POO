public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max) {
        this.nome = nome;
        this.max = max;
        this.cont = 0;
        this.contatos = new Contato[max];
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void addContato(Contato c){
        if(cont < max){
            contatos[cont] = c;
            cont++;
        }else{
            System.out.println("Atingiu o max de contatos");
        }
    }

    public Contato[] getContatos(){
        return contatos;
    }

    public Contato[] getContatosTipo(String tipo){
        Contato[] c = new Contato[this.cont];
        int cont = 0;
        for (int i = 0; i < this.cont; i++) {
            if(contatos[i].getClass().getSimpleName().equals(tipo)){
                c[cont] = contatos[i];
                cont++;
            }
        }
        return c;
    }

    public boolean possuiEmail(){
        for (int i = 0; i < cont; i++) {
            if("Email".equals(contatos[i].tipo)){
                return true;
            }
        }
        return false;
    }

    public boolean possuiTelefone(){
        for (int i = 0; i < cont; i++) {
            if("Telefone".equals(contatos[i].tipo)){
                return true;
            }
        }
        return false;
    }

    public void exibirContatos(){
        System.out.println("------------------------");
        System.out.println("Nome: " + nome+" lista de contatos ");
        for (int i = 0; i < cont; i++) {
            if(contatos[i] != null){
                contatos[i].exibir();
            }
        }
        System.out.println("------------------------");
    }

}
