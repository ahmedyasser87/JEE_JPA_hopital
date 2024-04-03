package ma.emsi.hopital.service;


import jakarta.transaction.Transactional;
import ma.emsi.hopital.entities.Consultation;
import ma.emsi.hopital.entities.Medecin;
import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.entities.Rendezvous;
import ma.emsi.hopital.repoitories.ConsultationReposirotry;
import ma.emsi.hopital.repoitories.Medecinrepository;
import ma.emsi.hopital.repoitories.PatientRepository;
import ma.emsi.hopital.repoitories.RendezvousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HopitalServiceImpl {
    private PatientRepository patientRepository;
    private Medecinrepository medecinRepository;
    private RendezvousRepository rendezVousRepository;
    private ConsultationReposirotry consultationRepository;

    public HopitalServiceImpl(PatientRepository patientRepository, Medecinrepository medecinRepository, RendezvousRepository rendezVousRepository, ConsultationReposirotry consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }



    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }


    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }


    public Rendezvous saveRDV(Rendezvous rendezVous) {
        rendezVous.setId(Long.valueOf(UUID.randomUUID().toString()));
        return rendezVousRepository.save(rendezVous);
    }


    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
