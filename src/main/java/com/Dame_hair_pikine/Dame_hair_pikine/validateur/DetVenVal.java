package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.DetaiVenteDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.VenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DetVenVal {
    public static List<String> validate(DetaiVenteDto venteDto){
        List<String> errors = new ArrayList<>();
        if (venteDto.getStock().getProduit() == null){
            errors.add("Veillez selectionner un prduit");
        }
        if (venteDto.getQuantite() == null){
            errors.add("Veillez entrer quantité de prduit");
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
