package com.desafio.condominio.service.impl;

import com.desafio.condominio.dao.entity.PautaEntity;
import com.desafio.condominio.dao.repository.PautaRepository;
import com.desafio.condominio.service.PautaService;
import com.desafio.condominio.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PautaServiceImpl implements PautaService {
    @Autowired
    private PautaRepository pautaRepository;

    @Override
    public List<PautaEntity> listarTodos() {
        return pautaRepository.findAll();
    }

    @Override
    public PautaEntity obtenerUm(int codigo) {
        return pautaRepository.findById(codigo).get();
    }

    @Override
    public void cadastrar(PautaEntity ce) {
        ce.setDtCriacao(LocalDateTime.now());
        ce.setEstado(Constants.ATIVO);
        pautaRepository.save(ce);
    }
}
