//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioApi usuarioApi = new UsuarioApi("usuarioAPI", "usuario@gmail.com");
        UsuarioWeb usuarioWeb = new UsuarioWeb("usuarioWEB", "usuario@gmail.com");
        UsuarioMobile usuarioMobile = new UsuarioMobile("usuarioMibile","ususario@gmail.com");

        Usuario[] usuarios = new Usuario[]{usuarioWeb, usuarioMobile, usuarioApi};

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i].exibir();
        }

    }
}