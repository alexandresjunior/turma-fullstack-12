package br.com.treina.recife.sgp.api.controller;

import java.time.LocalDate;
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

import br.com.treina.recife.sgp.api.dto.DadosLogin;
import br.com.treina.recife.sgp.api.dto.DadosUsuario;
import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<DadosUsuario> cadastrar(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioService.salvarUsuario(usuario));
    }

    @GetMapping
    public ResponseEntity<List<DadosUsuario>> listar() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosUsuario> buscarPeloId(@PathVariable Long id) {
        DadosUsuario usuario = usuarioService.buscarUsuario(id);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        DadosUsuario usuario = usuarioService.buscarUsuario(id);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        usuarioService.excluirUsuario(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadosUsuario> atualizar(
        @PathVariable Long id,
        @RequestBody Usuario dadosAtualizados
    ) {
        DadosUsuario usuario = usuarioService.buscarUsuario(id);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        dadosAtualizados.setId(id);
        return ResponseEntity.ok(usuarioService.salvarUsuario(dadosAtualizados));
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<DadosUsuario> buscarPeloCPF(@PathVariable String cpf) {
        DadosUsuario usuario = usuarioService.buscarPeloCPF(cpf);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<DadosUsuario> buscarPeloEmail(@PathVariable String email) {
        DadosUsuario usuario = usuarioService.buscarPeloEmail(email);

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<DadosUsuario> buscarPeloEmailESenha(@RequestBody DadosLogin dadosLogin) {
        DadosUsuario usuario = usuarioService.buscarPeloEmailESenha(dadosLogin.email(), dadosLogin.senha());

        if (Objects.isNull(usuario)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/busca")
    public ResponseEntity<List<DadosUsuario>> buscarPeloNome(@RequestParam String nome) {
        return ResponseEntity.ok(usuarioService.buscarPeloNome(nome));
    }

    @GetMapping("/filtro")
    public ResponseEntity<List<DadosUsuario>> filtrarPelaDataNascimento(
        @RequestParam LocalDate dataInicio, 
        @RequestParam LocalDate dataFinal
    ) {
        return ResponseEntity.ok(usuarioService.filtrarPelaDataNascimento(dataInicio, dataFinal));
    }

}
