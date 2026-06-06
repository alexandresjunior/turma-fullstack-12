package br.com.treina.recife.sgp.api.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgp.api.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // SELECT * FROM TB_USUARIOS WHERE cpf = ?
    Optional<Usuario> findByCpf(String cpf);
    
    // SELECT * FROM TB_USUARIOS WHERE email = ?
    Optional<Usuario> findByEmail(String email);
    
    // SELECT * FROM TB_USUARIOS WHERE email = ? AND senha = ?
    Optional<Usuario> findByEmailAndSenha(String email, String senha);

    // SELECT * FROM TB_USUARIOS WHERE LOWERCASE(nome) LIKE '%' + ? + '%'
    List<Usuario> findByNomeContainingIgnoreCase(String nome);

    // SELECT * FROM TB_USUARIOS WHERE data_nascimento BETWEEN ? AND ?
    List<Usuario> findByDataNascimentoBetween(LocalDate dataInicio, LocalDate dataFinal);
    
}
