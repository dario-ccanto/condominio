package com.desafio.condominio.controller;

import com.desafio.condominio.dao.entity.PautaEntity;
import com.desafio.condominio.dao.entity.SessaoVotacaoEntity;
import com.desafio.condominio.service.PautaService;
import com.desafio.condominio.service.SessaoVotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class SessaoVotacaoController {
    @Autowired
    private SessaoVotacaoService sessaoVotacaoService;

    @GetMapping("/sessoes")
    public List<SessaoVotacaoEntity> listarTodos() {
        return sessaoVotacaoService.listarTodos();
    }

    @GetMapping("/sessoes/{id}")
    public SessaoVotacaoEntity obtenerUm(@PathVariable(value = "id") int codigo) {
        return sessaoVotacaoService.obtenerUm(codigo);
    }

    @PostMapping("/sessoes")
    public void aberturaSessaoVotacao(@RequestBody SessaoVotacaoEntity ce) {
        sessaoVotacaoService.cadastrar(ce);
    }
}
