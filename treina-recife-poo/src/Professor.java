public class Professor {

    private String nome;
    private String especialidade;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void exibirDados() {
        System.out.println("Dados do Professor: ");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
    }

}