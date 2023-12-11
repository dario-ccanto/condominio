package com.desafio.condominio.service;

import com.desafio.condominio.dao.entity.PautaEntity;
import java.util.List;

public interface PautaService {
    public List<PautaEntity> listarTodos();
    public PautaEntity obtenerUm(int codigo);
    public void cadastrar(PautaEntity ce);
}
