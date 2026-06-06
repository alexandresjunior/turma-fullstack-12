package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record DadosUsuario(
    Long id,
    String nome,
    String email,
    String cpf,
    Integer idade,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataNascimento,
    String status
) {
    
}

