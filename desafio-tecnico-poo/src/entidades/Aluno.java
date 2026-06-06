package entidades;

import abstratas.Pessoa;

public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno() {
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Aluno:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Matrícula: " + matricula);
    }
    
}
