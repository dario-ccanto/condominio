package com.desafio.condominio.service;

import com.desafio.condominio.dao.entity.SessaoVotacaoEntity;
import com.desafio.condominio.dao.entity.VotacaoEntity;

import java.util.List;

public interface SessaoVotacaoService {
    public List<SessaoVotacaoEntity> listarTodos();
    public SessaoVotacaoEntity obtenerUm(int codigo);
    public void cadastrar(SessaoVotacaoEntity ce);
}
