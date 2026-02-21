package br.com.gestaodecustos.gestao_custos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class PrimeiraController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Olá Mundo! - Primeira Aula!";
    }
}
