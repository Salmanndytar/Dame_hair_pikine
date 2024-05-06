package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.UtilisateurDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.VenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenVal {
    public static List<String> validate(VenteDto venteDto){
        List<String> errors = new ArrayList<>();
        if (venteDto.getListedeDetail().size() == 0){
            errors.add("Veillez selectionner un prduit");
        }

        return  errors;
    }
    public static List<String> validateId(RoleDto roleDto){
        List<String> errors = new ArrayList<>();
        if (roleDto.getId()== null ){
            errors.add("Veillez entrer identifiant vente");
        }
        return  errors;
    }
}
