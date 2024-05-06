package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CatVal {
    public static List<String> validate(CategoryDto categorieDto){
        List<String> errors = new ArrayList<>();
        if (!StringUtils.hasLength(categorieDto.getName())){
            errors.add("Veillez entrer nom categorie");
        }
        return  errors;
    }
    public static List<String> validateId(CategoryDto categorieDto){
        List<String> errors = new ArrayList<>();
        if (categorieDto.getId()== null ){
            errors.add("Veillez entrer identifiant Categorie");
        }
        return  errors;
    }
}
