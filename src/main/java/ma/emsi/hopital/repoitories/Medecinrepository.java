package ma.emsi.hopital.repoitories;

import ma.emsi.hopital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medecinrepository extends JpaRepository<Medecin,Long> {

    Medecin findByNom(String nom);

}
