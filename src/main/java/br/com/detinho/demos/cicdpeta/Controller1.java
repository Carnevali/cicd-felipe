package br.com.detinho.demos.cicdpeta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/teste")
    public ResponseEntity<Retorno> teste() {
        Retorno retorno = new Retorno("Marcos", 32L, "Programador");
        return ResponseEntity.ok(retorno);
    }

    @GetMapping("/teste2")
    public ResponseEntity<Retorno> teste2() {
        Retorno retorno = new Retorno("Joao", 50L, "Aspone");
        return ResponseEntity.ok(retorno);
    }

}
