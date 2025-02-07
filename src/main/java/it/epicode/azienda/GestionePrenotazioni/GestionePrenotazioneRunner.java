package it.epicode.azienda.GestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import postazione.Postazione;
import postazione.PostazioneRepository;

import java.util.List;

@Component
public class GestionePrenotazioneRunner implements CommandLineRunner {
    @Override
    public void run(String... args){
        @Autowired
        PostazioneRepository postazioneRepository;
        List<Postazione> postazioni = postazioneRepository.findAll();
        postazioni.forEach(System.out::println);

    }
}
