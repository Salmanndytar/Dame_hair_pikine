package com.Dame_hair_pikine.Dame_hair_pikine.Services.implement;

import com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces.IVente;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.ProduitDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.UtilisateurDto;
import com.Dame_hair_pikine.Dame_hair_pikine.dto.VenteDto;

import java.time.Instant;
import java.util.List;

public class VenteImpl implements IVente {
    @Override
    public VenteDto saveVent(VenteDto venteDto) {
        return null;
    }

    @Override
    public VenteDto editeVent(VenteDto venteDto) {
        return null;
    }

    @Override
    public void annuleVente(Integer integer) {

    }

    @Override
    public List<VenteDto> listVent(Instant date, UtilisateurDto user, ProduitDto produitDto, float prixVente) {
        return null;
    }
}
