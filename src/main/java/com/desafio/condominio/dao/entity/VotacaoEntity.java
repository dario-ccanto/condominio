package com.desafio.condominio.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "votacao")
public class VotacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sessao_votacao_id", referencedColumnName = "id")
    private SessaoVotacaoEntity sessaoVotacao;

    private String cpf;

    private String voto;

    @Column(name="dt_criacao")
    private LocalDateTime dtCriacao;

    @JsonBackReference
    public SessaoVotacaoEntity getSessaoVotacao(){
        return sessaoVotacao;
    }

}