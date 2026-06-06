package br.com.treina.recife.sgp.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.dto.DadosProjeto;
import br.com.treina.recife.sgp.api.enums.StatusProjeto;
import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private TarefaService tarefaService;

    // INSERT INTO TB_PROJETOS ... VALUES ... (SE NÃO TIVER ID VALORADO)
    // UPDATE TB_PROJETOS ... VALUES ... (SE FOR PASSADO UM ID VÁLIDO)
    public Projeto salvarProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    // SELECT * FROM TB_PROJETOS
    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    // SELECT * FROM TB_PROJETOS WHERE id = ?
    public Projeto buscarProjeto(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }

    // DELETE FROM TB_PROJETOS WHERE id = ?
    public void excluirProjeto(Long id) {
        projetoRepository.deleteById(id);
    }

    public List<DadosProjeto> buscarPeloStatus(StatusProjeto status) {
        return projetoRepository.findByStatus(status)
                                .stream().map(projeto -> converterParaDTO(projeto)).toList();
    }

    public List<DadosProjeto> buscarPeloResponsavel(Long usuarioRespId) {
        return projetoRepository.findByResponsavel_Id(usuarioRespId)
                                .stream().map(projeto -> converterParaDTO(projeto)).toList();
    }

    private DadosProjeto converterParaDTO(Projeto projeto) {
        return new DadosProjeto(
            projeto.getId(), 
            projeto.getNome(), 
            projeto.getDescricao(), 
            projeto.getDataInicio(), 
            projeto.getDataConclusao(), 
            projeto.getStatus().toString(), 
            projeto.getResponsavel().getId(), 
            projeto.getResponsavel().getNome(), 
            tarefaService.buscarPeloProjeto(projeto.getId())
        );
    }
    
}
