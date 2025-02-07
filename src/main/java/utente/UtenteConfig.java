package utente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtenteConfig {
    @Bean
    public Utente getUtenteA() {
        Utente utenteA = new Utente();
        utenteA.setUsername("utenteA");
        utenteA.setNomeCompleto("Valentina Cortelazzo");
        utenteA.setEmail("utenteA@utenteA.it");
        return utenteA;
    }
    @Bean
    public Utente getUtenteB() {
        Utente utenteB = new Utente();
        utenteB.setUsername("utenteB");
        utenteB.setNomeCompleto("Giuliano Torrisi");
        utenteB.setEmail("utenteB@utenteB.it");
        return utenteB;
    }
    @Bean
    public Utente getUtenteC() {
        Utente utenteC = new Utente();
        utenteC.setUsername("utenteC");
        utenteC.setNomeCompleto("Valerio Giacchini");
        utenteC.setEmail("utenteC@utenteC.it");
        return utenteC;
    }
    @Bean
    public Utente getUtenteD() {
        Utente utenteD = new Utente();
        utenteD.setUsername("utenteD");
        utenteD.setNomeCompleto("Ronnie Radke");
        utenteD.setEmail("utenteD@utenteD.it");
        return utenteD;
    }
    @Bean
    public Utente getUtenteE() {
        Utente utenteE = new Utente();
        utenteE.setUsername("utenteE");
        utenteE.setNomeCompleto("Alessia Sovini");
        utenteE.setEmail("utenteE@utenteE.it");
        return utenteE;
    }
}
