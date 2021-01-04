package pl.monikamisiewicz.mygarden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.mygarden.model.Category;
import pl.monikamisiewicz.mygarden.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRespository;

    public List<Category> getCategories() {
        return categoryRespository.findAll();
    }

    public void save(Category category) {
        categoryRespository.save(category);
    }

    public Optional<Category> findById(Long id) {
        return categoryRespository.findById(id);
    }

    public void delete(Long id) {
        categoryRespository.deleteById(id);
    }
}
