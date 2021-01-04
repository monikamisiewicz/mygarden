package pl.monikamisiewicz.mygarden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.mygarden.model.BloomTime;
import pl.monikamisiewicz.mygarden.repository.BloomTimeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BloomTimeService {

    private final BloomTimeRepository bloomTimeRepository;

    public List<BloomTime> getBloomTimes() {
        return bloomTimeRepository.findAll();
    }

    public void save(BloomTime bloomTime) {
        bloomTimeRepository.save(bloomTime);
    }

    public Optional<BloomTime>  findById(Long id) {
        return bloomTimeRepository.findById(id);
    }

    public void delete(Long id) {
        bloomTimeRepository.deleteById(id);
    }
}
