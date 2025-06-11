public class UsuarioMobile extends Usuario implements Autenticar{

    public UsuarioMobile(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Usuario Mobile autenticado");
        return true;
    }

}
