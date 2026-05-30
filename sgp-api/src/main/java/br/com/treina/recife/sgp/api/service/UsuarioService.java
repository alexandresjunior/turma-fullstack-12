package br.com.treina.recife.sgp.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // INSERT INTO TB_USUARIOS ... VALUES ... (SE NÃO TIVER ID VALORADO)
    // UPDATE TB_USUARIOS ... VALUES ... (SE FOR PASSADO UM ID VÁLIDO)
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // SELECT * FROM TB_USUARIOS
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // SELECT * FROM TB_USUARIOS WHERE id = ?
    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // DELETE FROM TB_USUARIOS WHERE id = ?
    public void excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
    
}
