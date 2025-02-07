package edificio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EdificioConfig {
    @Bean
    public Edificio getEdificioA(){
        Edificio edificioA = new Edificio();
        getEdificioA().setNome("Edificio A");
        getEdificioA().setIndirizzo("Via Costa Calcinara, 1");
        getEdificioA().setCitta("Monselice");
        return getEdificioA();
    }
    @Bean
    public Edificio getEdificioB(){
        Edificio edificioB = new Edificio();
        getEdificioB().setNome("Edificio B");
        getEdificioB().setIndirizzo("Via Giotto, 63");
        getEdificioB().setCitta("Scandicci");
        return getEdificioB();
    }
    @Bean
    public Edificio getEdificioC(){
        Edificio edificioC = new Edificio();
        getEdificioC().setNome("Edificio C");
        getEdificioC().setIndirizzo("Via Ghiacciaia, 11");
        getEdificioC().setCitta("Padova");
        return getEdificioC();
    }
}
