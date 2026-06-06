import java.time.LocalDate;

import entidades.Projeto;
import entidades.Tarefa;
import entidades.Usuario;
import enums.PrioridadeTarefa;
import enums.StatusProjeto;
import enums.StatusTarefa;
import enums.StatusUsuario;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciando objeto da classe Usuario
        Usuario usuario = new Usuario();

        usuario.setId(1L);
        usuario.setNome("Ana Carolina de Souza");
        usuario.setCpf("123.456.789-00");
        usuario.setEmail("anacarolina@gmail.com");
        usuario.setSenha("ana@123");
        usuario.setDataNascimento(LocalDate.of(1995, 4, 12));
        usuario.setStatus(StatusUsuario.ATIVO);

        // Instanciando objeto da classe Projeto
        Projeto projeto = new Projeto();

        projeto.setId(1L);
        projeto.setNome("Sistema de Gestão de Projetos (SGP)");
        projeto.setDataInicio(LocalDate.of(2026, 5, 9));
        projeto.setStatus(StatusProjeto.ATIVO);
        projeto.setResponsavel(usuario);

        // Instanciando objeto da classe Tarefa
        Tarefa tarefa = new Tarefa();

        tarefa.setId(1L);
        tarefa.setTitulo("Criação das entidades do sistema");
        tarefa.setDataCriacao(LocalDate.now());
        tarefa.setPrioridade(PrioridadeTarefa.ALTA);
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        tarefa.setProjeto(projeto);
        tarefa.setUsuario(usuario);
    }
}
