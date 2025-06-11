public class UsuarioApi extends Usuario implements Autenticar {

    public UsuarioApi(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Usuario API autenticado");
        return true;
    }
}
