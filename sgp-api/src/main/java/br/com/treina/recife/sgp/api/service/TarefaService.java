package br.com.treina.recife.sgp.api.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.dto.DadosTarefa;
import br.com.treina.recife.sgp.api.model.Tarefa;
import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    // INSERT INTO TB_TAREFAS ... VALUES ... (SE NÃO TIVER ID VALORADO)
    // UPDATE TB_TAREFAS ... VALUES ... (SE FOR PASSADO UM ID VÁLIDO)
    public Tarefa salvarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // SELECT * FROM TB_TAREFAS
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    // SELECT * FROM TB_TAREFAS WHERE id = ?
    public Tarefa buscarTarefa(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    // DELETE FROM TB_TAREFAS WHERE id = ?
    public void excluirTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }

    private DadosTarefa converterParaDTO(Tarefa tarefa) {
        Usuario usuario = tarefa.getUsuario();

        Long usuarioId = Objects.nonNull(usuario) ? usuario.getId() : null;
        String usuarioNome = Objects.nonNull(usuario) ? usuario.getNome() : null;

        return new DadosTarefa(
            tarefa.getId(), 
            tarefa.getTitulo(), 
            tarefa.getDescricao(), 
            tarefa.getDataCriacao(), 
            tarefa.getDataConclusao(), 
            tarefa.getPrioridade().toString(), 
            tarefa.getStatus().toString(), 
            tarefa.getProjeto().getId(), 
            tarefa.getProjeto().getNome(), 
            usuarioId,
            usuarioNome 
        );
    }

    public List<DadosTarefa> buscarPeloProjeto(Long projetoId) {
        return tarefaRepository.findByProjeto_Id(projetoId)
                               .stream().map(tarefa -> converterParaDTO(tarefa)).toList();
    }
    
}
