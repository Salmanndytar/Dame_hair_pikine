package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtiVal {
    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();
        if (!StringUtils.hasLength(utilisateurDto.getName())){
            errors.add("Veillez entrer le nom");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMail())){
            errors.add("Veillez entrer le mail");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veillez entrer le prenm");
        }
        return  errors;
    }
    public static List<String> validateId(RoleDto roleDto){
        List<String> errors = new ArrayList<>();
        if (roleDto.getId()== null ){
            errors.add("Veillez entrer identifiant User");
        }
        return  errors;
    }
}
