package io.github.mateusmarquessz.arquiteturasspring.montadora.configuration;


import io.github.mateusmarquessz.arquiteturasspring.montadora.Motor;
import io.github.mateusmarquessz.arquiteturasspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //Serve para anotar como essa classe como configuration
public class MontadoraConfiguration {


    @Bean(name = "motorAspirado") // nao eh obrigatorio pois o Bean pega o nome do metodo com padrao
    public Motor motorAspirado(){
       var motor = new Motor();
       motor.setCavalos(120);
       motor.setCilindos(4);
       motor.setModel("XPTO-0");
       motor.setLitragem(2.0);
       motor.setTipo(TipoMotor.ASPIRADO);
       return motor;
    }

    @Bean
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindos(3);
        motor.setModel("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    @Primary // Essa anotacao diz qual eh o Bean primario!
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindos(4);
        motor.setModel("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
