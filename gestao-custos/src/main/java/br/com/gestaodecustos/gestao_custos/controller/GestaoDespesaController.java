package br.com.gestaodecustos.gestao_custos.controller;

import br.com.gestaodecustos.gestao_custos.custom_messages.ErrorMessage;
import br.com.gestaodecustos.gestao_custos.entity.Despesa;
import br.com.gestaodecustos.gestao_custos.useCases.CadastroDespesaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> create(@RequestBody Despesa despesa) {

        try {
            var result = cadastroDespesaUseCase.execute(despesa);
            return ResponseEntity.ok(result);
        }catch(IllegalArgumentException e){

            var errorMessage = new ErrorMessage(e.getMessage(), "INVALID_PARAMS");

            return ResponseEntity.status(400).body(errorMessage);
        }

    }

}
