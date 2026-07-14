package io.github.lucascarvalho_oliveira.montadora.controller;

import io.github.lucascarvalho_oliveira.montadora.model.CarroStatus;
import io.github.lucascarvalho_oliveira.montadora.model.Chave;
import io.github.lucascarvalho_oliveira.montadora.model.HondaHRV;
import io.github.lucascarvalho_oliveira.montadora.model.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fabrica")
public class FabricaController {

    @Autowired
    // @Qualifier("motorEletrico")
    private Motor motor;

    @PostMapping
    public CarroStatus LigarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
