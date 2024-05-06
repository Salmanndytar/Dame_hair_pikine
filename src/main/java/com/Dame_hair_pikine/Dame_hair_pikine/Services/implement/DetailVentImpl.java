package com.Dame_hair_pikine.Dame_hair_pikine.Services.implement;

import com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces.IDetailVente;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.DetaiVenteDto;
import com.Dame_hair_pikine.Dame_hair_pikine.exception.ErrorCodes;
import com.Dame_hair_pikine.Dame_hair_pikine.exception.InvalidEntityException;
import com.Dame_hair_pikine.Dame_hair_pikine.model.DetailVent;
import com.Dame_hair_pikine.Dame_hair_pikine.repository.DetailVentRepositry;
import com.Dame_hair_pikine.Dame_hair_pikine.validateur.CatVal;
import com.Dame_hair_pikine.Dame_hair_pikine.validateur.DetVenVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailVentImpl implements IDetailVente {
    DetailVentRepositry detailVentRepositry;
   @Autowired
    public DetailVentImpl(DetailVentRepositry detailVentRepositry) {
        this.detailVentRepositry = detailVentRepositry;
    }

    @Override
    public DetaiVenteDto save(DetaiVenteDto detailleDto) {
        List<String> errors = DetVenVal.validate(detailleDto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("Info vent n'est pas valide", ErrorCodes.CATEGORIE_NOT_VALID ,errors);
        }
        return DetaiVenteDto.fromEntity( detailVentRepositry.save(DetaiVenteDto.toEntity(detailleDto)));
    }

    @Override
    public DetaiVenteDto finById(Integer id) {
        return null;
    }

    @Override
    public List<DetaiVenteDto> detailleRepasByVent(Integer id) {
        return null;
    }

    @Override
    public List<DetaiVenteDto> detailleRepasByProduit(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
