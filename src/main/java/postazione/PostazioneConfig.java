package postazione;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostazioneConfig {
    @Bean
    public Postazione getPostazioneA() {
        Postazione postazioneA = new Postazione();
        postazioneA.setDescrizione("Postazione A");
        postazioneA.setNumeroMaxPosti(10);
        postazioneA.setTipoPostazione(TipoPostazione.PRIVATO);
        return postazioneA;
    }
    @Bean
    public Postazione getPostazioneB() {
        Postazione postazioneB = new Postazione();
        postazioneB.setDescrizione("Postazione B");
        postazioneB.setNumeroMaxPosti(20);
        postazioneB.setTipoPostazione(TipoPostazione.OPEN_SPACE);
        return postazioneB;
    }
    @Bean
    public Postazione getPostazioneC() {
        Postazione postazioneC = new Postazione();
        postazioneC.setDescrizione("Postazione C");
        postazioneC.setNumeroMaxPosti(30);
        postazioneC.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
        return postazioneC;
    }
    @Bean
    public Postazione getPostazioneD() {
        Postazione postazioneD = new Postazione();
        postazioneD.setDescrizione("Postazione D");
        postazioneD.setNumeroMaxPosti(40);
        postazioneD.setTipoPostazione(TipoPostazione.PRIVATO);
        return postazioneD;
    }
}
