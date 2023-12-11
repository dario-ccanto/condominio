package com.desafio.condominio.controller;

import com.desafio.condominio.dao.entity.VotacaoEntity;
import com.desafio.condominio.service.VotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VotacaoController {

    @Autowired
    private VotacaoService votacaoService;

    @PostMapping("/votacoes")
    public void votacao(@RequestBody VotacaoEntity ce) {
        votacaoService.cadastrar(ce);
    }
}
