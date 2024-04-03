package ma.emsi.hopital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private boolean annule;
    private StatusRDV status ;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin ;
    @OneToOne (mappedBy = "rendezvous")
    private Consultation consultation;

}
