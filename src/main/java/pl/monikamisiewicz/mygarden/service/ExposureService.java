package pl.monikamisiewicz.mygarden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.mygarden.model.Exposure;
import pl.monikamisiewicz.mygarden.repository.ExposureRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExposureService {

    private final ExposureRepository exposureRepository;

    public List<Exposure> getExposures() {
        return exposureRepository.findAll();
    }

    public void save(Exposure exposure) {
        exposureRepository.save(exposure);
    }

    public Optional<Exposure> findById(Long id) {
        return exposureRepository.findById(id);
    }

    public void delete (Long id) {
        exposureRepository.deleteById(id);
    }
}
