package com.desafio.condominio.service.impl;

import com.desafio.condominio.dao.entity.VotacaoEntity;
import com.desafio.condominio.dao.repository.VotacaoRepository;
import com.desafio.condominio.service.VotacaoService;
import com.desafio.condominio.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VotacaoServiceImpl implements VotacaoService {

    @Autowired
    private VotacaoRepository votacaoRepository;

    @Override
    public void cadastrar(VotacaoEntity ce) {
        VotacaoEntity votacao = votacaoRepository.findByCpfEquals(ce.getCpf());
        if(votacao!=null){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "A pessoa só pode votar um vez para a sessão");

        }
        ce.setDtCriacao(LocalDateTime.now());
        votacaoRepository.save(ce);
    }
}
