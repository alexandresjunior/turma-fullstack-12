package br.com.treina.recife.sgp.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.enums.StatusProjeto;


@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    List<Projeto> findByNomeContainingIgnoreCase(String nome);

    List<Projeto> findByDataInicioBetween(LocalDate dataInicio, LocalDate dataFinal);

    List<Projeto> findByStatus(StatusProjeto status);           // --> RequestParam

    List<Projeto> findByResponsavel_Id(Long usuarioRespId);     // --> PathVariable
    
}
