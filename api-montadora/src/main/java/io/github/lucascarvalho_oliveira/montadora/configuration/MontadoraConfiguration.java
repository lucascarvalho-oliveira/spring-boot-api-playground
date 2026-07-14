package io.github.lucascarvalho_oliveira.montadora.configuration;

import io.github.lucascarvalho_oliveira.montadora.model.Motor;
import io.github.lucascarvalho_oliveira.montadora.model.enums.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean
    @Primary
    public Motor motorAspirado(){
        var motor = new Motor();

        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);

        return motor;
    }

    @Bean
    public Motor motorEletrico(){
        var motor = new Motor();

        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-10");
        motor.setLitragem(1.4);
        motor.setTipoMotor(TipoMotor.ELETRICO);

        return motor;
    }

    @Bean
    public Motor motorTurbo(){
        var motor = new Motor();

        motor.setCavalos(200);
        motor.setCilindros(6);
        motor.setModelo("XPTO-1");
        motor.setLitragem(3.0);
        motor.setTipoMotor(TipoMotor.TURBO);

        return motor;
    }
}
