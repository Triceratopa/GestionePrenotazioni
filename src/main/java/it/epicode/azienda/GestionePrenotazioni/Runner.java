package it.epicode.azienda.GestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import postazione.PostazioneRepository;
import prenotazioni.PrenotazioneRepository;
import utente.Utente;
import utente.UtenteRepository;

import java.util.Scanner;

public class Runner implements CommandLineRunner {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PostazioneRepository postazioneRepository;

    @Override
    public void run(String... args) throws Exception {
Scanner scanner= new Scanner(System.in);
//Creazione per la postazione


    }
}
