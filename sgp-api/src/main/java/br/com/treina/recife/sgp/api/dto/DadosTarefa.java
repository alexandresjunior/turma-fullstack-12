package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record DadosTarefa(
    Long id,
    String titulo,
    String descricao,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataCriacao,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataConclusao,
    String prioridade,
    String status,
    Long idProjeto,
    String nomeProjeto,
    Long idUsuario,
    String nomeUsuario
) {
    
}
