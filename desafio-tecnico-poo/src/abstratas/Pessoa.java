package abstratas;

import entidades.Endereco;

public abstract class Pessoa {

    private String nome;
    private String email;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void exibirDetalhes();

}
