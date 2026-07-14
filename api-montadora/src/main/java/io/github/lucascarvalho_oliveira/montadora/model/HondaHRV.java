package io.github.lucascarvalho_oliveira.montadora.model;

import io.github.lucascarvalho_oliveira.montadora.model.enums.Montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);

        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
