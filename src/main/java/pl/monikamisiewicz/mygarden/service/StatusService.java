package pl.monikamisiewicz.mygarden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.mygarden.model.Status;
import pl.monikamisiewicz.mygarden.repository.StatusRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StatusService {

    private final StatusRepository statusRepository;

    public List<Status> getStatuses() {
        return statusRepository.findAll();
    }

    public void save(Status status) {
        statusRepository.save(status);
    }

    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    public void delete(Long id) {
        statusRepository.deleteById(id);
    }


}
