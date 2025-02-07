package postazione;

import edificio.Edificio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazioni")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String descrizione;
    private int numeroMaxPosti;
    @Enumerated(jakarta.persistence.EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private Edificio edificio;
}
