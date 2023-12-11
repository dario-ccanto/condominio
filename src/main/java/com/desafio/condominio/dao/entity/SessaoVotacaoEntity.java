package com.desafio.condominio.dao.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

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

    @OneToMany(mappedBy = "sessaoVotacao", fetch = FetchType.LAZY)
    private List<VotacaoEntity> listVotacoes;
    @JsonBackReference
    public PautaEntity getPauta(){
        return pauta;
    }

    @JsonManagedReference
    public List<VotacaoEntity> getListVotacoes(){
        return listVotacoes;
    }
}