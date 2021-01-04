package pl.monikamisiewicz.mygarden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.mygarden.model.Plant;
import pl.monikamisiewicz.mygarden.repository.PlantRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;

    public List<Plant> getPlants() {
        return plantRepository.findAll();
    }

    public void save(Plant plant) {
        plantRepository.save(plant);
    }

    public Optional<Plant> findById(Long id) {
        return plantRepository.findById(id);
    }

    public void delete(Long id) {
        plantRepository.deleteById(id);
    }

    public long countAllPlants() {
        return plantRepository.count();
    }

    public Set<Plant> findByName(String name) {
        return plantRepository.findByNameContaining(name);
    }

}
