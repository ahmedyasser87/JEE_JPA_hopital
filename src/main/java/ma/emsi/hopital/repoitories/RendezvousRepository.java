package ma.emsi.hopital.repoitories;

import ma.emsi.hopital.entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository extends JpaRepository<Rendezvous,Long> {
}
