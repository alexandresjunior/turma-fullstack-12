package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public record DadosProjeto(
    Long id,
    String nome,
    String descricao,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataInicio,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataConclusao,
    String status,
    Long idResponsavel,
    String nomeResponsavel,
    List<DadosTarefa> tarefas
) {
    
}
