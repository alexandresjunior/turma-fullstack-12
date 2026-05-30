package br.com.treina.recife.sgp.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

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
    
}
