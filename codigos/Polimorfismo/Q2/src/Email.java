public class Email extends Contato {
    private String email;

    public Email(String tipo, String email) {
        super(tipo);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void exibir() {
        System.out.println("Email: " + email);
    }


}
