package pl.monikamisiewicz.mygarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.mygarden.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
