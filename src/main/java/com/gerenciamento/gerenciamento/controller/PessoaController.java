package com.gerenciamento.gerenciamento.controller;

import com.gerenciamento.gerenciamento.entity.Pessoa;
import com.gerenciamento.gerenciamento.service.PessoaService;
import com.gerenciamento.gerenciamento.service.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerenciamento/api")
public class PessoaController {

    //Verbos HTTP
    /*
    GET - Buscar
    POST - Criar ou Atualizar
    PUT - Atualizar
    DELETE - Remover
     */


    @Autowired
    private PessoaService pessoaService;


    @GetMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> buscarTodasPessoas() {
        return ResponseEntity.ok(pessoaService.buscarTodasPessoas());
    }

    @GetMapping("/pessoas/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.buscarPorId(id));
    }

    @PostMapping("/pessoas/cadastra")
    public ResponseEntity<?> createUser(@RequestBody Pessoa pessoa) {
        pessoaService.criarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }

}
