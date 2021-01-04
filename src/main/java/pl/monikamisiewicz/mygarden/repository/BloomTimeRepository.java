package pl.monikamisiewicz.mygarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.mygarden.model.BloomTime;

public interface BloomTimeRepository extends JpaRepository<BloomTime, Long> {
}
