package com.desafio.condominio.controller;

import com.desafio.condominio.dao.entity.PautaEntity;
import com.desafio.condominio.dao.entity.VotacaoEntity;
import com.desafio.condominio.dto.ResultadoVotacaoDTO;
import com.desafio.condominio.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PautaController {
    @Autowired
    private PautaService pautaService;

    @GetMapping("/pautas")
    public List<PautaEntity> listarTodos() {
        return pautaService.listarTodos();
    }
    @GetMapping("/pautas/{id}")
    public PautaEntity obtenerUm(@PathVariable(value = "id") int codigo) {
        return pautaService.obtenerUm(codigo);
    }

    @PostMapping("/pautas")
    public void cadastrar(@RequestBody PautaEntity ce) {
        pautaService.cadastrar(ce);
    }

    @GetMapping(value = "/pautas/{id}/resultado")
    public ResultadoVotacaoDTO resultado(@PathVariable(value = "id") int codigo) {
        PautaEntity pe= pautaService.obtenerUm(codigo);
        List<VotacaoEntity> votacoes = pe.getSessao().getListVotacoes();
        List<VotacaoEntity> aprovados = votacoes.stream().filter(it->it.getVoto().equalsIgnoreCase("S")).toList();
        ResultadoVotacaoDTO result = ResultadoVotacaoDTO.builder()
                .aprova((aprovados.size()))
                .desaprova(votacoes.size()-aprovados.size())
                .build();
        return result;
    }
}
