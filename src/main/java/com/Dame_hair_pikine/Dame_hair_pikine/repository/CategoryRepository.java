package com.Dame_hair_pikine.Dame_hair_pikine.repository;

import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findCategoryByName(String nomCategory);

}
