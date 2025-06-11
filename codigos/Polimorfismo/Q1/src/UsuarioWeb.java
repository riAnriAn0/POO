public class UsuarioWeb extends Usuario implements Autenticar {

    public UsuarioWeb(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Usuario Web autenticado");
        return true;
    }
}
