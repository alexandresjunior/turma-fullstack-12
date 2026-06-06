public class Curso {

    private String nome;
    private int cargaHoraria;
    private Professor professorResponsavel;

    public Curso() {

    }

    public Curso(String nome, int cargaHoraria, Professor professorResponsavel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void detalhesCurso() {
        System.out.println("Detalhes do curso:");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h");

        // Adicionando um "null check"
        if (professorResponsavel != null) {
            professorResponsavel.exibirDados();
        }
    }

}
