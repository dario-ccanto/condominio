package com.desafio.condominio.service.impl;

import com.desafio.condominio.dao.entity.PautaEntity;
import com.desafio.condominio.dao.entity.SessaoVotacaoEntity;
import com.desafio.condominio.dao.repository.SessaoVotacaoRepository;
import com.desafio.condominio.service.SessaoVotacaoService;
import com.desafio.condominio.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SessaoVotacaoServiceImpl implements SessaoVotacaoService {
    @Autowired
    private SessaoVotacaoRepository sessaoVotacaoRepository;

    @Override
    public List<SessaoVotacaoEntity> listarTodos() {
        return sessaoVotacaoRepository.findAll();
    }

    @Override
    public SessaoVotacaoEntity obtenerUm(int codigo) {
        return sessaoVotacaoRepository.findById(codigo).get();
    }

    @Override
    public void cadastrar(SessaoVotacaoEntity ce) {
        ce.setDtAbertura(LocalDateTime.now());
        ce.setTempo(ce.getTempo()!=null?ce.getTempo():Constants.DEFAULT_TEMPO_VOTACAO);
        sessaoVotacaoRepository.save(ce);
    }
}
