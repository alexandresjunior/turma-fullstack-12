import java.time.LocalDate;

public class Usuario implements Repositorio {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String telefone;
    private LocalDate dataNascimento;
    private String status;

    public Usuario(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario(String nome, String cpf, String email, String senha, String telefone, LocalDate dataNascimento,
            String status) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirDetalhes() {
        System.out.println("USUÁRIO -------");
        System.out.println("NOME: " + nome);
        System.out.println("EMAIL: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("STATUS: " + status);
    }

    @Override
    public void cadastrar() {
        System.out.println("Usuário cadastradao com sucesso!");
    }

    @Override
    public void listar() {
        System.out.println("Lista de usuários");
    }

    @Override
    public void atualizar() {
        System.out.println("Usuário atualizado com sucesso!");
    }

    @Override
    public void excluir() {
        System.out.println("Usuário removido com sucesso!");
    }

}
