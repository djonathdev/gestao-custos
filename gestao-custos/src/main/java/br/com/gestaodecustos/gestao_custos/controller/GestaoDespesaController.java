package br.com.gestaodecustos.gestao_custos.controller;

import br.com.gestaodecustos.gestao_custos.entity.Despesa;
import br.com.gestaodecustos.gestao_custos.useCases.CadastroDespesaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/gestao")
@RestController
public class GestaoDespesaController {

    /*
    * - Cadastro de despesa
    * - Criar tabela no banco de dados
    * - Criar entidade
    */

    @Autowired
    CadastroDespesaUseCase cadastroDespesaUseCase;
    @PostMapping("/create")
    public void create(@RequestBody Despesa despesa) {

        cadastroDespesaUseCase.execute(despesa);

    }

}
