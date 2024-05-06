package com.Dame_hair_pikine.Dame_hair_pikine.Services.implement;

import com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces.ICategorie;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import com.Dame_hair_pikine.Dame_hair_pikine.exception.ErrorCodes;
import com.Dame_hair_pikine.Dame_hair_pikine.exception.InvalidEntityException;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Category;
import com.Dame_hair_pikine.Dame_hair_pikine.repository.CategoryRepository;
import com.Dame_hair_pikine.Dame_hair_pikine.validateur.CatVal;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryImpl implements ICategorie {
    private CategoryRepository categoryRepository;
    @Autowired
    public CategoryImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto addCat(CategoryDto categoryDto) {
        List<String> errors = CatVal.validate(categoryDto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("Le gategorie n'est pas valide", ErrorCodes.CATEGORIE_NOT_VALID,errors);
        }
       Category cat = categoryRepository.save(CategoryDto.toEntity(categoryDto));
        return  CategoryDto.fromEntity(cat) ;
    }

    @Override
    public CategoryDto editCat(CategoryDto categoryDto) {
        Category cat = categoryRepository.save(CategoryDto.toEntity(categoryDto));
        return  CategoryDto.fromEntity(cat) ;
    }


    @Override
    public void deleteCat(Integer id) {
        id.describeConstable().orElseThrow( ()-> new EntityNotFoundException("operation non valide"));
        categoryRepository.deleteById(id);

    }
}
