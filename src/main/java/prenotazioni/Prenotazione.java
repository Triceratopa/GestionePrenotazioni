package prenotazioni;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import postazione.Postazione;
import utente.Utente;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private String ora;
    @ManyToMany
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    public Prenotazione(Utente utente, Postazione postazione, LocalDate data) {
        this.utente=utente;
        this.postazione=postazione;
        this.data= data;
    }
}
