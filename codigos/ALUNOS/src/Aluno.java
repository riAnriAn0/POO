
public class Aluno {
    private String nome;
    private String matricula;
    private float t1;
    private float t2;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public float calculaMedia() {
        float soma = this.t1 + this.t2;
        return soma / 4.0f;
    }

    public boolean aprovado() {
        if (this.calculaMedia() >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public float getT1() {
        return this.t1;
    }

    public float getT2() {
        return this.t2;
    }

}
