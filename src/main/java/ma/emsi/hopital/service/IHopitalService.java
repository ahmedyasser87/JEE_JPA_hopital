package ma.emsi.hopital.service;
import ma.emsi.hopital.entities.Consultation;
import ma.emsi.hopital.entities.Medecin;
import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.entities.Rendezvous;
import org.springframework.stereotype.Service;

@Service
public interface IHopitalService {





        Patient savePatient(Patient patient);
        Medecin saveMedecin(Medecin medecin);
        Rendezvous saveRDV(Rendezvous rendezVous);
        Consultation saveConsultation(Consultation consultation);

    }


