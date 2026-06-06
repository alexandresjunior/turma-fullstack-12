package br.com.treina.recife.sgp.api.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgp.api.dto.DadosProjeto;
import br.com.treina.recife.sgp.api.enums.StatusProjeto;
import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.service.ProjetoService;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<Projeto> cadastrar(@RequestBody Projeto projeto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projetoService.salvarProjeto(projeto));
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> listar() {
        return ResponseEntity.ok(projetoService.listarProjetos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> buscarPeloId(@PathVariable Long id) {
        Projeto projeto = projetoService.buscarProjeto(id);

        if (Objects.isNull(projeto)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(projeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        Projeto projeto = projetoService.buscarProjeto(id);

        if (Objects.isNull(projeto)) {
            return ResponseEntity.notFound().build();
        }

        projetoService.excluirProjeto(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> atualizar(
        @PathVariable Long id,
        @RequestBody Projeto dadosAtualizados
    ) {
        Projeto projeto = projetoService.buscarProjeto(id);

        if (Objects.isNull(projeto)) {
            return ResponseEntity.notFound().build();
        }

        dadosAtualizados.setId(id);
        return ResponseEntity.ok(projetoService.salvarProjeto(dadosAtualizados));
    }

    @GetMapping("/busca")
    public ResponseEntity<List<DadosProjeto>> buscarPeloStatus(@RequestParam StatusProjeto status) {
        return ResponseEntity.ok(projetoService.buscarPeloStatus(status));
    }

    @GetMapping("/responsavel/{id}")
    public ResponseEntity<List<DadosProjeto>> buscarPeloResponsavel(@PathVariable("id") Long usuarioRespId) {
        return ResponseEntity.ok(projetoService.buscarPeloResponsavel(usuarioRespId));
    }

}
