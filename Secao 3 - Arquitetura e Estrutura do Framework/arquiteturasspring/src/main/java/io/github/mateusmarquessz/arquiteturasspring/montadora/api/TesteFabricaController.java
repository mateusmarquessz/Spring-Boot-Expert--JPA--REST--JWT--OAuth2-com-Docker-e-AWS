package io.github.mateusmarquessz.arquiteturasspring.montadora.api;

import io.github.mateusmarquessz.arquiteturasspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired //Ela vai no container do spring e da a instacia de motor
    //@Qualifier("motorTurbo") // Serve para indicar qual Bean eu quero utilizar
    //@Aspirado Isso evitar eu errar o nome do Bean
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
