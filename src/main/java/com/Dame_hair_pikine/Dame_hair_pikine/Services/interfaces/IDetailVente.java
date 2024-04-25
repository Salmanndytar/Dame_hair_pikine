package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.DetaiVenteDto;

import java.util.List;

public interface IDetailVente {
    DetaiVenteDto save(DetaiVenteDto detaille);
    DetaiVenteDto finById(Integer id);
    List<DetaiVenteDto> detailleRepasByVent(Integer id);
    List<DetaiVenteDto> detailleRepasByProduit(Integer id);
    void delete(Integer id);
}
