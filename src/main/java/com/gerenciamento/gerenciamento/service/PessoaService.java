package com.gerenciamento.gerenciamento.service;

import com.gerenciamento.gerenciamento.entity.Pessoa;

import java.util.List;

public interface PessoaService {

    List<Pessoa> buscarTodasPessoas();

    Pessoa buscarPorId(Long id);

    void criarPessoa(Pessoa pessoa);

    void atualizaPessoa();

    void removePessoa();
}
