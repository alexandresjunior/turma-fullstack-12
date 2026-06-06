package br.com.treina.recife.sgp.api.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.dto.DadosUsuario;
import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // INSERT INTO TB_USUARIOS ... VALUES ... (SE NÃO TIVER ID VALORADO)
    // UPDATE TB_USUARIOS ... VALUES ... (SE FOR PASSADO UM ID VÁLIDO)
    public DadosUsuario salvarUsuario(Usuario usuario) {
        return converterParaDTO(usuarioRepository.save(usuario));
    }

    // SELECT * FROM TB_USUARIOS
    public List<DadosUsuario> listarUsuarios() {
        return usuarioRepository.findAll()
                                .stream().map(usuario -> converterParaDTO(usuario)).toList();
    }

    // SELECT * FROM TB_USUARIOS WHERE id = ?
    public DadosUsuario buscarUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);

        if (Objects.isNull(usuario)) {
            // TODO: Lançar exceção.
            return null;
        }

        return converterParaDTO(usuario);
    }

    // DELETE FROM TB_USUARIOS WHERE id = ?
    public void excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    private String mascararCPF(String cpf) {
        return cpf.substring(0, 3) + ".***.***-**";
    }

    private Integer calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        return periodo.getYears();
    }

    private DadosUsuario converterParaDTO(Usuario usuario) {
        return new DadosUsuario(
            usuario.getId(),
            usuario.getNome(),
            usuario.getEmail(),
            mascararCPF(usuario.getCpf()),
            calcularIdade(usuario.getDataNascimento()),
            usuario.getDataNascimento(),
            usuario.getStatus().toString()
        );
    }

    public DadosUsuario buscarPeloCPF(String cpf) {
        Usuario usuario = usuarioRepository.findByCpf(cpf).orElse(null);

        if (Objects.isNull(usuario)) {
            // TODO: Lançar exceção.
            return null;
        }

        return converterParaDTO(usuario);
    }

    public DadosUsuario buscarPeloEmail(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElse(null);

        if (Objects.isNull(usuario)) {
            // TODO: Lançar exceção.
            return null;
        }

        return converterParaDTO(usuario);
    }

    public DadosUsuario buscarPeloEmailESenha(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmailAndSenha(email, senha).orElse(null);

        if (Objects.isNull(usuario)) {
            // TODO: Lançar exceção.
            return null;
        }

        return converterParaDTO(usuario);
    }

    public List<DadosUsuario> buscarPeloNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome)
                                .stream().map(usuario -> converterParaDTO(usuario)).toList();
    }

    public List<DadosUsuario> filtrarPelaDataNascimento(LocalDate dataInicio, LocalDate dataFinal) {
        return usuarioRepository.findByDataNascimentoBetween(dataInicio, dataFinal)
                                .stream().map(usuario -> converterParaDTO(usuario)).toList();
    }

}
