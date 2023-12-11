package com.desafio.condominio.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultadoVotacaoDTO {
    private Integer aprova;
    private Integer desaprova;
}
