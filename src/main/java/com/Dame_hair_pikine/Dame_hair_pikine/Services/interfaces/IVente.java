package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.ProduitDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.UtilisateurDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.VenteDto;

import java.time.Instant;
import java.util.List;

public interface IVente {
    VenteDto saveVent(VenteDto venteDto);
    VenteDto editeVent(VenteDto venteDto);
    void annuleVente(Integer integer);

    List<VenteDto> listVent(Instant date, UtilisateurDto user, ProduitDto produitDto, float prixVente);

}
