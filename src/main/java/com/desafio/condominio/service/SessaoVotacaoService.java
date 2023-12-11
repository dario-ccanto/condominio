package com.desafio.condominio.service;

import com.desafio.condominio.dao.entity.SessaoVotacaoEntity;
import java.util.List;

public interface SessaoVotacaoService {
    public List<SessaoVotacaoEntity> listarTodos();
    public SessaoVotacaoEntity obtenerUm(int codigo);
    public void cadastrar(SessaoVotacaoEntity ce);
}
