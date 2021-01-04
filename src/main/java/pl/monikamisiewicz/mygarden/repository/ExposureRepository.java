package pl.monikamisiewicz.mygarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.mygarden.model.Exposure;

public interface ExposureRepository extends JpaRepository<Exposure, Long> {
}
