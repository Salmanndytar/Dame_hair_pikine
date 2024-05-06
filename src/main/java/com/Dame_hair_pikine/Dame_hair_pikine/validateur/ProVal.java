package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.ProduitDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.StockDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ProVal {
    public static List<String> validate(ProduitDto produitDto){
    List<String> errors = new ArrayList<>();
        if (!StringUtils.hasLength(produitDto.getName())){
        errors.add("Veillez ajouter nom produit");
    }

    if (produitDto.getName() == null){
        errors.add("Veillez selectionner au moins un produit");
    }
    if (produitDto.getCategori() == null){
        errors.add("Veillez selectionner une categorie");
    }

        return  errors;
}
    public static List<String> validateId(RoleDto roleDto){
        List<String> errors = new ArrayList<>();
        if (roleDto.getId()== null ){
            errors.add("Veillez entrer identifiant produit");
        }
        return  errors;
    }
}
