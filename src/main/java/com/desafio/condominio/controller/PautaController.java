package com.desafio.condominio.controller;

import com.desafio.condominio.dao.entity.PautaEntity;
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
}
