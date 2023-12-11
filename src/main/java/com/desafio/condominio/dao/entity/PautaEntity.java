package com.desafio.condominio.dao.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pauta")
public class PautaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @Column(name="dt_criacao")
    private LocalDateTime dtCriacao;
    private Integer estado;

    @OneToOne(mappedBy = "pauta", fetch = FetchType.LAZY)
    private SessaoVotacaoEntity sessao;

    @JsonManagedReference
    public SessaoVotacaoEntity getSessao(){
        return sessao;
    }
}