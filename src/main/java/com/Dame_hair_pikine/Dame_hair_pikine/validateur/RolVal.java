package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.CategoryDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RolVal {
    public static List<String> validate(RoleDto rolDto){
        List<String> errors = new ArrayList<>();
        if (!StringUtils.hasLength(rolDto.getNamerole())){
            errors.add("Veillez entrer nom categorie");
        }
        return  errors;
    }
    public static List<String> validateId(RoleDto roleDto){
        List<String> errors = new ArrayList<>();
        if (roleDto.getId()== null ){
            errors.add("Veillez entrer identifiant Categorie");
        }
        return  errors;
    }
}
