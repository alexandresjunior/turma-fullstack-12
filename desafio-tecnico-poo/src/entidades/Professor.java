package entidades;

import abstratas.Pessoa;
import interfaces.Autenticavel;

public class Professor extends Pessoa implements Autenticavel {

    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor() {
    }

    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String nome, String email, Endereco endereco, String especialidade, double salario) {
        super(nome, email, endereco);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Professor:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: " + salario);
    }

    @Override
    public boolean realizarLogin() {
        System.out.println("Professor logado com sucesso!");
        return true;
    }

}
