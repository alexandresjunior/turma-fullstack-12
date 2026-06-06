package entidades;

import java.util.ArrayList;
import java.util.List;

import enums.Modalidade;

public class Curso {

    private String nome;
    private Modalidade modalidade;
    private Professor professorResponsavel;
    private List<Aluno> alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(String nome, Modalidade modalidade, Professor professorResponsavel, List<Aluno> alunos) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.professorResponsavel = professorResponsavel;
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (this.alunos != null) {
            this.alunos.add(aluno);
        } else {
            System.out.println("Não é possível adicionar aluno em uma lista NULL.");
        }
    }

    public void listarAlunos() {
        System.out.println("---- Lista de Alunos ----");
        for (Aluno aluno : alunos) {
            System.out.println("-- Nome: " + aluno.getNome());
        }
    }

}
