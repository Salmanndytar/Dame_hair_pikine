package com.Dame_hair_pikine.Dame_hair_pikine.validateur;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.DetaiVenteDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.StockDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class StoVal {
    public static List<String> validate(StockDto stockDto){
        List<String> errors = new ArrayList<>();
        if (stockDto.getQuantitestock() == null){
            errors.add("Veillez ajouter une quantité");
        }
        if (stockDto.getProduit() == null){
            errors.add("Veillez selectionner au moins un produit");
        }
        if (stockDto.getPrixunit()== null){
            errors.add("Veillez saisir le prix unitaire");
        }
        if (stockDto.getPrixvente() == null){
            errors.add("Veillez saisir le prix vente");
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
