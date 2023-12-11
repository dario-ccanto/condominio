package com.desafio.condominio.dao.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sessao_votacao")
public class SessaoVotacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "pauta_id", referencedColumnName = "id")
    private PautaEntity pauta;

    @Column(name="tempo_votacao")
    private Integer tempo;

    @Column(name="dt_abertura")
    private LocalDateTime dtAbertura;
}