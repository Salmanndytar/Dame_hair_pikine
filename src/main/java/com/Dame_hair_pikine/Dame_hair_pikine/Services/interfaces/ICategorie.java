package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;

public interface ICategorie {
    CategoryDto addCat(CategoryDto categoryDto);
    CategoryDto editCat(CategoryDto categoryDto);
    void deleteCat(Integer id);

}
