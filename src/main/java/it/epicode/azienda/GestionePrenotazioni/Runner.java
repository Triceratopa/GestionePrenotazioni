package it.epicode.azienda.GestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import postazione.Postazione;
import postazione.PostazioneRepository;
import postazione.TipoPostazione;
import prenotazioni.Prenotazione;
import prenotazioni.PrenotazioneRepository;
import utente.Utente;
import utente.UtenteRepository;

import java.time.LocalDate;
import java.util.Scanner;
@Component
public class Runner implements CommandLineRunner {
private final Scanner scanner = new Scanner(System.in);
private final UtenteRepository utenteRepository;
private final PrenotazioneRepository prenotazioneRepository;
private final PostazioneRepository postazioneRepository;

    public Runner(UtenteRepository utenteRepository, PrenotazioneRepository prenotazioneRepository, PostazioneRepository postazioneRepository) {
        this.utenteRepository = utenteRepository;
        this.prenotazioneRepository = prenotazioneRepository;
        this.postazioneRepository = postazioneRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Vuoi creare un nuovo utente? (s/n)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("s")) {
            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Nome completo: ");
            String nomeCompleto = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();

            Utente utente = new Utente(username, nomeCompleto, email);
            utenteRepository.save(utente);

            System.out.println("Utente creato con successo! ID: " + utente.getId());
    }
        System.out.println("Vuoi creare una nuova postazione? (s/n)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("s")) {
            System.out.println("Descrizione: ");
            String descrizione = scanner.nextLine();
            System.out.println("Tipo (PRIVATO, OPEN_SPACE, SALA_RIUNIONI): ");
            String tipo = scanner.nextLine().toUpperCase();
            System.out.println("Capienza: ");
            int capienza = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea rimasta nel buffer

            Postazione postazione = new Postazione(descrizione, TipoPostazione.valueOf(tipo), capienza);
            postazioneRepository.save(postazione);

            System.out.println("Postazione creata con successo! ID: " + postazione.getId());
        }
        System.out.println("Vuoi effettuare una prenotazione? (s/n)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("s")) {
            System.out.println("Inserisci ID Utente:");
            Long idUtente = Long.parseLong(scanner.nextLine());
            System.out.println("Inserisci ID Postazione:");
            Long idPostazione = Long.parseLong(scanner.nextLine());
            System.out.println("Inserisci Data Prenotazione (YYYY-MM-DD):");
            LocalDate data = LocalDate.parse(scanner.nextLine());

            Utente utente = utenteRepository.findById(idUtente).orElse(null);
            Postazione postazione = postazioneRepository.findById(idPostazione).orElse(null);

            if (utente == null || postazione == null) {
                System.out.println("Errore: Utente o Postazione non trovati.");
                return;
            }

            Prenotazione prenotazione = new Prenotazione(utente, postazione, data);
            prenotazioneRepository.save(prenotazione);

            System.out.println("Prenotazione effettuata con successo! ID: " + prenotazione.getId());
        }
}}

