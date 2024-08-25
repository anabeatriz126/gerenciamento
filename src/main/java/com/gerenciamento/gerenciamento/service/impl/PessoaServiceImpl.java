package com.gerenciamento.gerenciamento.service.impl;

import com.gerenciamento.gerenciamento.entity.Pessoa;
import com.gerenciamento.gerenciamento.repository.PessoaRepository;
import com.gerenciamento.gerenciamento.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> buscarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.get();
    }

    @Override
    public void criarPessoa(Pessoa pessoa) {
        //TODO: criar validações
        pessoaRepository.save(pessoa);
    }

    @Override
    public void atualizaPessoa() {

    }

    @Override
    public void removePessoa() {

    }
}
