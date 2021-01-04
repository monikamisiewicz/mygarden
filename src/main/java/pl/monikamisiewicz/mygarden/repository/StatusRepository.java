package pl.monikamisiewicz.mygarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.mygarden.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
