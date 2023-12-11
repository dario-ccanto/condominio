package com.desafio.condominio.dao.repository;

import com.desafio.condominio.dao.entity.VotacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VotacaoRepository extends JpaRepository<VotacaoEntity, Integer> {

    VotacaoEntity findByCpfEquals(String cpf);
}